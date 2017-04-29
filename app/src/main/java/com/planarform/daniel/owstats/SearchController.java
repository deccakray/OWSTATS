package com.planarform.daniel.owstats;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daniel on 3/22/17.
 * This class will ask for the user to enter any battletag and search the stats
 * pertaining to that battletag
 */
// This class will ask for the user to enter any battletag and search the stats
// the stats pertaining to that battletag
public class SearchController extends Activity {
    static Context context;
    Button searchButton;
    EditText searchBar;
    Spinner platformChooser;
    String input = "";

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.search_layout);

        context = getApplicationContext();
        searchButton = (Button)findViewById(R.id.search_button);
        searchBar = (EditText)findViewById(R.id.search_bar);
        platformChooser = (Spinner)findViewById(R.id.platform_chooser);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = searchBar.getText().toString();

                if(OWPlayer.isValidBattleTag(input)) {
                    input = input.replace("#","-");
                    String url = "https://owapi.net/api/v3/u/" + input + "/blob";
                    NetworkingManager networkManager = NetworkingManager.getInstance();

                    networkManager.sendGetRequest(url, new NetworkingListener<String, VolleyError>() {
                            @Override
                        public void onResponse(String response) {
                                try {

                                    Map playerMap = OWPlayer.setJSON(response);
                                   playerMap.put("battle_tag", input);

                                    HashMap<String, Object> hashy = new HashMap<String, Object>(playerMap);

                                    Intent intent = new Intent(SearchController.this, StatsController.class);
                                    intent.putExtra("player_map", hashy);
                                    startActivity(intent);


                                } catch (Exception e) {
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
                        public void onImageDownloaded(Bitmap b) {}

                    });
                }
            }
        });
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

}
