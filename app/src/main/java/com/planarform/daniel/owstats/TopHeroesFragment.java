package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
//FIX THIS SO IT TIES IN WITH ADDDING/UPDATING LISTVIEW ONITEMSELECTED
// http://stackoverflow.com/questions/19833100/android-updating-list-view-on-spinner-selection
public class TopHeroesFragment extends Fragment {

    Spinner selectStat;
    ListView listOfHeroes;
    ArrayAdapter<String> adapter, listAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top_heroes, container, false);
        // Get data from OWPLAYER
        Bundle bundle = getArguments();
        OWPlayer player = (OWPlayer) bundle.getSerializable("player");
//        Double deaths = player.usStats.quickplay.game.kpd;
        // Spinner element
        // Spinner Drop down elements
        ArrayList<String> categories = new ArrayList<String>();
        categories.add("Time Played");
        categories.add("Games Won");
        selectStat = (Spinner) rootView.findViewById(R.id.hero_spinner);
        listOfHeroes = (ListView) rootView.findViewById(R.id.list_of_heroes);

       adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);



//spinner.setOnItemClickListener(this);




// Creating adapter for spinner

// Drop down layout style - list view with radio button
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// attaching data adapter to spinner
        selectStat.setAdapter(adapter);


// Spinner click listener
        selectStat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                // On selecting a spinner item
                String item = parent.getItemAtPosition(position).toString();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        return rootView;
    }
}

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
