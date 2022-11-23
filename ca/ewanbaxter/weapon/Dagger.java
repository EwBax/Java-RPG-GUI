package ca.ewanbaxter.weapon;

public class Dagger extends Weapon {

    // Dagger static properties
    private static final int WEIGHT = 5;
    private static final int ATTACK_MOD = 3;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A dagger is a quick weapon. It has a very low" +
            " weight but also deals lower amounts of damage than heavier weapons.";

    // Constructor
    public Dagger() {
        super(WEIGHT, ATTACK_MOD);
    }

}
