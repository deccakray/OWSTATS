package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/17/17.
 */

public class OWSymmetra extends OWHero {
    Double sentryTurretKills;
    Double sentryTurretKillsMostInGame;

    public OWSymmetra(Map stats) {
        super(stats);
        this.sentryTurretKills = (Double)stats.get("sentry_turret_kills");
        this.sentryTurretKillsMostInGame = (Double)stats.get("sentry_turret_kills_most_in_game");
    }
}
