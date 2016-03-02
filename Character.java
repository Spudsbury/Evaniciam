package com.company;

import com.sun.media.jfxmedia.events.PlayerStateEvent;
import com.sun.org.glassfish.external.statistics.Stats;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by corbot on 2/26/2016.
 */
public class Character {

    private CharacterProfile playerProfile;
    private Charisma charisma;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intellect intellect;
    private Strength strength;
    private Wisdom wisdom;

    public Character(CharacterProfile playerProfile, Charisma charisma, Dexterity dexterity, Constitution constitution, Intellect intellect, Strength strength, Wisdom wisdom) {
        this.playerProfile = playerProfile;
        this.charisma = charisma;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intellect = intellect;
        this.strength = strength;
        this.wisdom = wisdom;
    }


    //These methods when called will return the players stats
    public void returnCha(){
        System.out.println(charisma.getStat());
    }
    public void returnInt(){
        System.out.println(intellect.getStat());
    }
}
