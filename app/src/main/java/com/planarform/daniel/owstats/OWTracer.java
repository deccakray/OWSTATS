package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWTracer extends OWHero {
    Double meleeFinalBlowsMostInGame;
    Double pulseBombKills;
    Double pulseBombKillsMostInGame;
    Double pulseBombsAttached;
    Double pulseBombsAttachedMostInGame;

    public OWTracer(Map stats) {
        super(stats);
        this.meleeFinalBlowsMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
        this.pulseBombKills = (Double)stats.get("pulse_bomb_kills");
        this.pulseBombKillsMostInGame = (Double)stats.get("pulse_bomb_kills_most_in_game");
        this.pulseBombsAttached = (Double)stats.get("pulse_bombs_attached");
        this.pulseBombsAttachedMostInGame = (Double)stats.get("pulse_bombs_attached_most_in_game");
    }
}
