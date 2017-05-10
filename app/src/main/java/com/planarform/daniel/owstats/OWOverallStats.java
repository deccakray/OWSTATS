package com.planarform.daniel.owstats;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWOverallStats {
    Double losses;
    Double compRank;
    Double winRate;
    Double prestige;
    String avatar;
    String tier;
    String rankImage;
    Double wins;
    Double games;
    Double level;
    private Context context;

    /* Maping Overall Stats */
    public OWOverallStats(Map stats) {
            this.losses = (Double)stats.get("losses"); //losses
            this.compRank = (Double)stats.get("comprank");// competitive rank
            this.winRate = (Double)stats.get("win_rate"); //win rate
            this.prestige = (Double)stats.get("prestige"); //prestige
            this.avatar = (String)stats.get("avatar"); // avatar
            this.tier = (String)stats.get("tier"); // tier
            this.rankImage = (String)stats.get("rank_image"); //rank image
            this.wins = (Double)stats.get("wins"); // wins
            this.games = (Double)stats.get("games"); //games
            this.level = (Double)stats.get("level"); //level
    }
}
