package Evanaciam;
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
    public void returnStats(){
        //will return all stats
        System.out.println("Charisma: " + charisma.getStat());
        System.out.println("Wisdom: " + wisdom.getStat());
        System.out.println("Strength:" + strength.getStat());
        System.out.println("Intellect: " + intellect.getStat());
        System.out.println("Constitution: " + constitution.getStat());
        System.out.println("Dexterity: " + dexterity.getStat());
    }
}
