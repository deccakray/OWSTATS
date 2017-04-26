package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWPharah extends OWHero {
    Double barrageKills;
    Double barrageKillsMostInGame;
    Double meleeFinalBlowMostInGame;
    Double rocketDirectHitsMostInGame;
    Double rocketDirectHits;

    public OWPharah(Map stats){
        super(stats);
        this.barrageKills = (Double)stats.get("barrage_kills");
        this.barrageKillsMostInGame = (Double)stats.get("barrage_kills_most_in_game");
        this.meleeFinalBlowMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.rocketDirectHitsMostInGame = (Double)stats.get("rocket_direct_hits_most_in_game");
        this.rocketDirectHits = (Double)stats.get("rocket_direct_hits");
    }
}
