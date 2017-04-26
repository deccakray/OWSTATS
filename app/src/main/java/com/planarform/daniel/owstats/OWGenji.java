package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWGenji extends OWHero {
    Double dragonbladeKillsMostInGame;
    Double damageReflectedMostInGame;
    Double meleeFinalBlowsMostInGame;
    Double dragonblades;
    Double dragonbladeKills;
    Double damageReflected;

    public OWGenji(Map stats){
        super(stats);
        this.dragonbladeKillsMostInGame = (Double)stats.get("dragonblade_kills_most_in_game");
        this.damageReflectedMostInGame = (Double)stats.get("damage_reflected_most_in_game");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.dragonblades = (Double)stats.get("dragonblades");
        this.dragonbladeKills = (Double)stats.get("dragonblade_kills");
        this.damageReflected = (Double)stats.get("damage_reflected");

    }
}
