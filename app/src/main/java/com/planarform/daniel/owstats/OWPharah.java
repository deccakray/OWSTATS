package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWPharah extends OWHero {
    Integer barrageKills;
    Integer barrageKillsMostInGame;
    Integer meleeFinalBlowMostInGame;
    Integer rocketDirectHitsMostInGame;
    Integer rocketDirectHits;

    public OWPharah(Map stats){
        super(stats);
        this.barrageKills = (Integer)stats.get("barrage_kills");
        this.barrageKillsMostInGame = (Integer)stats.get("barrage_kills_most_in_game");
        this.meleeFinalBlowMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.rocketDirectHitsMostInGame = (Integer)stats.get("rocket_direct_hits_most_in_game");
        this.rocketDirectHits = (Integer)stats.get("rocket_direct_hits");
    }
}
