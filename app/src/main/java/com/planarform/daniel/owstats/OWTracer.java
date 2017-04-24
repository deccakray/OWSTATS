package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWTracer extends OWHero {
    Integer meleeFinalBlowsMostInGame;
    Integer pulseBombKills;
    Integer pulseBombKillsMostInGame;
    Integer pulseBombsAttached;
    Integer pulseBombsAttachedMostInGame;

    public OWTracer(Map stats) {
        super(stats);
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.pulseBombKills = (Integer)stats.get("pulse_bomb_kills");
        this.pulseBombKillsMostInGame = (Integer)stats.get("pulse_bomb_kills_most_in_game");
        this.pulseBombsAttached = (Integer)stats.get("pulse_bombs_attached");
        this.pulseBombsAttachedMostInGame = (Integer)stats.get("pulse_bombs_attached_most_in_game");
    }
}
