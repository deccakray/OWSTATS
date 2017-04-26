package com.planarform.daniel.owstats;

import com.planarform.daniel.owstats.OWHero;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWDva extends OWHero {
    Double mechsCalledMostInGame;
    Double mechsCalled;
    Double damageBlockedMostInGame;
    Double mechDeaths;
    Double damageBlocked;

    public OWDva(Map stats) {
        // make sure super class gets all its properties initialized
        super(stats);
        this.mechsCalledMostInGame = (Double)stats.get("mechs_called_most_in_game");
        this.mechsCalled = (Double)stats.get("mechs_called");
        this.damageBlockedMostInGame = (Double)stats.get("damage_blocked_most_in_game");
        this.mechDeaths = (Double)stats.get("mech_deaths");
        this.damageBlocked = (Double)stats.get("damage_blocked");
    }
}
