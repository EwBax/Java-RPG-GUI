package ca.ewanbaxter.character;

import javax.swing.ImageIcon;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Character {

    // Character Class Constants
    private static final int MIN_HIT_POINTS = 30;
    private static final int MAX_HIT_POINTS = 80;
    private static final int MIN_DEFENSE = 30;
    private static final int MAX_DEFENSE = 60;
    private static final int MIN_AGILITY = 30;
    private static final int MAX_AGILITY = 60;
    private static final int MIN_BASE_ATTACK = 15;
    private static final int MAX_BASE_ATTACK = 30;


    // Character Properties
    private String      name;
    private int         hitPoints;
    private int         defense;
    private int         agility;
    private int         baseAttack;


    // Character Constructor
    public Character(String name) {
        this.name = name;
    }


    @Override
    public abstract String toString();


    // Method for randomly generating stats / properties for Character
    public void rollStats() {
        // Using ThreadLocalRandom.current().nextInt(int bound) to generate random ints in range
        // Generates from 0 (inclusive) to bound (exclusive)
        // So bound is range of values (MAX - MIN), with MAX + 1 to have MAX be inclusive
        // Then we add the minimum value to have the proper range of values
        this.hitPoints =
                ThreadLocalRandom.current().nextInt((MAX_HIT_POINTS + 1) - MIN_HIT_POINTS)
                        + MIN_HIT_POINTS;
        this.defense =
                ThreadLocalRandom.current().nextInt((MAX_DEFENSE + 1) - MIN_DEFENSE)
                        + MIN_DEFENSE;
        this.agility =
                ThreadLocalRandom.current().nextInt((MAX_AGILITY + 1) - MIN_AGILITY)
                        + MIN_AGILITY;
        this.baseAttack =
                ThreadLocalRandom.current().nextInt((MAX_BASE_ATTACK + 1) - MIN_BASE_ATTACK)
                        + MIN_BASE_ATTACK;

    }


    //----------------------------------------------------------------------------------------------
    //---------------------------------GETTERS AND SETTERS------------------------------------------
    //----------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

}
