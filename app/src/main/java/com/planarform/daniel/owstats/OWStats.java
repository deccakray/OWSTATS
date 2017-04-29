package com.planarform.daniel.owstats;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWStats implements Parcelable {
    OWAchievementStats achievements;
    OWPlayerStats quickplay;
    OWPlayerStats competitive;

    protected OWStats(Parcel in) {
        achievements = in.readParcelable(OWAchievementStats.class.getClassLoader());
        quickplay = in.readParcelable(OWPlayerStats.class.getClassLoader());
        competitive = in.readParcelable(OWPlayerStats.class.getClassLoader());

    }
    public OWStats (Map stats) {
//        this.achievements = new OWAchievementStats((Map)stats.get("achievements"));
        this.quickplay = new OWPlayerStats(stats, true);
        this.competitive = new OWPlayerStats(stats, false);
    }
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
    public static final Creator<OWStats> CREATOR = new Creator<OWStats>() {
        @Override
        public OWStats createFromParcel(Parcel in) {
            return new OWStats(in);
        }

        @Override
        public OWStats[] newArray(int size) {
            return new OWStats[size];
        }
    };
}
