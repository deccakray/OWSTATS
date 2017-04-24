package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWLucio extends OWHero {
    Integer soundBarriersProvided;
    Integer soundBarriersProvidedMostInGame;
    Integer meleeFinalBlowMostInGame;

    public OWLucio(Map stats) {
        super(stats);
        this.soundBarriersProvided = (Integer)stats.get("sound_barriers_provided");
        this.soundBarriersProvidedMostInGame = (Integer)stats.get("sound_barriers_provided_most_in_game");
        this.meleeFinalBlowMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
    }
}
