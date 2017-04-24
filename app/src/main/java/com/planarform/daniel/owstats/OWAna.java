package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWAna extends OWHero{
    Integer scopedShots;
    Integer nanoBoostAssistsMostInGame;
    Integer unscopedAccuracy;
    Integer scopedHits;
    Integer nanoBoostsApplied;
    Integer scopedAccuracyBestInGame;
    Integer nanoBoostAssists;

    public OWAna(Map stats) {
        super(stats);
        this.scopedShots = (Integer)stats.get("scoped_shots");
        this.nanoBoostAssists = (Integer)stats.get("nano_boost_assists_most_in_game");
        this.unscopedAccuracy = (Integer)stats.get("unscoped_accuracy");
        this.scopedHits = (Integer)stats.get("scoped_hits");
        this.nanoBoostsApplied = (Integer)stats.get("nano_boosts_applied");
        this.scopedAccuracyBestInGame = (Integer)stats.get("scoped_accuracy_best_in_game");
        this.nanoBoostAssists = (Integer)stats.get("nano_boosts_assists");


    }
}
