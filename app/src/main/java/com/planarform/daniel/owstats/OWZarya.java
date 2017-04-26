package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWZarya extends OWHero{
    Double damageBlockedMostInGame;
    Double damageBlocked;
    Double meleeFinalBlowMostInGame;
    Double lifetimeEnergyAccumulation;
    Double lifetimGravitonSurgeKills;
    Double projectedBarriersSupplied;
    Double highEnergyKills;
    Double gravitonSurgeKillsMostInGame;
    Double energyMaximum;
    Double highEnergyKillsMostInGame;

    public OWZarya(Map stats) {
        super(stats);
        this.damageBlockedMostInGame = (Double)stats.get("damage_blocked_most_in_game");
        this.damageBlocked = (Double)stats.get("damage_blocked");
        this.meleeFinalBlowMostInGame = (Double)stats.get("melee_final_blow_most_in_game");
        this.lifetimeEnergyAccumulation = (Double)stats.get("lifetime_energy_accumulation");
        this.lifetimGravitonSurgeKills = (Double)stats.get("lifetime_graviton_surge_kills");
        this.projectedBarriersSupplied = (Double)stats.get("projected_barrier_supplied");
        this.highEnergyKills = (Double)stats.get("high_energy_kills");
        this.gravitonSurgeKillsMostInGame = (Double)stats.get("graviton_surge_kills_most_in_game");
        this.energyMaximum = (Double)stats.get("energy_maximum");
        this.highEnergyKillsMostInGame = (Double)stats.get("high_energy_kills_most_in_game");

    }
}
