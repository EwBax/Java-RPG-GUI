package ca.ewanbaxter.weapon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Dagger extends Weapon {

    // Dagger static properties
    private static final int WEIGHT = 5;
    private static final int ATTACK_MOD = 3;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A dagger is a quick weapon. It has a very low" +
            " weight but also deals lower amounts of damage than heavier weapons.";
    private static ImageIcon image;


    // Constructor
    public Dagger() {
        super(WEIGHT, ATTACK_MOD);
    }


    public static ImageIcon getImage() {

        try {
            image = new ImageIcon(ImageIO.read(new File("images/dagger.png")));
        } catch (IOException e) {
            System.out.println("Error loading Dagger image\n");
        }

        return image;
    }

}
