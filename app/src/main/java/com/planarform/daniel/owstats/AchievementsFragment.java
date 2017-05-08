package com.planarform.daniel.owstats;

/**
 * Created by Daniel on 5/1/17.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import static android.content.ContentValues.TAG;
import static com.planarform.daniel.owstats.NetworkingManager.context;

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

    public Bitmap downloadBitmap(String url) {
        Bitmap bitmap = null;
        InputStream in = null;

        try {
            in = new java.net.URL(url).openStream();
            bitmap = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }




        return bitmap;
    }
}
