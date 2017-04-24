package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWWidowmaker extends OWHero {
    Integer scopedCriticalHits;
    Integer scopedCriticalHitsMostInGame;
    Double scopedAccuracy;
    Integer scopedHits;
    Integer scopedShots;
    Double scopedAccuracyBestInGame;
    Integer reconAssistsMostInGame;

    public OWWidowmaker(Map stats){
        super(stats);
        this.scopedCriticalHits = (Integer)stats.get("scoped_critical_hits");
        this.scopedCriticalHitsMostInGame = (Integer)stats.get("scoped_critical_hits_most_in_game");
        this.scopedAccuracy = (Double)stats.get("scoped_accuracy");
        this.scopedHits = (Integer)stats.get("scoped_hits");
        this.scopedShots = (Integer)stats.get("scoped_shots");
        this.scopedAccuracyBestInGame = (Double)stats.get("scoped_accuracy_best_in_game");
        this.reconAssistsMostInGame = (Integer)stats.get("recon_assists_most_in_game");
    }

}