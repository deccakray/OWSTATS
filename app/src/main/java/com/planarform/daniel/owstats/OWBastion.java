package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWBastion extends OWHero {
    Integer tankKillsMostInGame;
    Integer reconKillsMostInGame;
    Integer sentryKills;
    Integer tankKills;
    Integer sentryKillsMostInGame;
    Integer reconKills;

    public OWBastion (Map stats){
        super(stats);
        this.tankKills = (Integer)stats.get("tank_kills");
        this.tankKillsMostInGame = (Integer)stats.get("tank_kills_most_in_game");
        this.reconKills = (Integer)stats.get("recon_kills");
        this.reconKillsMostInGame = (Integer)stats.get("recon_kills_most_in_game");
        this.sentryKills = (Integer)stats.get("sentry_kills");
        this.sentryKillsMostInGame = (Integer)stats.get("sentry_kills_most_in_game");
    }

}
