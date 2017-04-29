package com.planarform.daniel.owstats;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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

      Map playerMap = (HashMap<String, Object>) intent.getSerializableExtra("player_map");
      OWPlayer player = new OWPlayer(playerMap, (String) playerMap.get("battle_tag"));
//       OWPlayer player =  SerializationUtil.deserialize(playerByteArray);

        Double deaths = player.usStats.quickplay.game.turretsDestroyed;
        test.setText(Double.toString(deaths));
    }
}
