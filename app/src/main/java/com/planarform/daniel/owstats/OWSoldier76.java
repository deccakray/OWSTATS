package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWSoldier76 extends OWHero {
    Integer helixRocketsKillsMostInGame;
    Integer tacticalVisorKills;
    Integer helixRocketsKills;
    Integer meleeFinalBlowsMostInGame;
    Integer tacticalVisorKillsMostInGame;
    Integer bioticFieldsDeployed;
    Integer bioticFieldHealingDone;

    public OWSoldier76 (Map stats) {
        super(stats);
        this.helixRocketsKillsMostInGame = (Integer)stats.get("helix_rockets_kills_most_in_game");
        this.tacticalVisorKills = (Integer)stats.get("tactical_visor_kills");
        this.helixRocketsKills = (Integer)stats.get("helix_rockets_kills");
        this.meleeFinalBlowsMostInGame = (Integer)stats.get("melee_final_blows_most_in_game");
        this.tacticalVisorKillsMostInGame = (Integer)stats.get("tactical_visor_kills_most_in_game");
        this.bioticFieldHealingDone = (Integer)stats.get("biotic_field_healing_done");
        this.bioticFieldsDeployed = (Integer)stats.get("biotic_fields_deployed");
    }

}
