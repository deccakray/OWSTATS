package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWReaper extends OWHero {
    Double deathBlossomKillsMostInGame;
    Double soulsConsumedMostInGame;
    Double deathBlossomKills;
    Double soulsConsumed;

    public OWReaper (Map stats) {
        super(stats);
        this.deathBlossomKillsMostInGame = (Double)stats.get("death_blossom_kills_most_in_game");
        this.soulsConsumedMostInGame = (Double)stats.get("souls_consumed_most_in_game");
        this.deathBlossomKills = (Double)stats.get("death_blossom_kills");
        this.soulsConsumed = (Double)stats.get("souls_consumed");
    }
}
