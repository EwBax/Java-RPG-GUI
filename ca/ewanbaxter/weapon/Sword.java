package ca.ewanbaxter.weapon;

public class Sword extends Weapon {

    // Sword static properties
    private static final int WEIGHT = 10;
    private static final int ATTACK_MOD = 5;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A sword is a well rounded weapon. It is not too " +
            "heavy and deals decent amounts of damage.";

    // Constructor
    public Sword() {
        super(WEIGHT, ATTACK_MOD);
    }

}
