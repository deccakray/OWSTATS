package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/17/17.
 */

public class OWTorbjorn extends OWHero {
    Double torbjornKills;
    Double moltenCoreKills;
    Double torbjornKillsMostInGame;
    Double moltenCoreKillsMostInGame;
    Double turretKills;
    Double meleeFinalBlowsMostInGame;
    Double armorPacksCreated;

    public OWTorbjorn(Map stats) {
        super(stats);
        this.torbjornKills = (Double)stats.get("torbjorn_kills");
        this.moltenCoreKills = (Double)stats.get("molten_core_kills");
        this.torbjornKillsMostInGame = (Double)stats.get("torbjorn_kills_most_in_game");
        this.moltenCoreKillsMostInGame = (Double)stats.get("molten_core_kills_most_in_game");
        this.turretKills = (Double)stats.get("turret_kills");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.armorPacksCreated = (Double)stats.get("armor_packs_created");
    }
}
