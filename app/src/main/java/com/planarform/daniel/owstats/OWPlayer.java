package com.planarform.daniel.owstats;

import android.widget.ImageView;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWPlayer {

    OWStats usStats;
    OWStats krStats;
    OWStats euStats;
    OWStats anyStats;
    String battleTag;
    String platform;
    ImageView icon;
    public OWPlayer(Map stats, String battleTag) {
        this.battleTag = battleTag;
        if(!setAllStats(stats)) {
            System.out.println("There was an error finding stats");
        }
        else {
            setAllStats(stats);
        }

    }

    // int dvaElims = player.usStats.competitive.her.dva.eliminations;
    // int deaths = player.krStats.quickplay.overall.deaths;

    private boolean setAllStats(Map stats) {
       boolean didSetStat = false;
        if(stats.get("us")!=null) {
            usStats = new OWStats((Map)stats.get("us"));
            didSetStat = true;
        }
        if(stats.get("kr")!=null) {
            krStats = new OWStats((Map)stats.get("kr"));
            didSetStat = true;
        }
        if(stats.get("eu")!=null) {
            euStats = new OWStats((Map)stats.get("eu"));
            didSetStat = true;
        }
        if(stats.get("any")!=null) {
            anyStats = new OWStats((Map)stats.get("any"));
            didSetStat = true;
        }
        return didSetStat;
    }

    public static boolean isValidBattleTag(String battleTag) {
        return true;
    }

    public static Map setJSON(String response) throws Exception{
            Map rootObject;
            try {
               rootObject = new Gson().fromJson(response, Map.class);
            } catch (JsonParseException e) {
                throw new Exception();
            }

        return rootObject;
        }
}

