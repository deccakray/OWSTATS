package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWBastion extends OWHero {
    Double tankKillsMostInGame;
    Double reconKillsMostInGame;
    Double sentryKills;
    Double tankKills;
    Double sentryKillsMostInGame;
    Double reconKills;

    public OWBastion (Map stats){
        super(stats);
        this.tankKills = (Double)stats.get("tank_kills");
        this.tankKillsMostInGame = (Double)stats.get("tank_kills_most_in_game");
        this.reconKills = (Double)stats.get("recon_kills");
        this.reconKillsMostInGame = (Double)stats.get("recon_kills_most_in_game");
        this.sentryKills = (Double)stats.get("sentry_kills");
        this.sentryKillsMostInGame = (Double)stats.get("sentry_kills_most_in_game");
    }

}
