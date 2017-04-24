package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWMercy extends OWHero {
    Integer playersResurrectedMostInGame;
    Integer playersRessurrected;

    public OWMercy(Map stats) {
        super(stats);
        this.playersResurrectedMostInGame = (Integer)stats.get("players_resurrected_most_in_game");
        this.playersRessurrected = (Integer)stats.get("players_resurrected");

    }

}
