package ca.ewanbaxter.character;

import ca.ewanbaxter.weapon.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;

public class Fighter extends Player {

    // Fighter Class Constants
    public static final int FIGHTER_HP_MODIFIER = 30;
    public static final int FIGHTER_DEFENSE_MODIFIER = 15;
    public static final int FIGHTER_AGILITY_MODIFIER = -10;
    // Class description
    public static final String DESCRIPTION = "Fighters like to to be in the front lines of the " +
            "battle. They have high hit points and defense, but low agility.";

    // Class image icon
    private static ImageIcon image;


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


    public static ImageIcon getImage() {

        try {
            image = new ImageIcon(ImageIO.read(new File("images/fighter.png")));
        } catch (IOException e) {
            System.out.println("Error loading Fighter image\n");
        }

        return image;
    }

}
