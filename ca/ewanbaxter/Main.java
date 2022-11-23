package ca.ewanbaxter;

import ca.ewanbaxter.character.*;
import ca.ewanbaxter.weapon.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the RPG Character Creator!\n");

        Player playerCharacter = new Cleric("Jim", new Hammer());

        playerCharacter.rollStats();

        System.out.println(playerCharacter);

    }

}
