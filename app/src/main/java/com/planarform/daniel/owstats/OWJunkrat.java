package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWJunkrat extends OWHero{
    Integer ripTireKillsMostInGame;
    Integer ripTireKills;
    Integer enemiesTrapped;
    Integer enemiesTrappedMostInGame;
    Integer meleeFinalBlowMostInGame;
    Double enemiesTrappedAMinute;

    public OWJunkrat(Map stats) {
        super(stats);
        this.ripTireKillsMostInGame = (Integer)stats.get("rip_tire_kills_most_in_game");
        this.ripTireKills = (Integer)stats.get("rip_tire_kills");
        this.enemiesTrapped = (Integer)stats.get("enemies_trapped");
        this.enemiesTrappedMostInGame = (Integer)stats.get("enemies_trapped_most_in_game");
        this.enemiesTrappedAMinute = (Double)stats.get("enemies_trapped_a_minute");
        this.meleeFinalBlowMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
    }
}
