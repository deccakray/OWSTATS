package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWWidowmaker extends OWHero {
    Double scopedCriticalHits;
    Double scopedCriticalHitsMostInGame;
    Double scopedAccuracy;
    Double scopedHits;
    Double scopedShots;
    Double scopedAccuracyBestInGame;
    Double reconAssistsMostInGame;

    public OWWidowmaker(Map stats){
        super(stats);
        this.scopedCriticalHits = (Double)stats.get("scoped_critical_hits");
        this.scopedCriticalHitsMostInGame = (Double)stats.get("scoped_critical_hits_most_in_game");
        this.scopedAccuracy = (Double)stats.get("scoped_accuracy");
        this.scopedHits = (Double)stats.get("scoped_hits");
        this.scopedShots = (Double)stats.get("scoped_shots");
        this.scopedAccuracyBestInGame = (Double)stats.get("scoped_accuracy_best_in_game");
        this.reconAssistsMostInGame = (Double)stats.get("recon_assists_most_in_game");
    }

}