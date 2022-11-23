package ca.ewanbaxter.character;

import ca.ewanbaxter.weapon.Weapon;

public class Cleric extends Player {

    // Cleric class constants
    private static final int CLERIC_DEFENSE_MODIFIER = 15;
    private static final int CLERIC_AGILITY_MODIFIER = 15;
    private static final int CLERIC_ATTACK_MODIFIER = -10;
    // Class description
    public static final String DESCRIPTION = "Clerics excel in survival. They have high defense " +
            "and agility which allows them to avoid damage, but they in turn deal lower damage " +
            "than other classes.";


    // Constructor
    public Cleric(String name, Weapon playerWeapon) {
        super(name, playerWeapon);
    }

    // Cleric specific rollStats method
    @Override
    public void rollStats() {

        // rolling stats like normal
        super.rollStats();

        // Then adding Cleric modifiers
        super.setDefense(super.getDefense() + CLERIC_DEFENSE_MODIFIER);
        super.setAgility(super.getAgility() + CLERIC_AGILITY_MODIFIER);
        super.setBaseAttack(super.getBaseAttack() + CLERIC_ATTACK_MODIFIER);

    }
    
}
