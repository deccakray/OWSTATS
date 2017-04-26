package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWAna extends OWHero{
    Double scopedShots;
    Double nanoBoostAssistsMostInGame;
    Double unscopedAccuracy;
    Double scopedHits;
    Double nanoBoostsApplied;
    Double scopedAccuracyBestInGame;
    Double nanoBoostAssists;

    public OWAna(Map stats) {
        super(stats);
        this.scopedShots = (Double)stats.get("scoped_shots");
        this.nanoBoostAssists = (Double)stats.get("nano_boost_assists_most_in_game");
        this.unscopedAccuracy = (Double)stats.get("unscoped_accuracy");
        this.scopedHits = (Double)stats.get("scoped_hits");
        this.nanoBoostsApplied = (Double)stats.get("nano_boosts_applied");
        this.scopedAccuracyBestInGame = (Double)stats.get("scoped_accuracy_best_in_game");
        this.nanoBoostAssists = (Double)stats.get("nano_boosts_assists");


    }
}
