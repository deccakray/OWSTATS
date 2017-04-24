package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWReinhardt extends OWHero {
    Integer damageBlockedMostInGame;
    Integer damageBlocked;
    Integer fireStrikeKillsMostInGame;
    Integer chargeKillsMostInGame;
    Integer earthshatterKillsMostInGame;
    Integer chargeKills;
    Integer earthshatterKills;
    Integer fireStrikeKills;

    public OWReinhardt (Map stats) {
        super(stats);
        this.damageBlockedMostInGame = (Integer)stats.get("damage_blocked_most_in_game");
        this.damageBlocked = (Integer)stats.get("damage_blocked");
        this.fireStrikeKills = (Integer)stats.get("fire_strike_kills");
        this.fireStrikeKillsMostInGame = (Integer)stats.get("fire_strike_kills_most_in_game");
        this.chargeKillsMostInGame = (Integer)stats.get("charge_kills_most_in_game");
        this.earthshatterKills = (Integer)stats.get("earthshatter_kills");
        this.earthshatterKillsMostInGame = (Integer)stats.get("earthshatter_kills_most_in_game");
        this.chargeKills = (Integer)stats.get("charge_kills");
    }
}
