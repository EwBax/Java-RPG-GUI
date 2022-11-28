package ca.ewanbaxter.character;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;

public class Monster extends Character {

    // Monster properties
    private MonsterType monsterType;
    private ImageIcon   image;

    //Constructor
    public Monster(String name, MonsterType monsterType) {
        super(name);
        this.monsterType = monsterType;
        this.setImage();
    }


    // Method to set proper image based on monster type
    private void setImage() {

        // Getting proper image
        switch (this.monsterType) {

            // Beholder is also the default image
            case BEHOLDER:
            default:

                try {
                    this.image = new ImageIcon(ImageIO.read(new File("images/beholder.png")));
                } catch (IOException e) {
                    System.out.println("Error loading Beholder image\n");
                }

                break;

            case DRAGON:

                try {
                    this.image = new ImageIcon(ImageIO.read(new File("images/dragon.png")));
                } catch (IOException e) {
                    System.out.println("Error loading dragon image");
                }

                break;

            case VAMPIRE:

                try {
                    this.image = new ImageIcon(ImageIO.read(new File("images/vampire.jpeg")));
                } catch (IOException e) {
                    System.out.println("Error loading vampire image");
                }

                break;

        }

    }


    @Override
    public String toString() {

        return String.format("""
                        Monster: %s
                        --------------------
                        HP: %3d      Defense: %3d      Agility: %3d     Base Attack: %3d""",
                super.getName(),
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getBaseAttack()
        );

    }


    public ImageIcon getImage() {
        return this.image;
    }

}
