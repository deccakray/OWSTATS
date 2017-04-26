package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWLucio extends OWHero {
    Double soundBarriersProvided;
    Double soundBarriersProvidedMostInGame;
    Double meleeFinalBlowMostInGame;

    public OWLucio(Map stats) {
        super(stats);
        this.soundBarriersProvided = (Double)stats.get("sound_barriers_provided");
        this.soundBarriersProvidedMostInGame = (Double)stats.get("sound_barriers_provided_most_in_game");
        this.meleeFinalBlowMostInGame = (Double)stats.get("melee_final_blows_most_in_game");
    }
}
