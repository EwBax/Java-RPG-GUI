package ca.ewanbaxter.gui;

import ca.ewanbaxter.character.*;
import ca.ewanbaxter.weapon.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterScreen extends JPanel {

    // Font sizes
    private static final float TITLE_FONT =     54f;
    private static final float MEDIUM_FONT =    26f;
    private static final float SMALL_FONT =     19f;
    private static final float TEXT_AREA_FONT = 14f;

    // Data for character creation
    private CharacterType   typeSelection;
    private WeaponType      weaponSelection;

    // Screen components
    private JLabel      titleLabel;
    private JLabel      nameLabel;
    private JLabel      typeLabel;
    private JLabel      typeImageLabel;
    private JLabel      statsLabel;
    private JLabel      weaponLabel;
    private JLabel      weaponImageLabel;
    private JTextField  nameText;
    private JTextArea   typeDescription;
    private JTextArea   weaponDescription;


    // Constructor
    public CharacterScreen() {

        // Setting layout and background color
        this.setLayout(null);
        this.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));

        // title label
        titleLabel = new JLabel("Character Generator");
        titleLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(TITLE_FONT));
        titleLabel.setBounds(154, 6, 442, 66);

        // name label
        nameLabel = new JLabel("Enter Name");
        nameLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        nameLabel.setBounds(53, 94, 134, 32);

        // Name text Field
        nameText = new JTextField();
        nameText.setBounds(212, 100, 212, 26);

        // type label
        typeLabel = new JLabel("Character Type");
        typeLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        typeLabel.setBounds(53, 151, 162, 32);

        // type image label
        typeImageLabel = new JLabel("Select a Type");
        typeImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        typeImageLabel.setBounds(255, 181, 105, 140);
        typeImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // type description
        typeDescription = new JTextArea();
        typeDescription.setLineWrap(true);
        typeDescription.setWrapStyleWord(true);
        typeDescription.setBounds(53, 340, 371, 71);
        typeDescription.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        typeDescription.setFont(MainFrame.CALIBRI.deriveFont(TEXT_AREA_FONT));

        // Weapon label
        weaponLabel = new JLabel("Select Your Weapon");
        weaponLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        weaponLabel.setBounds(53, 431, 220, 32);

        // weapon image label
        weaponImageLabel = new JLabel("Select a Weapon");
        weaponImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        weaponImageLabel.setBounds(255, 475, 105, 140);
        weaponImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // weapon description
        weaponDescription = new JTextArea();
        weaponDescription.setLineWrap(true);
        weaponDescription.setWrapStyleWord(true);
        weaponDescription.setBounds(53, 623, 371, 51);
        weaponDescription.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        weaponDescription.setFont(MainFrame.CALIBRI.deriveFont(TEXT_AREA_FONT));


        this.add(titleLabel);
        this.add(nameLabel);
        this.add(nameText);
        this.add(typeLabel);
        this.add(typeImageLabel);
        this.add(typeDescription);
        this.add(weaponLabel);
        this.add(weaponImageLabel);
        this.add(weaponDescription);
        addTypeButtonGroup();
        addWeaponButtons();

    }


    // Method to create character type button group
    private void addTypeButtonGroup() {

        ButtonGroup typeGroup = new ButtonGroup();

        // Cleric button
        JRadioButton clericButton = new JRadioButton("Cleric");
        clericButton.setBounds(53, 190, 100, 50);
        clericButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        clericButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        typeGroup.add(clericButton);

        // Fighter button
        JRadioButton fighterButton = new JRadioButton("Fighter");
        fighterButton.setBounds(53, 237, 100, 50);
        fighterButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        fighterButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        typeGroup.add(fighterButton);

        // Rogue Button
        JRadioButton rogueButton = new JRadioButton("Rogue");
        rogueButton.setBounds(53, 284, 100, 50);
        rogueButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        rogueButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        typeGroup.add(rogueButton);


        // Adding action listeners
        clericButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeSelection = CharacterType.CLERIC;
                typeImageLabel.setIcon(Cleric.getImage());
                typeImageLabel.setText("");
                typeDescription.setText(Cleric.DESCRIPTION);
            }
        });

        fighterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeSelection = CharacterType.FIGHTER;
                typeImageLabel.setIcon(Fighter.getImage());
                typeImageLabel.setText("");
                typeDescription.setText(Fighter.DESCRIPTION);
            }
        });

        rogueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeSelection = CharacterType.ROGUE;
                typeImageLabel.setIcon(Rogue.getImage());
                typeImageLabel.setText("");
                typeDescription.setText(Rogue.DESCRIPTION);
            }
        });

        this.add(clericButton);
        this.add(fighterButton);
        this.add(rogueButton);
    }


    private void addWeaponButtons() {

        ButtonGroup weaponGroup = new ButtonGroup();

        // Cleric button
        JRadioButton daggerButton = new JRadioButton("Dagger");
        daggerButton.setBounds(53, 470, 100, 50);
        daggerButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        daggerButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weaponGroup.add(daggerButton);

        // Fighter button
        JRadioButton hammerButton = new JRadioButton("Hammer");
        hammerButton.setBounds(53, 517, 100, 50);
        hammerButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        hammerButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weaponGroup.add(hammerButton);

        // Rogue Button
        JRadioButton swordButton = new JRadioButton("Sword");
        swordButton.setBounds(53, 564, 100, 50);
        swordButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        swordButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weaponGroup.add(swordButton);


        // Adding action listeners
        daggerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weaponSelection = WeaponType.DAGGER;
                weaponImageLabel.setIcon(Dagger.getImage());
                weaponImageLabel.setText("");
                weaponDescription.setText(Dagger.DESCRIPTION);
            }
        });

        hammerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weaponSelection = WeaponType.HAMMER;
                weaponImageLabel.setIcon(Hammer.getImage());
                weaponImageLabel.setText("");
                weaponDescription.setText(Hammer.DESCRIPTION);
            }
        });

        swordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weaponSelection = WeaponType.SWORD;
                weaponImageLabel.setIcon(Sword.getImage());
                weaponImageLabel.setText("");
                weaponDescription.setText(Sword.DESCRIPTION);
            }
        });

        this.add(daggerButton);
        this.add(hammerButton);
        this.add(swordButton);
    }
}
