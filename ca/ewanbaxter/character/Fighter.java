package ca.ewanbaxter.character;

import ca.ewanbaxter.weapon.*;

public class Fighter extends Player {

    // Fighter Class Constants
    private static final int FIGHTER_HP_MODIFIER = 30;
    private static final int FIGHTER_DEFENSE_MODIFIER = 15;
    private static final int FIGHTER_AGILITY_MODIFIER = -10;
    // Class description
    public static final String DESCRIPTION = "Fighters like to to be in the front lines of the " +
            "battle. They have high hit points and defense, but low agility.";


    // Constructor
    public Fighter(String name, Weapon playerWeapon) {
        super(name, playerWeapon);
    }

    // Fighter specific rollStats method
    @Override
    public void rollStats() {

        // rolling stats like normal
        super.rollStats();

        // Then adding Fighter modifiers
        super.setHitPoints(super.getHitPoints() + FIGHTER_HP_MODIFIER);
        super.setDefense(super.getDefense() + FIGHTER_DEFENSE_MODIFIER);
        super.setAgility(super.getAgility() + FIGHTER_AGILITY_MODIFIER);

    }

}
