package com.planarform.daniel.owstats;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWAchievementStats implements Parcelable {
    Boolean angerManagement;
    public OWAchievementStats (Map stats){
        this.angerManagement = (Boolean)((Map)(stats.get("tanks"))).get("anger_management");
    }

    protected OWAchievementStats(Parcel in) {
        angerManagement = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<OWAchievementStats> CREATOR = new Creator<OWAchievementStats>() {
        @Override
        public OWAchievementStats createFromParcel(Parcel in) {
            return new OWAchievementStats(in);
        }

        @Override
        public OWAchievementStats[] newArray(int size) {
            return new OWAchievementStats[size];
        }
    };
}
