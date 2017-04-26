package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWJunkrat extends OWHero{
    Double ripTireKillsMostInGame;
    Double ripTireKills;
    Double enemiesTrapped;
    Double enemiesTrappedMostInGame;
    Double meleeFinalBlowMostInGame;
    Double enemiesTrappedAMinute;

    public OWJunkrat(Map stats) {
        super(stats);
        this.ripTireKillsMostInGame = (Double)stats.get("rip_tire_kills_most_in_game");
        this.ripTireKills = (Double)stats.get("rip_tire_kills");
        this.enemiesTrapped = (Double)stats.get("enemies_trapped");
        this.enemiesTrappedMostInGame = (Double)stats.get("enemies_trapped_most_in_game");
        this.enemiesTrappedAMinute = (Double)stats.get("enemies_trapped_a_minute");
        this.meleeFinalBlowMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
    }
}
