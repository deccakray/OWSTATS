package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWZarya extends OWHero{
    Integer damageBlockedMostInGame;
    Integer damageBlocked;
    Integer meleeFinalBlowMostInGame;
    Integer lifetimeEnergyAccumulation;
    Integer lifetimGravitonSurgeKills;
    Integer projectedBarriersSupplied;
    Integer highEnergyKills;
    Integer gravitonSurgeKillsMostInGame;
    Integer energyMaximum;
    Integer highEnergyKillsMostInGame;

    public OWZarya(Map stats) {
        super(stats);
        this.damageBlockedMostInGame = (Integer)stats.get("damage_blocked_most_in_game");
        this.damageBlocked = (Integer)stats.get("damage_blocked");
        this.meleeFinalBlowMostInGame = (Integer)stats.get("melee_final_blow_most_in_game");
        this.lifetimeEnergyAccumulation = (Integer)stats.get("lifetime_energy_accumulation");
        this.lifetimGravitonSurgeKills = (Integer)stats.get("lifetime_graviton_surge_kills");
        this.projectedBarriersSupplied = (Integer)stats.get("projected_barrier_supplied");
        this.highEnergyKills = (Integer)stats.get("high_energy_kills");
        this.gravitonSurgeKillsMostInGame = (Integer)stats.get("graviton_surge_kills_most_in_game");
        this.energyMaximum = (Integer)stats.get("energy_maximum");
        this.highEnergyKillsMostInGame = (Integer)stats.get("high_energy_kills_most_in_game");

    }
}
