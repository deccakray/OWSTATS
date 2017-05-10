package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 * Class that shows the Fragment view for
 * the Top Heroes tab.
 */
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
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

import static com.planarform.daniel.owstats.SearchController.context;

public class TopHeroesFragment extends Fragment {

    Spinner selectStat;
    ListView heroList;
    ArrayList<Double> preheroValueList = new ArrayList<>();
    double[] preheroValue;
    ArrayList<String> heroValueList = new ArrayList<>();
    String[] heroNames;
    ArrayList<String> heroNamesList = new ArrayList<>();
    int[] heroIcons;
    ArrayList<Integer> maxValueList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top_heroes, container, false);
        Typeface OWFONT = Typeface.createFromAsset(context.getAssets(),  "fonts/big_noodle_titling_oblique.ttf");

        // Get data from OWPLAYER
        Bundle bundle = getArguments();
        OWPlayer player = (OWPlayer) bundle.getSerializable("player");
        TextView selectTextView = (TextView)rootView.findViewById(R.id.select);
        selectTextView.setTypeface(OWFONT);


        // Grab hero Value of each hero if not null
        // doing us stats only ... for now
        double anaTime = 0.0;
        double bastionTime = 0.0;
        double dvaTime = 0.0;
        double genjiTime = 0.0;
        double hanzoTime = 0.0;
        double junkratTime = 0.0;
        double lucioTime = 0.0;
        double mccreeTime = 0.0;
        double meiTime = 0.0;
        double mercyTime = 0.0;
        double orisaTime = 0.0;
        double pharahTime = 0.0;
        double reaperTime = 0.0;
        double reinhardtTime = 0.0;
        double roadhogTime = 0.0;
        double soldier76Time = 0.0;
        double sombraTime = 0.0;
        double symmetraTime = 0.0;
        double torbjornTime = 0.0;
        double tracerTime = 0.0;
        double widowmakerTime = 0.0;
        double winstonTime = 0.0;
        double zaryaTime = 0.0;
        double zenyattaTime = 0.0;


        // Getting playtime for each hero.
        // This should have been dynamically implemented instead of
        // hard coded.
        try {
            anaTime = player.usStats.competitive.heroPlaytime.anaTime;
             bastionTime = player.usStats.competitive.heroPlaytime.bastionTime;
             dvaTime = player.usStats.competitive.heroPlaytime.dvaTime;
             genjiTime = player.usStats.competitive.heroPlaytime.genjiTime;
             hanzoTime = player.usStats.competitive.heroPlaytime.hanzoTime;
             junkratTime = player.usStats.competitive.heroPlaytime.junkratTime;
             lucioTime = player.usStats.competitive.heroPlaytime.lucioTime;
             mccreeTime = player.usStats.competitive.heroPlaytime.mccreeTime;
             meiTime = player.usStats.competitive.heroPlaytime.meiTime;
             mercyTime = player.usStats.competitive.heroPlaytime.mercyTime;
             orisaTime = player.usStats.competitive.heroPlaytime.orisaTime;
             pharahTime = player.usStats.competitive.heroPlaytime.pharahTime;
             reaperTime = player.usStats.competitive.heroPlaytime.reaperTime;
             reinhardtTime = player.usStats.competitive.heroPlaytime.reinhardtTime;
             roadhogTime = player.usStats.competitive.heroPlaytime.roadhogTime;
             soldier76Time = player.usStats.competitive.heroPlaytime.soldier76Time;
             sombraTime = player.usStats.competitive.heroPlaytime.sombraTime;
             symmetraTime = player.usStats.competitive.heroPlaytime.symmetraTime;
             torbjornTime = player.usStats.competitive.heroPlaytime.torbjornTime;
             tracerTime = player.usStats.competitive.heroPlaytime.tracerTime;
             widowmakerTime = player.usStats.competitive.heroPlaytime.widowmakerTime;
             winstonTime = player.usStats.competitive.heroPlaytime.winstonTime;
             zaryaTime = player.usStats.competitive.heroPlaytime.zaryaTime;
             zenyattaTime = player.usStats.competitive.heroPlaytime.zenyattaTime;

        }catch(NullPointerException e){
            Log.d("no stats for that hero", "There was a null pointer exception");
        }

        // Grab hero name
        heroNames = new String[]{"ANA", "BASTION", "DVA","GENJI", "HANZO", "JUNKRAT", "LUCIO", "MCCREE", "MEI", "MERCY", "ORISA", "PHARAH", "REAPER", "REINHARDT",
                "ROADHHOG", "SOLDIER76", "SOMBRA", "SYMMETRA", "TORBJORN", "TRACER", "WIDOWMAKER", "WINSTON", "ZARYA", "ZENYATTA" };

        // Grab raw double hero value
        preheroValue = new double[]{anaTime,bastionTime, dvaTime,  genjiTime,  hanzoTime,junkratTime, lucioTime, mccreeTime
                ,meiTime , mercyTime, orisaTime, pharahTime, reaperTime, reinhardtTime, roadhogTime,  soldier76Time, sombraTime,
                symmetraTime, torbjornTime, tracerTime, widowmakerTime, winstonTime, zaryaTime, zenyattaTime };

        // Grab hero icon
        heroIcons = new int [] {R.drawable.ana, R.drawable.bastion, R.drawable.dva, R.drawable.genji, R.drawable.hanzo, R.drawable.junkrat, R.drawable.lucio, R.drawable.mccree,
                R.drawable.mei, R.drawable.mercy, R.drawable.orisa, R.drawable.pharah, R.drawable.reaper, R.drawable.reinhardt, R.drawable.roadhog, R.drawable.soldier_76, R.drawable.sombra, R.drawable.symmetra, R.drawable.torbjorn
                , R.drawable.tracer, R.drawable.widowmaker, R.drawable.winston, R.drawable.zarya, R.drawable.zenyatta};


        // fill hero name list
        for(int i = 0; i < heroNames.length; i ++ ) {
            heroNamesList.add(heroNames[i]);
        }
        // Fill pre hero value list (RAW VALUES)
        for(int i = 0; i < preheroValue.length; i ++ ) {
            preheroValueList.add(preheroValue[i]);
        }

        // Aids for-loop to determine Hours, Minutes, Seconds (Rounds off remainders)
        for(int i = 0; i < preheroValueList.size(); i++) {
            // to change to hours
            if (preheroValueList.get(i) >= 1) {
                int newHeroValue = preheroValueList.get(i).intValue();
                if(newHeroValue == 1) {
                    heroValueList.add(Integer.toString(newHeroValue)+" hour");
                    maxValueList.add(newHeroValue);
                }
                else {
                    heroValueList.add(Integer.toString(newHeroValue)+" hours");
                    maxValueList.add(newHeroValue);
                }
            }
            // to change to minutes with seconds
            else if (preheroValueList.get(i)< 1) {
                preheroValueList.set(i, preheroValueList.get(i)*60 );
                // if the value has no remainder when converted to minutes or it does
                if ((preheroValueList.get(i)) >= 1) {

                    int newHeroValue = preheroValueList.get(i).intValue();
                    if (newHeroValue == 1) {
                        heroValueList.add(Integer.toString(newHeroValue)+ " minute");
                        maxValueList.add(newHeroValue);
                    }
                    else{
                        heroValueList.add(Integer.toString(newHeroValue)+ " minutes");
                        maxValueList.add(newHeroValue);
                    }
                }
                else if((preheroValueList.get(i) < 1)) {
                    preheroValueList.set(i, preheroValueList.get(i)*60 );
                    int newHeroValue = preheroValueList.get(i).intValue();
                    if(newHeroValue == 1) {
                        heroValueList.add(Integer.toString(newHeroValue) + " second");
                        maxValueList.add(newHeroValue);
                    }
                    else{
                        heroValueList.add(Integer.toString(newHeroValue) + " seconds");
                        maxValueList.add(newHeroValue);
                    }

                }
            }
        }

        // Spinner element
        selectStat = (Spinner) rootView.findViewById(R.id.hero_spinner);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Time Played");
        categories.add("Games Won");
        // spinner adapter
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);

        //  Drop down layout style - list view with radio button
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        selectStat.setAdapter(spinnerAdapter);

        //List View element
        heroList = (ListView)rootView.findViewById(R.id.hero_list);
        // ListView custombase adapter
        TopHeroListViewAdapter listViewAdapter = new TopHeroListViewAdapter(this, heroValueList, heroIcons, heroNamesList, maxValueList);
        heroList.setAdapter(listViewAdapter);



        // Spinner click listener
        selectStat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                // On selecting a spinner item
//                String item = parent.getItemAtPosition(position).toString();
//                String s = spinner.getItemAtPosition(arg2).toString();
//                list.add(s);
//                listadapter.notifyDataSetChanged();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        return rootView;
    }
}