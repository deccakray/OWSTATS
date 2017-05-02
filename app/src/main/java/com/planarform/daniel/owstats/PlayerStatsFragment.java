package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlayerStatsFragment extends Fragment {
    TextView txt;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_player_stats, container, false);
        TextView txt = (TextView)rootView.findViewById(R.id.test);
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
//        Intent intent = this.getIntent();
        Bundle bundle = getArguments();
        OWPlayer player = (OWPlayer) bundle.getSerializable("player");

        Double deaths = player.usStats.quickplay.game.turretsDestroyed;
        txt.setText(Double.toString(deaths));

        return rootView;
    }
}