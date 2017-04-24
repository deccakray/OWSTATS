package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWWinston extends OWHero {
    Integer damageBlockedMostInGame;
    Integer damageBlocked;
    Integer playersKnockedBack;
    Integer meleeKills;
    Integer playersKnockedBackMostInGame;
    Integer jumpPackKills;
    Integer jumpPackKillsMostInGame;
    Integer meleeFinalBlowsMostInGame;
    Integer meleeKillsMostInGame;

    public OWWinston(Map stats) {
        super(stats);
        this.damageBlockedMostInGame = (Integer)stats.get("damage_blocked_most_in_game");
        this.damageBlocked = (Integer)stats.get("damage_blocked");
        this.playersKnockedBack = (Integer)stats.get("players_knocked_back");
        this.meleeKills = (Integer)stats.get("melee_kills");
        this.playersKnockedBackMostInGame = (Integer)stats.get("players_knocked_back_most_in_game");
        this.jumpPackKills = (Integer)stats.get("jump_pack_kills");
        this.jumpPackKillsMostInGame = (Integer)stats.get("jump_pack_kills_most_in_game");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.meleeKillsMostInGame = (Integer)stats.get("melee_kills_most_in_game");
    }
}
