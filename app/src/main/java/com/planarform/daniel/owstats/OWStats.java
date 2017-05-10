package com.planarform.daniel.owstats;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWStats {
    ArrayList<OWAchievement> achievements = new ArrayList<>();
    OWPlayerStats quickplay;
    OWPlayerStats competitive;
//    private Map achievementResponse;

    public OWStats(Map stats) {
//        this.achievementResponse = (Map)stats.get("achievements");
        this.quickplay = new OWPlayerStats(stats, true);
        this.competitive = new OWPlayerStats(stats, false);
        this.fillAchievements((Map)stats.get("achievements"));
    }

    /**
     * This method fills the achievements map created from getAchievementMetaData()
     * @param stats
     */
    public void fillAchievements(Map stats) {
        Map metaData = OWPlayerManager.getInstance().getAchievementMetaData();
        String[] typeKeys = {"tank", "offense", "maps", "general", "defense", "special", "support"};
        for(String typeKey : typeKeys) {
            Map achieve = (Map)stats.get(typeKey);
            ArrayList<String> achieveKeys = new ArrayList<String>(achieve.keySet());

            for(String achieveKey : achieveKeys) {
                Map meta = (Map)metaData.get(achieveKey);
                OWAchievement achievement = new OWAchievement();
                achievement.url = (String)meta.get("url");
                achievement.description = (String)meta.get("description");
                achievement.name = (String)meta.get("name");
                achievement.isFinished = (Boolean)achieve.get(achieveKey);
                achievements.add(achievement);
            }
        }
    }

}
