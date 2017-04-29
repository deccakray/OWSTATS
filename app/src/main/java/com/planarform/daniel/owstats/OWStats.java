package com.planarform.daniel.owstats;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWStats {
    OWAchievementStats achievements;
    OWPlayerStats quickplay;
    OWPlayerStats competitive;

    public OWStats(Map stats) {
//        this.achievements = new OWAchievementStats((Map)stats.get("achievements"));
        this.quickplay = new OWPlayerStats(stats, true);
        this.competitive = new OWPlayerStats(stats, false);
    }
}