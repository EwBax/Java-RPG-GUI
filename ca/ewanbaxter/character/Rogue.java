package ca.ewanbaxter.character;

import ca.ewanbaxter.weapon.*;

public class Rogue extends Player {

    // Rogue class constants
    private static final int ROGUE_DEFENSE_MODIFIER = -10;
    private static final int ROGUE_AGILITY_MODIFIER = 15;
    private static final int ROGUE_ATTACK_MODIFIER = 15;
    // Class description
    public static final String DESCRIPTION = "Rogues strike from the shadows. They wear light " +
            "armor which gives them a boost to agility at the cost of defense. Their quickness " +
            "allows them to deal higher amounts of damage.";


    // Constructor
    public Rogue(String name, Weapon playerWeapon) {
        super(name, playerWeapon);
    }

    // Rogue specific rollStats method
    @Override
    public void rollStats() {

        // rolling stats like normal
        super.rollStats();

        // Then adding rogue modifiers
        super.setDefense(super.getDefense() + ROGUE_DEFENSE_MODIFIER);
        super.setAgility(super.getAgility() + ROGUE_AGILITY_MODIFIER);
        super.setBaseAttack(super.getBaseAttack() + ROGUE_ATTACK_MODIFIER);

    }
}
