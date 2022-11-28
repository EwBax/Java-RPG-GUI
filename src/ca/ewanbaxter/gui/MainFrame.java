package ca.ewanbaxter.gui;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {

    // Background color constant for panels to use
    public static final String      BACKGROUND_COLOR = "#9DA2AC";
    public static final Font        OLD_ENGLISH = new Font("Old English Text MT", Font.PLAIN, 12);
    public static final Font        CALIBRI = new Font("Calibri", Font.PLAIN, 12);


    // Panels / Screens
    public static SplashScreen      splashScreen;
    public static CharacterScreen   characterScreen;


    // Constructor
    public MainFrame() {

        this.setTitle("D&D Game");

        // Making program exit when frame is closed
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Setting the layout to absolute positioning
        this.setLayout(null);

        // Setting the size of the Frame
        this.setSize(750, 750);

        // Making frame centered on screen
        this.setLocationRelativeTo(null);

        // Creating splash Screen
        splashScreen = new SplashScreen();
        splashScreen.setBounds(0, 0, 750, 750);
        splashScreen.setVisible(true);

        // Creating character screen
        characterScreen = new CharacterScreen();
        characterScreen.setBounds(0, 0, 750, 750);
        characterScreen.setVisible(false);


        this.add(splashScreen);
        this.add(characterScreen);
    }


}
