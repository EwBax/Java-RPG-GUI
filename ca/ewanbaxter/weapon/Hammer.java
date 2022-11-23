package ca.ewanbaxter.weapon;

public class Hammer extends Weapon {

    // Hammer static properties
    private static final int WEIGHT = 15;
    private static final int ATTACK_MOD = 8;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A hammer is a slow weapon. It has a high weight " +
            "but deals massive amounts of damage";

    // Constructor
    public Hammer() {
        super(WEIGHT, ATTACK_MOD);
    }

}
