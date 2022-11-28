package ca.ewanbaxter.weapon;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;

public class Hammer extends Weapon {

    // Hammer static properties
    private static final int WEIGHT = 15;
    private static final int ATTACK_MOD = 8;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A hammer is a slow weapon. It has a high weight " +
            "but deals massive amounts of damage";

    // Hammer image
    private static ImageIcon image;

    // Constructor
    public Hammer() {
        super(WEIGHT, ATTACK_MOD);
    }


    public static ImageIcon getImage() {

        try {
            image = new ImageIcon(ImageIO.read(new File("images/hammer.png")));
        } catch (IOException e) {
            System.out.println("Error loading Hammer image\n");
        }

        return image;
    }

}
