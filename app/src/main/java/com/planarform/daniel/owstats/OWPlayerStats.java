
package com.planarform.daniel.owstats;


import java.util.Map;

/**
 * Created by Daniel on 4/10/17.
 */

public class OWPlayerStats {

    OWGameStats game;
    OWAverageStats average;
    OWOverallStats overall;
    OWHeroStats hero;
    OWHeroPlayTime heroPlaytime;

    public OWPlayerStats (Map stats, boolean isQuickPlay) {
        String mode = isQuickPlay ? "quickplay" : "competitive";
        Map s = (Map)((Map)stats.get("stats")).get(mode);
        Map h = (Map)((Map)stats.get("heroes")).get("stats");
        Map p = (Map)((Map)stats.get("heroes")).get("playtime");
        Map g = (Map)s.get("game_stats");
        this.game = new OWGameStats((Map)(s.get("game_stats")));
        this.average = new OWAverageStats(((Map)s.get("average_stats")));
        this.overall = new OWOverallStats(((Map)s.get("overall_stats")));
        this.hero = new OWHeroStats(((Map)h.get(mode)));
        this.heroPlaytime = new OWHeroPlayTime(((Map)p.get(mode)));
    }
}
