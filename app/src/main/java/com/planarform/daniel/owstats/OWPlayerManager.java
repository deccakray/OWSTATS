package com.planarform.daniel.owstats;

import android.content.Context;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Daniel on 5/6/17.
 */

public class OWPlayerManager {
    public Context context;
    private static OWPlayerManager singleton = new OWPlayerManager();
    private OWPlayerManager() {

    }
    public Map getAchievementMetaData() {
        Gson gson = new Gson();
        InputStream raw =  context.getResources().openRawResource(R.raw.achievement_meta_data);
        Reader json = new BufferedReader(new InputStreamReader(raw));
        Map metadataJSON = gson.fromJson(json, Map.class);
        return metadataJSON;
    }
    public static OWPlayerManager getInstance() {
        return singleton;
    }
    public void setContext(Context context) {
        this.context = context;
    }
}
