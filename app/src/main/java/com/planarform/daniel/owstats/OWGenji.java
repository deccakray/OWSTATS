package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWGenji extends OWHero {
    Integer dragonbladeKillsMostInGame;
    Integer damageReflectedMostInGame;
    Integer meleeFinalBlowsMostInGame;
    Integer dragonblades;
    Integer dragonbladeKills;
    Integer damageReflected;

    public OWGenji(Map stats){
        super(stats);
        this.dragonbladeKillsMostInGame = (Integer)stats.get("dragonblade_kills_most_in_game");
        this.damageReflectedMostInGame = (Integer)stats.get("damage_reflected_most_in_game");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.dragonblades = (Integer)stats.get("dragonblades");
        this.dragonbladeKills = (Integer)stats.get("dragonblade_kills");
        this.damageReflected = (Integer)stats.get("damage_reflected");

    }
}
