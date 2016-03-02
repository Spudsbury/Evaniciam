package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        //Start asking player info here

        String name;
        String gender;
        String race;
        System.out.println("A gentle voice sings out to you from the distance, it asks you your name: ");
        name = input.next();


        //This will prompt the player to enter a gender.
       System.out.println(name + " are you male or female?");
        gender = input.next().toLowerCase();


        //This while loop has a nested if statement that validates the response from player
        //if the player enters anything besides "male" or "female" the loop fails and the player is asked again until
        //they enter a valid gender

        while (!gender.equals("male") || !gender.equals("female")) {
            if (gender.equals("male") || gender.equals("female")) {
                break;  //breaks out of loop once validated.
            }
            if(!"male".equals(gender) || !"female".equals(gender)){
                System.out.println("Please enter a valid gender");
            System.out.println(name + " are you male or female?");
                gender = input.next().toLowerCase();}


        }



            System.out.println(name + " you are a funny looking creature, what race are you?");
            race = input.next();

      //Building the character starts here.

    //Basically each attribute is created as a new object. Then combined into the master Class Character.
    //From the character class, we can call various methods to affect each attribute separately.
        Dexterity playerDex = new Dexterity();
        Strength playerStr = new Strength();
        Intellect playerInt = new Intellect();
        Wisdom playerWis = new Wisdom();
        Constitution playerCon = new Constitution();
        Charisma playerCha = new Charisma(8);

        //Create the master class
        CharacterProfile newProfile = new CharacterProfile(name, gender, race);

        //combine the elements together
        Character newCharacter = new Character(newProfile,playerCha,playerDex,playerCon,playerInt,playerStr,playerWis);




// Boolean determine when the game quits


        boolean gameOver = false;
        System.out.println("Do you want to quit? [Q]");
        //while loop to keep the game running until quit
while (!gameOver){
    String response = input.nextLine().toLowerCase();   //we use to lower case so we can process all entries regardless of input
    if(response.equals("q")){
        gameOver=true;
}



}

        }
}
