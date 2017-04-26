package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWMei extends OWHero {
    Double enemiesFrozen;
    Double damageBlockedMostInGame;
    Double enemiesFrozenMostInGame;
    Double meleeFinalBlowsMostInGame;
    Double damageBlocked;
    Double blizzardKills;
    Double blizzardKillsMostInGame;

    public OWMei(Map stats) {
        super(stats);
        this.enemiesFrozen = (Double)stats.get("enemies_frozen");
        this.damageBlockedMostInGame = (Double)stats.get("damage_blocked_most_in_game");
        this.enemiesFrozenMostInGame = (Double)stats.get("enemies_frozen_most_in_game");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.damageBlocked = (Double)stats.get("damage_blocked");
        this.blizzardKills = (Double)stats.get("blizzard_kills");
        this.blizzardKillsMostInGame = (Double)stats.get("blizzardKillsMostInGame");
    }
}
