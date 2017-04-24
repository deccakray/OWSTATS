package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/17/17.
 */

public class OWTorbjorn extends OWHero {
    Integer torbjornKills;
    Integer moltenCoreKills;
    Integer torbjornKillsMostInGame;
    Integer moltenCoreKillsMostInGame;
    Integer turretKills;
    Integer meleeFinalBlowsMostInGame;
    Integer armorPacksCreated;

    public OWTorbjorn(Map stats) {
        super(stats);
        this.torbjornKills = (Integer)stats.get("torbjorn_kills");
        this.moltenCoreKills = (Integer)stats.get("molten_core_kills");
        this.torbjornKillsMostInGame = (Integer)stats.get("torbjorn_kills_most_in_game");
        this.moltenCoreKillsMostInGame = (Integer)stats.get("molten_core_kills_most_in_game");
        this.turretKills = (Integer)stats.get("turret_kills");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.armorPacksCreated = (Integer)stats.get("armor_packs_created");
    }
}
