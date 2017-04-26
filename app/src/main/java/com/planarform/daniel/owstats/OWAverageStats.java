package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWAverageStats {
    Double objectiveKillsAverage;
    Double damageDoneAverage;
    Double meleeFinalBlowsAverage;
    Double deathsAverage;
    Double objectiveTimeAverage;
    Double healingDoneAverage;
    Double soloKillsAverage;
    Double timeSpentOnFireAverage;
    Double eliminationsAverage;
    Double finalBlows;

    public OWAverageStats(Map stats) {
        this.objectiveKillsAverage = (Double)stats.get("objective_kills_avg");
        this.damageDoneAverage = (Double)stats.get("damage_done_avg");
        this.meleeFinalBlowsAverage = (Double)stats.get("melee_final_blows_avg");
        this.deathsAverage = (Double)stats.get("deaths_avg");
        this.objectiveTimeAverage = (Double)stats.get("objective_time_avg");
        this.healingDoneAverage = (Double)stats.get("healing_done_avg");
        this.soloKillsAverage = (Double)stats.get("solo_kills_avg");
        this.timeSpentOnFireAverage = (Double)stats.get("time_spent_on_fire_avg");
        this.eliminationsAverage = (Double)stats.get("eliminations_avg");
        this.finalBlows = (Double)stats.get("final_blows_avg");
    }
}
