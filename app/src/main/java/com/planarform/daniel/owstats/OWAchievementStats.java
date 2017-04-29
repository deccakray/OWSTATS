package com.planarform.daniel.owstats;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWAchievementStats  {
    Boolean angerManagement;
    public OWAchievementStats (Map stats){
        this.angerManagement = (Boolean)((Map)(stats.get("tanks"))).get("anger_management");
    }

}
