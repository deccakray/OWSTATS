package com.planarform.daniel.owstats;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Daniel on 3/22/17.
 * This class will display stats that the user searches.
 */

public class StatsController extends SearchController {
    TextView test;

    protected void onCreate(Bundle savedInstanceStates) {
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.stats_layout);

        test = (TextView)findViewById(R.id.test);

        Intent intent = getIntent();
        OWPlayer player = (OWPlayer)intent.getExtras().getSerializable("player");

        Double deaths = player.usStats.competitive.hero.dva.mechDeaths;
        test.setText(Double.toString(deaths));
    }
}
