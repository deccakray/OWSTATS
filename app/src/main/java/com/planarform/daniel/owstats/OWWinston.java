package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWWinston extends OWHero {
    Double damageBlockedMostInGame;
    Double damageBlocked;
    Double playersKnockedBack;
    Double meleeKills;
    Double playersKnockedBackMostInGame;
    Double jumpPackKills;
    Double jumpPackKillsMostInGame;
    Double meleeFinalBlowsMostInGame;
    Double meleeKillsMostInGame;

    public OWWinston(Map stats) {
        super(stats);
        this.damageBlockedMostInGame = (Double)stats.get("damage_blocked_most_in_game");
        this.damageBlocked = (Double)stats.get("damage_blocked");
        this.playersKnockedBack = (Double)stats.get("players_knocked_back");
        this.meleeKills = (Double)stats.get("melee_kills");
        this.playersKnockedBackMostInGame = (Double)stats.get("players_knocked_back_most_in_game");
        this.jumpPackKills = (Double)stats.get("jump_pack_kills");
        this.jumpPackKillsMostInGame = (Double)stats.get("jump_pack_kills_most_in_game");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.meleeKillsMostInGame = (Double)stats.get("melee_kills_most_in_game");
    }
}
