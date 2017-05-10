package com.planarform.daniel.owstats;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel on 3/22/17.
 * This class will ask for the user to enter any battletag and search the stats
 * pertaining to that battletag
 * He or she will also be able to enter a chatroom with other members of the Application
 */
// This class will ask for the user to enter any battletag and search the stats
// the stats pertaining to that battletag
public class SearchController extends Activity implements AdapterView.OnItemSelectedListener {
    static Context context;
    Button searchButton, messengerButton;
    EditText searchBar;
    Spinner platformChooser;
    String input = "";


    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.search_layout);
        context = getApplicationContext();
        OWPlayerManager.getInstance().setContext(context);
        searchButton = (Button)findViewById(R.id.search_button);
        messengerButton = (Button)findViewById(R.id.messenger_button);
        searchBar = (EditText)findViewById(R.id.search_bar);
        platformChooser = (Spinner)findViewById(R.id.platform_chooser);
        Typeface OWFONT = Typeface.createFromAsset(context.getAssets(),  "fonts/big_noodle_titling_oblique.ttf");
        TextView titleView = (TextView)findViewById(R.id.main_title_view);
        titleView.setTypeface(OWFONT);

        // Spinner click listener
        platformChooser.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("US");
        categories.add("EU");
        categories.add("KR");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Aattaching data adapter to spinner
        platformChooser.setAdapter(dataAdapter);

        // I STILL NEED TO LINK SPINNER VALUES TO BUNDLE ...
        String selection = platformChooser.getSelectedItem().toString();
        final String regionSelection = this.getRegionSelection(selection);

        // OnClickListener for button "Search"
        // This button starts the whole stats displaying activity --> StatsController via Intents
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = searchBar.getText().toString();

                if(OWPlayer.isValidBattleTag(input)) {
                    input = input.replace("#","-");
                    String url = "https://owapi.net/api/v3/u/" + input + "/blob";
                    final NetworkingManager networkManager = NetworkingManager.getInstance();

                    networkManager.sendGetRequest(url, new NetworkingListener<String, VolleyError>() {
                        @Override
                        public void onResponse(String response) {
                            try {

                                // Create a rootMap from JSON response from the OWAPI endpoint
                                Map playerMap = OWPlayer.setJSON(response);
                                playerMap.put("battle_tag", input);
                                playerMap.put("region_selection", regionSelection);

                                // Throw rootMap into a HashMap
                                HashMap<String, Object> hashy = new HashMap<String, Object>(playerMap);

                                // Use Intents to send data from SearchController to StatsController
                                Intent intent = new Intent(SearchController.this, StatsController.class);
                                intent.putExtra("player_map", hashy);
                                startActivity(intent);

                            }// Catches Server Request exceptions
                            catch (Exception e) {
                                e.printStackTrace();
                                showAlertToUser(e.getMessage());
                            }
                        }
                        @Override
                        public void onError(VolleyError error) {
                            error.printStackTrace();
                            showAlertToUser("Error: " + error.getMessage());
                        }
                        @Override
                        public void onImageDownloaded(Bitmap b) {

                        }
                    });
                }
                else {
                    //Prompts user that "BattleTag not found, try again"
                    showAlertToUser("BattleTag not found, try again");
                }
            }
        });
        // OnClickListener for the messengerButton
        messengerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = searchBar.getText().toString();
                if(OWPlayer.isValidBattleTag(input)){
                    Intent intent = new Intent(SearchController.this, MessengerActivity.class);
                    intent.putExtra("name", input);
                    startActivity(intent);
                }
                else{
                    showAlertToUser("BattleTag not found, try again");//Prompts user that "BattleTag not found, try again"
                }

            }

        });
    }

    /**
     *
     * @param selection String selected from spinner
     * @return regionSelection -- to be used for Map Calls.
     */
    public String getRegionSelection(String selection) {
        String regionSelection = "";
        if(selection.equals("US")) {
            regionSelection = "usStats";
        }
        else if(selection.equals("EU")) {
            regionSelection = "euStats";
        }
        else if (selection.equals("KR")){
            regionSelection = "krStats";
        }
        return regionSelection;
    }


    /**
     *
     * @param message alert displayed to the user
     *                return type is void
     */
    public void showAlertToUser(String message) {
        // display alert to user
        AlertDialog.Builder builder = new AlertDialog.Builder(SearchController.this);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public static Context getContext() {
        return context;
    }

    /**
     *
     * @param parent
     * @param view
     * @param position
     * @param id
     * For the Spinner to display a 'selected' Toast at the bottom of the screen when chosen
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}
