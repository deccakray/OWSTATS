package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWOverallStats {
    Integer losses;
    Integer compRank;
    Double winRate;
    Integer prestige;
    String avatar;
    String tier;
    String rankImage;
    Integer wins;
    Integer games;
    Integer level;

    public OWOverallStats(Map stats) {
        this.losses = (Integer)stats.get("losses");
        this.compRank = (Integer)stats.get("comp_rank");
        this.winRate = (Double)stats.get("win_rate");
        this.prestige = (Integer)stats.get("prestige");
        this.avatar = (String)stats.get("avatar");
        this.tier = (String)stats.get("tier");
        this.rankImage = (String)stats.get("rank_image");
        this.wins = (Integer)stats.get("wins");
        this.games = (Integer)stats.get("games");
        this.level = (Integer)stats.get("level");
    }
}
