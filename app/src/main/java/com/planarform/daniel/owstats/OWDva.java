package com.planarform.daniel.owstats;

import com.planarform.daniel.owstats.OWHero;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWDva extends OWHero {
    Integer mechsCalledMostInGame;
    Integer mechsCalled;
    Integer damageBlockedMostInGame;
    Integer mechDeaths;
    Integer damageBlocked;

    public OWDva(Map stats) {
        // make sure super class gets all its properties initialized
        super(stats);
        this.mechsCalledMostInGame = (Integer)stats.get("mechs_called_most_in_game");
        this.mechsCalled = (Integer)stats.get("mechs_called");
        this.damageBlockedMostInGame = (Integer)stats.get("damage_blocked_most_in_game");
        this.mechDeaths = (Integer)stats.get("mech_deaths");
        this.damageBlocked = (Integer)stats.get("damage_blocked");
    }
}
