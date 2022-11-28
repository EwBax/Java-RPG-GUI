package ca.ewanbaxter.weapon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Sword extends Weapon {

    // Sword static properties
    private static final int WEIGHT = 10;
    private static final int ATTACK_MOD = 5;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A sword is a well rounded weapon. It is not too " +
            "heavy and deals decent amounts of damage.";

    // Sword image
    private static ImageIcon image;


    // Constructor
    public Sword() {
        super(WEIGHT, ATTACK_MOD);
    }

    public static ImageIcon getImage() {

        try {
            image = new ImageIcon(ImageIO.read(new File("images/sword.png")));
        } catch (IOException e) {
            System.out.println("Error loading Sword image\n");
        }

        return image;
    }
}
