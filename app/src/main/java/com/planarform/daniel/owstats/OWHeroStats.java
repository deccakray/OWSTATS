package com.planarform.daniel.owstats;


import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Daniel on 4/11/17.
 */

public class OWHeroStats {
    OWDva dva;
    OWOrisa orisa;
    OWWidowmaker widowmaker;
    OWMei mei;
    OWTracer tracer;
    OWBastion bastion;
    OWRoadhog roadhog;
    OWJunkrat junkrat;
    OWAna ana;
    OWLucio lucio;
    OWSombra sombra;
    OWReaper reaper;
    OWHanzo hanzo;
    OWWinston winston;
    OWZarya zarya;
    OWMercy mercy;
    OWMccree mccree;
    OWReinhardt reinhardt;
    OWSoldier76 soldier76;
    OWSymmetra symmetra;
    OWZenyatta zenyatta;
    OWPharah pharah;
    OWTorbjorn torbjorn;
    OWGenji genji;

    public OWHeroStats(Map stats) {
        if(stats.get("dva")!= null){
            this.dva = new OWDva((Map)stats.get("dva"));
        }
        //this.dva = new OWDva((Map)stats.get("dva"));

        if(stats.get("orisa")!= null){
            this.orisa = new OWOrisa((Map)stats.get("orisa"));
        }
        //this.orisa = new OWOrisa((Map)stats.get("orisa"));

        if(stats.get("widowmaker")!= null){
            this.widowmaker = new OWWidowmaker((Map)stats.get("widowmaker"));
        }
        //this.widowmaker = new OWWidowmaker((Map)stats.get("widowmaker"));

        if(stats.get("mei")!= null){
            this.mei = new OWMei((Map)stats.get("mei"));
        }
        //this.mei = new OWMei((Map)stats.get("mei"));

        if(stats.get("tracer")!= null){
            this.tracer = new OWTracer((Map)stats.get("tracer"));
        }
        //this.tracer = new OWTracer((Map)stats.get("tracer"));

        if(stats.get("bastion")!= null){
            this.bastion = new OWBastion((Map)stats.get("bastion"));
        }
        //this.bastion = new OWBastion((Map)stats.get("bastion"));
        if(stats.get("roadhog")!= null){
            this.roadhog = new OWRoadhog((Map)stats.get("roadhog"));
        }
        //this.roadhog = new OWRoadhog((Map)stats.get("roadhog"));

        if(stats.get("junkrat")!= null){
            this.junkrat = new OWJunkrat((Map)stats.get("junkrat"));
        }
        //this.junkrat = new OWJunkrat((Map)stats.get("junkrat"));

        if(stats.get("genji")!= null){
            this.genji = new OWGenji((Map)stats.get("genji"));
        }
        //this.genji = new OWGenji((Map)stats.get("genji"));

        if(stats.get("ana")!= null){
            this.ana = new OWAna((Map)stats.get("ana"));
        }
        //this.ana = new OWAna((Map)stats.get("ana"));

        if(stats.get("lucio")!= null){
            this.lucio = new OWLucio((Map)stats.get("lucio"));
        }
        //this.lucio = new OWLucio((Map)stats.get("lucio"));

        if(stats.get("sombra")!= null){
            this.sombra = new OWSombra((Map)stats.get("sombra"));
        }
        //this.sombra = new OWSombra((Map)stats.get("sombra"));

        if(stats.get("reaper")!= null){
            this.reaper = new OWReaper((Map)stats.get("reaper"));
        }
        //this.reaper = new OWReaper((Map)stats.get("reaper"));

        if(stats.get("hanzo")!= null){
            this.hanzo = new OWHanzo((Map)stats.get("hanzo"));
        }
        //this.hanzo = new OWHanzo((Map)stats.get("hanzo"));

        if(stats.get("winston")!= null){
            this.winston = new OWWinston((Map)stats.get("winston"));
        }
        //this.winston = new OWWinston((Map)stats.get("winston"));

        if(stats.get("zarya")!= null){
            this.zarya = new OWZarya((Map)stats.get("zarya"));
        }
        //this.zarya = new OWZarya((Map)stats.get("zarya"));

        if(stats.get("mercy")!= null){
            this.mercy = new OWMercy((Map)stats.get("mercy"));
        }
        //this.mercy = new OWMercy((Map)stats.get("mercy"));

        if(stats.get("mccree")!= null){
            this.mccree = new OWMccree((Map)stats.get("mccree")); //deccaroni
        }
        //this.mccree = new OWMccree((Map)stats.get("mccree"));

        if(stats.get("reinhardt")!= null){
            this.reinhardt = new OWReinhardt((Map)stats.get("reinhardt"));
        }
        //this.reinhardt = new OWReinhardt((Map)stats.get("reinhardt"));

        if(stats.get("soldier76")!= null){
            this.soldier76 = new OWSoldier76((Map)stats.get("soldier76"));
        }
        //this.soldier76 = new OWSoldier76((Map)stats.get("soldier76"));

        if(stats.get("zenyatta")!= null){
            this.zenyatta = new OWZenyatta((Map)stats.get("zenyatta"));
        }
        //this.zenyatta = new OWZenyatta((Map)stats.get("zenyatta"));

        if(stats.get("pharah")!= null){
            this.pharah = new OWPharah((Map)stats.get("pharah"));
        }
        //this.pharah = new OWPharah((Map)stats.get("pharah"));

        if(stats.get("symmetra")!= null){
            this.symmetra = new OWSymmetra((Map)stats.get("symmetra"));
        }
        //this.symmetra = new OWSymmetra((Map)stats.get("symmetra"));

        if(stats.get("tobjorn")!= null){
            this.torbjorn = new OWTorbjorn((Map)stats.get("tobjorn"));
        }
        //this.torbjorn = new OWTorbjorn((Map)stats.get("torbjorn"));
    }
}
