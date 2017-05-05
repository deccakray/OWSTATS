package com.planarform.daniel.owstats;

import java.util.Map;

/**
 * Created by Daniel on 5/4/17.
 */

public class OWHeroPlayTime {
    Double pharahTime;
    Double sombraTime;
    Double mercyTime;
    Double hanzoTime;
    Double genjiTime;
    Double junkratTime;
    Double lucioTime;
    Double mccreeTime;
    Double meiTime;
    Double orisaTime;
    Double reaperTime;
    Double reinhardtTime;
    Double roadhogTime;
    Double torbjornTime;
    Double tracerTime;
    Double widowmakerTime;
    Double winstonTime;
    Double symmetraTime;
    Double soldier76Time;
    Double zaryaTime;
    Double zenyattaTime;
    Double anaTime;
    Double bastionTime;
    Double dvaTime;

    public OWHeroPlayTime (Map stats) {
        if(stats.get("dva")!= null){
            this.dvaTime = (Double) stats.get("dva");
        }
        //this.dva = new OWDva((Map)stats.get("dva"));

        if(stats.get("orisa")!= null){
            this.orisaTime = (Double)stats.get("orisa");
        }
        //this.orisa = new OWOrisa((Map)stats.get("orisa"));

        if(stats.get("widowmaker")!= null){
            this.widowmakerTime = (Double)stats.get("widowmaker");
        }
        //this.widowmaker = new OWWidowmaker((Map)stats.get("widowmaker"));

        if(stats.get("mei")!= null){
            this.meiTime = (Double)stats.get("mei");
        }
        //this.mei = new OWMei((Map)stats.get("mei"));

        if(stats.get("tracer")!= null){
            this.tracerTime = (Double)stats.get("tracer");
        }
        //this.tracer = new OWTracer((Map)stats.get("tracer"));

        if(stats.get("bastion")!= null){
            this.bastionTime = (Double)stats.get("bastion");
        }
        //this.bastion = new OWBastion((Map)stats.get("bastion"));
        if(stats.get("roadhog")!= null){
            this.roadhogTime = (Double)stats.get("roadhog");
        }
        //this.roadhog = new OWRoadhog((Map)stats.get("roadhog"));

        if(stats.get("junkrat")!= null){
            this.junkratTime = (Double)stats.get("junkrat");
        }
        //this.junkrat = new OWJunkrat((Map)stats.get("junkrat"));

        if(stats.get("genji")!= null){
            this.genjiTime = (Double)stats.get("genji");
        }
        //this.genji = new OWGenji((Map)stats.get("genji"));

        if(stats.get("ana")!= null){
            this.anaTime = (Double)stats.get("ana");
        }
        //this.ana = new OWAna((Map)stats.get("ana"));

        if(stats.get("lucio")!= null){
            this.lucioTime = (Double)stats.get("lucio");
        }
        //this.lucio = new OWLucio((Map)stats.get("lucio"));

        if(stats.get("sombra")!= null){
            this.sombraTime = (Double)stats.get("sombra");
        }
        //this.sombra = new OWSombra((Map)stats.get("sombra"));

        if(stats.get("reaper")!= null){
            this.reaperTime = (Double)stats.get("reaper");
        }
        //this.reaper = new OWReaper((Map)stats.get("reaper"));

        if(stats.get("hanzo")!= null){
            this.hanzoTime = (Double)stats.get("hanzo");
        }
        //this.hanzo = new OWHanzo((Map)stats.get("hanzo"));

        if(stats.get("winston")!= null){
            this.winstonTime = (Double)stats.get("winston");
        }
        //this.winston = new OWWinston((Map)stats.get("winston"));

        if(stats.get("zarya")!= null){
            this.zaryaTime = (Double)stats.get("zarya");
        }
        //this.zarya = new OWZarya((Map)stats.get("zarya"));

        if(stats.get("mercy")!= null){
            this.mercyTime = (Double)stats.get("mercy");
        }
        //this.mercy = new OWMercy((Map)stats.get("mercy"));

        if(stats.get("mccree")!= null){
            this.mccreeTime = (Double)stats.get("mccree"); //deccaroni
        }
        //this.mccree = new OWMccree((Map)stats.get("mccree"));

        if(stats.get("reinhardt")!= null){
            this.reinhardtTime = (Double)stats.get("reinhardt");
        }
        //this.reinhardt = new OWReinhardt((Map)stats.get("reinhardt"));

        if(stats.get("soldier76")!= null){
            this.soldier76Time = (Double)stats.get("soldier76");
        }
        //this.soldier76 = new OWSoldier76((Map)stats.get("soldier76"));

        if(stats.get("zenyatta")!= null){
            this.zenyattaTime = (Double)stats.get("zenyatta");
        }
        //this.zenyatta = new OWZenyatta((Map)stats.get("zenyatta"));

        if(stats.get("pharah")!= null){
            this.pharahTime = (Double)stats.get("pharah");
        }
        //this.pharah = new OWPharah((Map)stats.get("pharah"));

        if(stats.get("symmetra")!= null){
            this.symmetraTime = (Double)stats.get("symmetra");
        }
        //this.symmetra = new OWSymmetra((Map)stats.get("symmetra"));

        if(stats.get("torbjorn")!= null){
            this.torbjornTime = (Double)stats.get("torbjorn");
        }
        //this.torbjorn = new OWTorbjorn((Map)stats.get("torbjorn"));
    }
 }


