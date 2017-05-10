package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 * AchivementsFragment class that displays the
 * View coming in from the Adapter class related to it.
 * It shows all the achieved and non-achieved achievements.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;

public class AchievementsFragment extends Fragment {
    GridView achievementGridView;

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_achievements, container, false);
        achievementGridView = (GridView)rootView.findViewById(R.id.achievement_grid_view);

        Bundle bundle = getArguments();
        final OWPlayer player = (OWPlayer) bundle.getSerializable("player");
        ArrayList<OWAchievement> achievements = player.usStats.achievements;

        AchievementsAdapter achievementsAdapter = new AchievementsAdapter(this, achievements);
        achievementGridView.setAdapter(achievementsAdapter);

        return rootView;
    }
}
