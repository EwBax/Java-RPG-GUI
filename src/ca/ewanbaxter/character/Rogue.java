package ca.ewanbaxter.character;

import ca.ewanbaxter.weapon.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;

public class Rogue extends Player {

    // Rogue class constants
    public static final int ROGUE_DEFENSE_MODIFIER = -10;
    public static final int ROGUE_AGILITY_MODIFIER = 15;
    public static final int ROGUE_ATTACK_MODIFIER = 15;
    // Class description
    public static final String DESCRIPTION = "Rogues strike from the shadows. They wear light " +
            "armor which gives them a boost to agility at the cost of defense. Their quickness " +
            "allows them to deal higher amounts of damage.";

    // Class image icon
    private static ImageIcon image;


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


    public static ImageIcon getImage() {

        try {
            image = new ImageIcon(ImageIO.read(new File("images/rogue.png")));
        } catch (IOException e) {
            System.out.println("Error loading Rogue image\n");
        }

        return image;
    }

}
