package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWMccree extends OWHero {
    Double deadeyeKillsMostInGame;
    Double fanTheHammerKills;
    Double deadeye_kills;
    Double meleeFinalBlowsMostInGame;

    public OWMccree (Map stats) {
        super(stats);
        this.deadeyeKillsMostInGame = (Double)stats.get("deadeye_kills_most_in_game");
        this.fanTheHammerKills = (Double)stats.get("fan_the_hammer_kills");
        this.deadeye_kills = (Double)stats.get("deadeye_kills");
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
    }

}
