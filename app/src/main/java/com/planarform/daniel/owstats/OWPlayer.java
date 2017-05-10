package com.planarform.daniel.owstats;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 * This is the class used for creating an OWPlayer Object.
 * This object is used to map all the data so it can easily be
 * accessible throughout the Application.
 */

public class OWPlayer implements Serializable{

    OWStats usStats;
    OWStats krStats;
    OWStats euStats;
    OWStats anyStats;
    String battleTag;
    String platform;
    ImageView icon;
    String regionSelection;
    public OWPlayer(Map stats, String battleTag, String regionSelection)  {
        this.regionSelection = regionSelection;
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

    /**
     * Method that Sets all the stats by linking all the individual
     * maps via Classes. Each hero has their own class with their own attributes.
     * This method calls the OWStats() constructor which calls another constructor
     * until all stats have been mapped.
     * The stats are called like this (ex) player.usStats.competitive.overall.deaths;
     * @param stats
     * @return
     */
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

    /**
     * Method used for determining the validity of a BattleTag
     * @param battleTag
     * @return
     */

    public static boolean isValidBattleTag(String battleTag) {
        // validate battle tag
        if(battleTag.length() < 8 || battleTag.length() > 16) {
            return false;
        }
        if(!battleTag.contains("#") && !battleTag.contains("-")) {
            return false;
        }

        return true;    }

    /**
     * Method used for setting the JSON response into a rootMap that will
     * be used for the OWPlayer object to setAllStats()
     * @param response
     * @return
     * @throws Exception
     */
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

