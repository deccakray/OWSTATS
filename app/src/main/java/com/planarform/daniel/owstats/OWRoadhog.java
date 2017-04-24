package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWRoadhog extends OWHero {
    Integer wholeHogKillsMostInGame;
    Integer meleeFinalBlowsMostInGame;
    Integer enemiesHooked;
    Integer wholeHogKills;
    Integer enemiesHookedMostInGame;
    Integer hooksAttempted;
    Double hookAccuracyBestInGame;
    Double hookAccuracy;

    public OWRoadhog (Map stats) {
        super(stats);
        this.wholeHogKillsMostInGame = (Integer)stats.get("whole_hog_kills_most_in_game");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.enemiesHooked = (Integer)stats.get("enemies_hooked");
        this.wholeHogKills = (Integer)stats.get("whole_hog_kills");
        this.enemiesHookedMostInGame = (Integer)stats.get("enemies_hooked_most_in_game");
        this.hooksAttempted = (Integer)stats.get("hooks_attempted");
        this.hookAccuracyBestInGame = (Double)stats.get("hook_accuracy_best_in_game");
        this.hookAccuracy = (Double)stats.get("hook_accuracy");
    }
}
