package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWMccree extends OWHero {
    Integer deadeyeKillsMostInGame;
    Integer fanTheHammerKills;
    Integer deadeye_kills;
    Integer meleeFinalBlowsMostInGame;

    public OWMccree (Map stats) {
        super(stats);
        this.deadeyeKillsMostInGame = (Integer)stats.get("deadeye_kills_most_in_game");
        this.fanTheHammerKills = (Integer)stats.get("fan_the_hammer_kills");
        this.deadeye_kills = (Integer)stats.get("deadeye_kills");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
    }

}
