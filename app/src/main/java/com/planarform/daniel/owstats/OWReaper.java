package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWReaper extends OWHero {
    Integer deathBlossomKillsMostInGame;
    Integer soulsConsumedMostInGame;
    Integer deathBlossomKills;
    Integer soulsConsumed;

    public OWReaper (Map stats) {
        super(stats);
        this.deathBlossomKillsMostInGame = (Integer)stats.get("death_blossom_kills_most_in_game");
        this.soulsConsumedMostInGame = (Integer)stats.get("souls_consumed_most_in_game");
        this.deathBlossomKills = (Integer)stats.get("death_blossom_kills");
        this.soulsConsumed = (Integer)stats.get("souls_consumed");
    }
}
