package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWMei extends OWHero {
    Integer enemiesFrozen;
    Integer damageBlockedMostInGame;
    Integer enemiesFrozenMostInGame;
    Integer meleeFinalBlowsMostInGame;
    Integer damageBlocked;
    Integer blizzardKills;
    Integer blizzardKillsMostInGame;

    public OWMei(Map stats) {
        super(stats);
        this.enemiesFrozen = (Integer)stats.get("enemies_frozen");
        this.damageBlockedMostInGame = (Integer)stats.get("damage_blocked_most_in_game");
        this.enemiesFrozenMostInGame = (Integer)stats.get("enemies_frozen_most_in_game");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.damageBlocked = (Integer)stats.get("damage_blocked");
        this.blizzardKills = (Integer)stats.get("blizzard_kills");
        this.blizzardKillsMostInGame = (Integer)stats.get("blizzardKillsMostInGame");
    }
}
