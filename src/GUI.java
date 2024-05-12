import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;

public class GUI implements ActionListener {

    private JLabel userLabel;
    private JLabel passwordLabel;
    private JFrame frame;
    private JPanel loginPanel;
    private JLabel success;
    private JButton loginButton;
    private JPasswordField passwordText;
    private JTextField userText;
    private JPanel ykDamage;
    private JCheckBox damageCalc;
    private JCheckBox cultivationCalc;
    private ButtonGroup cultivationDamage;
    private JPanel ykCultivation;
    private int qiUsed;
    private JRadioButton risingSea1stStrike;
    private JRadioButton risingSea2ndStrike;
    private JRadioButton risingSea3rdStrike;
    private JRadioButton swiftStrikes;
    private JButton calculate;
    private JFormattedTextField qiUsedField;
    private String user;
    private ButtonGroup ykAttacks;
    private int damage;
    private JLabel damageDealt;
    private JLabel qiUsedLabel;
    private JPanel fzDamage;
    private JPanel fzCultivation;
    private JRadioButton ironPalmStrike;
    private ButtonGroup fzAttacks;
    private JButton createNewCharButton;
    private JPanel charCreationPanel;
    private JLabel newCharNameLabel;
    private JTextField newCharNameField;
    private JLabel newCharExpLabel;
    private JFormattedTextField newCharExpField;
    private JLabel newCharAgeLabel;
    private JTextField newCharAgeField;
    private JLabel newCharRootQualtiyLabel;
    private JTextField newCharRootQualityField;
    private JLabel newCharRootPurityLabel;
    private JTextField newCharRootPurityField;
    private JLabel newCharRootAttributeLabel;
    private JTextField newCharRootAttributeField;
    private JLabel newCharBonesLabel;
    private JTextField newCharBonesField;
    private JLabel newCharMeridianLabel;
    private JTextField newCharMeridianField;
    private JLabel newCharSectLabel;
    private JTextField newCharSectField;
    private JLabel newCharComprehensionLabel;
    private JTextField newCharComprehensionField;
    private JLabel newCharStrLabel;
    private JFormattedTextField newCharStrField;
    private JLabel newCharChrLabel;
    private JFormattedTextField newCharChrField;
    private JLabel newCharIntLabel;
    private JFormattedTextField newCharIntField;
    private JLabel newCharLckLabel;
    private JFormattedTextField newCharLckField;
    private JLabel newCharHealthLabel;
    private JFormattedTextField newCharHealthField;
    private JLabel newCharContributionLabel;
    private JFormattedTextField newCharContributionField;
    private JLabel newCharSpiritStonesLabel;
    private JFormattedTextField newCharSpiritStonesField;
    private JButton createCharButton;
    private characterCreator newCharacter;
    private JPanel charSheet;
    private JComboBox chooseChar;
    private JButton charSheetButton;

    private JLabel charNameLabel;
    private JLabel charAgeLabel;
    private JLabel charRealmLabel;
    private JLabel charSpitualRootLabel;
    private JLabel charBodyLabel;
    private JLabel charExpLabel;
    private JLabel charRootQualityLabel;
    private JLabel charRootPurityAttributeLabel;
    private JLabel charBonesLabel;
    private JLabel charMeridianLabel;
    private JLabel charSectLabel;
    private JLabel charStatLabel;
    private JLabel charStrLabel;
    private JLabel charComprehensionLabel;
    private JLabel charIntLabel;
    private JLabel charChrLabel;
    private JLabel charSpiritStonesLabel;
    private JLabel charLckLabel;
    private JLabel charHpLabel;
    private JLabel charContributionLabel;
    private JLabel charQiLabel;
    private JLabel charSkillsLabel;
    private JLabel charMainTechiquesLabel;
    private JButton allTechniquesButton;
    private JButton inventoryButton;
    private JPanel inventoryPanel;
    private JPanel techniquesPanel;
    private JButton calculateCostButton;
    private String name;
    private int age;
    private String realm;
    private int spiritualRoot;
    private String rootQuality;
    private String rootAttribute;
    private String bones;
    private String meridians;
    private String sect;
    private int exp;
    private int str;
    private int intel;
    private int chr;
    private int lck;
    private String comprehension;
    private int maxHp;
    private int hp;
    private int contribution;
    private int maxQi;
    private int qi;
    private String techOne;
    private String techTwo;
    private String techThree;
    private String techFour;
    private String techFive;
    private String skillOne;
    private String skillTwo;
    private String skillThree;
    private String skillFour;
    private String skillFive;
    private String[] charNames = {};
    private String test;
    private int x = 0;
    private String  charSelected;
    private int y;

    public GUI() {

        frame = new JFrame();
        loginPanel = new JPanel();
        ykDamage = new JPanel();
        ykCultivation = new JPanel();
        fzDamage = new JPanel();
        fzCultivation = new JPanel();
        charCreationPanel = new JPanel();
        charSheet = new JPanel();

        frame.setSize(1000, 1000);
        frame.add(loginPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cultivation Campaign Damage Calculator");
        frame.pack();
        frame.setVisible(true);

        loginPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        loginPanel.setLayout(null);

        charCreationPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        charCreationPanel.setLayout(null);

        ykDamage.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        ykDamage.setLayout(null);

        ykCultivation.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        ykCultivation.setLayout(null);

        fzDamage.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        fzDamage.setLayout(null);

        fzCultivation.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        fzCultivation.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        loginPanel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        loginPanel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        loginPanel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        loginPanel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 110, 80, 25);
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);

        success = new JLabel("");
        success.setBounds(10, 140, 300, 25);
        loginPanel.add(success);

        damageCalc = new JCheckBox("Damage Calculator");
        damageCalc.setBounds(10, 80, 200, 25);
        loginPanel.add(damageCalc);

        cultivationCalc = new JCheckBox("Cultivation Calculator");
        cultivationCalc.setBounds(220, 80, 200, 25);
        loginPanel.add(cultivationCalc);

        cultivationDamage = new ButtonGroup();
        cultivationDamage.add(damageCalc);
        cultivationDamage.add(cultivationCalc);

        swiftStrikes = new JRadioButton("Swift Strikes");
        swiftStrikes.setBounds(10, 10, 150, 25);
        ykDamage.add(swiftStrikes);

        risingSea1stStrike = new JRadioButton("Rising Sea 1st Strike");
        risingSea1stStrike.setBounds(10, 40, 150, 25);
        ykDamage.add(risingSea1stStrike);

        risingSea2ndStrike = new JRadioButton("Rising Sea 2nd Strike");
        risingSea2ndStrike.setBounds(10, 70, 150, 25);
        ykDamage.add(risingSea2ndStrike);

        risingSea3rdStrike = new JRadioButton("Rising Sea 3rd Strike");
        risingSea3rdStrike.setBounds(10, 100, 150, 25);
        ykDamage.add(risingSea3rdStrike);

        ykAttacks = new ButtonGroup();
        ykAttacks.add(swiftStrikes);
        ykAttacks.add(risingSea1stStrike);
        ykAttacks.add(risingSea2ndStrike);
        ykAttacks.add(risingSea3rdStrike);

        ironPalmStrike = new JRadioButton("Iron Palm Strike");
        ironPalmStrike.setBounds(10, 10, 150, 25);
        fzDamage.add(ironPalmStrike);

        fzAttacks = new ButtonGroup();
        fzAttacks.add(ironPalmStrike);

        calculate = new JButton("Calculate!");
        calculate.setBounds(10, 130, 150, 25);
        calculate.addActionListener(this);
        ykDamage.add(calculate);
        fzDamage.add(calculate);

        qiUsedLabel = new JLabel("Qi Used:");
        qiUsedLabel.setBounds(200, 10, 60, 25);
        ykDamage.add(qiUsedLabel);
        fzDamage.add(qiUsedLabel);

        NumberFormat qiUsedFormat = NumberFormat.getNumberInstance();
        qiUsedField = new JFormattedTextField(qiUsedFormat);
        qiUsedField.setBounds(270, 10, 100, 25);
        ykDamage.add(qiUsedField);
        fzDamage.add(qiUsedField);

        damageDealt = new JLabel();
        damageDealt.setBounds(205, 50, 1000, 25);
        ykDamage.add(damageDealt);
        fzDamage.add(damageDealt);

        createNewCharButton = new JButton("Create Character");
        createNewCharButton.setBounds(100, 110, 150, 25);
        createNewCharButton.addActionListener(this);
        loginPanel.add(createNewCharButton);

        newCharNameLabel = new JLabel("Name:");
        newCharNameLabel.setBounds(10, 10, 50, 25);
        charCreationPanel.add(newCharNameLabel);

        newCharNameField = new JTextField();
        newCharNameField.setBounds(160, 10, 80,25);
        charCreationPanel.add(newCharNameField);

        newCharExpLabel = new JLabel("Total Expirience:");
        newCharExpLabel.setBounds(10, 40, 100, 25);
        charCreationPanel.add(newCharExpLabel);

        NumberFormat newCharExpFormat = NumberFormat.getNumberInstance();
        newCharExpField = new JFormattedTextField(newCharExpFormat);
        newCharExpField.setBounds(160, 40, 80, 25);
        charCreationPanel.add(newCharExpField);

        newCharAgeLabel = new JLabel("Age:");
        newCharAgeLabel.setBounds(10, 70, 50, 25);
        charCreationPanel.add(newCharAgeLabel);

        NumberFormat newCharAgeFormat = NumberFormat.getNumberInstance();
        newCharAgeField = new JFormattedTextField(newCharAgeFormat);
        newCharAgeField.setBounds(160, 70, 80, 25);
        charCreationPanel.add(newCharAgeField);

        newCharRootQualtiyLabel = new JLabel("Spiritual Root Quality:");
        newCharRootQualtiyLabel.setBounds(10, 100, 140, 25);
        charCreationPanel.add(newCharRootQualtiyLabel);

        newCharRootQualityField = new JTextField();
        newCharRootQualityField.setBounds(160, 100, 80, 25);
        charCreationPanel.add(newCharRootQualityField);

        newCharRootPurityLabel = new JLabel("Spiritual Root Purity:");
        newCharRootPurityLabel.setBounds(10, 130, 140, 25);
        charCreationPanel.add(newCharRootPurityLabel);

        newCharRootPurityField = new JTextField();
        newCharRootPurityField.setBounds(160, 130, 80, 25);
        charCreationPanel.add(newCharRootPurityField);

        newCharRootAttributeLabel = new JLabel("Spiritual Root Attribute:");
        newCharRootAttributeLabel.setBounds(10, 160, 140, 25);
        charCreationPanel.add(newCharRootAttributeLabel);

        newCharRootAttributeField = new JTextField();
        newCharRootAttributeField.setBounds(160, 160, 80, 25);
        charCreationPanel.add(newCharRootAttributeField);

        newCharBonesLabel = new JLabel("Bones:");
        newCharBonesLabel.setBounds(10, 190, 140, 25);
        charCreationPanel.add(newCharBonesLabel);

        newCharBonesField = new JTextField();
        newCharBonesField.setBounds(160, 190, 80, 25);
        charCreationPanel.add(newCharBonesField);

        newCharMeridianLabel = new JLabel("Meridians:");
        newCharMeridianLabel.setBounds(10, 220, 140, 25);
        charCreationPanel.add(newCharMeridianLabel);

        newCharMeridianField = new JTextField();
        newCharMeridianField.setBounds(160, 220, 80, 25);
        charCreationPanel.add(newCharMeridianField);

        newCharSectLabel = new JLabel("Sect:");
        newCharSectLabel.setBounds(260, 10, 140, 25);
        charCreationPanel.add(newCharSectLabel);

        newCharSectField = new JTextField();
        newCharSectField.setBounds(410, 10, 80, 25);
        charCreationPanel.add(newCharSectField);

        newCharComprehensionLabel = new JLabel("Comprehension:");
        newCharComprehensionLabel.setBounds(260, 40, 140, 25);
        charCreationPanel.add(newCharComprehensionLabel);

        newCharComprehensionField = new JTextField();
        newCharComprehensionField.setBounds(410, 40, 80, 25);
        charCreationPanel.add(newCharComprehensionField);

        newCharStrLabel = new JLabel("Strength:");
        newCharStrLabel.setBounds(260, 70, 140, 25);
        charCreationPanel.add(newCharStrLabel);

        NumberFormat newCharStrFormat = NumberFormat.getNumberInstance();
        newCharStrField = new JFormattedTextField(newCharStrFormat);
        newCharStrField.setBounds(410, 70, 80, 25);
        charCreationPanel.add(newCharStrField);

        newCharIntLabel = new JLabel("Inteligence:");
        newCharIntLabel.setBounds(260, 100, 140, 25);
        charCreationPanel.add(newCharIntLabel);

        NumberFormat newCharIntFormat = NumberFormat.getNumberInstance();
        newCharIntField = new JFormattedTextField(newCharIntFormat);
        newCharIntField.setBounds(410, 100, 80, 25);
        charCreationPanel.add(newCharIntField);

        newCharChrLabel = new JLabel("Charisma:");
        newCharChrLabel.setBounds(260, 130, 140, 25);
        charCreationPanel.add(newCharChrLabel);

        NumberFormat newCharChrFormat = NumberFormat.getNumberInstance();
        newCharChrField = new JFormattedTextField(newCharChrFormat);
        newCharChrField.setBounds(410, 130, 80, 25);
        charCreationPanel.add(newCharChrField);

        newCharLckLabel = new JLabel("Luck:");
        newCharLckLabel.setBounds(260, 160, 140, 25);
        charCreationPanel.add(newCharLckLabel);

        NumberFormat newCharLckFormat = NumberFormat.getNumberInstance();
        newCharLckField = new JFormattedTextField(newCharLckFormat);
        newCharLckField.setBounds(410, 160, 80, 25);
        charCreationPanel.add(newCharLckField);

        newCharContributionLabel = new JLabel("Contribution Points:");
        newCharContributionLabel.setBounds(260, 190, 140, 25);
        charCreationPanel.add(newCharContributionLabel);

        NumberFormat newCharContributionFormat = NumberFormat.getNumberInstance();
        newCharContributionField = new JFormattedTextField(newCharContributionFormat);
        newCharContributionField.setBounds(410, 190, 80, 25);
        charCreationPanel.add(newCharContributionField);

        newCharSpiritStonesLabel = new JLabel("Spirit Stones:");
        newCharSpiritStonesLabel.setBounds(260, 220, 140, 25);
        charCreationPanel.add(newCharSpiritStonesLabel);

        NumberFormat newCharSpiritStonesFormat = NumberFormat.getNumberInstance();
        newCharSpiritStonesField = new JFormattedTextField(newCharSpiritStonesFormat);
        newCharSpiritStonesField.setBounds(410, 220, 80, 25);
        charCreationPanel.add(newCharSpiritStonesField);

        createCharButton = new JButton("Create Character");
        createCharButton.setBounds(50, 250, 390, 50);
        createCharButton.addActionListener(this);
        charCreationPanel.add(createCharButton);

        chooseChar = new JComboBox();
        chooseChar.setBounds(260, 110, 150, 25);
        loginPanel.add(chooseChar);

        charSheetButton = new JButton("Open Character Sheet");
        charSheetButton.setBounds(420, 110, 180, 25);
        charSheetButton.addActionListener(this);
        loginPanel.add(charSheetButton);

        charNameLabel = new JLabel();
        charNameLabel.setBounds(10, 10, 50, 25);
        charSheet.add(charNameLabel);

        charNames = csvReader.readCategory("src/charSheets/char_Names.csv", 0);
        try {
            while ((test = charNames[x]) != null) {
                chooseChar.addItem(test);
                x++;
            }
            x = 0;
        } catch (Exception E) {
            System.out.println("chooseChar setup finished");
        }


    }

    public static void main(String[] args) {

        //while
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = passwordText.getText();

            if(username.equals("Yang Kai") && password.equals("1234")) {
                if (damageCalc.isSelected()) {
                    user = "Yang Kai";
                    success.setText("Login successful!");
                    frame.remove(loginPanel);
                    frame.add(ykDamage, BorderLayout.CENTER);
                    frame.revalidate();
                    frame.repaint();
                } else if (cultivationCalc.isSelected()) {
                    success.setText("Not Yet Implemented!");
                    frame.remove(loginPanel);
                    frame.add(ykCultivation, BorderLayout.CENTER);
                    frame.revalidate();
                    frame.repaint();
                }
                else {
                    success.setText("Choose Calculator!");
                }
            } else if (username.equals("Fu Zihao") && password.equals("1927")) {
                if (damageCalc.isSelected()) {
                    user = "Fu Zihao";
                    success.setText("Login successful!");
                    frame.remove(loginPanel);
                    frame.add(fzDamage, BorderLayout.CENTER);
                    frame.revalidate();
                    frame.repaint();
                } else if (cultivationCalc.isSelected()) {
                    success.setText("Not Yet Implemented!");
                    //frame.remove(loginPanel);
                    //frame.add(fzCultivation, BorderLayout.CENTER);
                    //frame.revalidate();
                }
                else {
                    success.setText("Choose Calculator!");
                }
            } else {
                success.setText("Login Failed!");
            }
        } else if ((e.getSource() == calculate) && damageCalc.isSelected()) {
            qiUsed = ((Number)qiUsedField.getValue()).intValue();
            if (user.equals("Yang Kai")) {
                if (swiftStrikes.isSelected() && (qiUsed <= 200)) {
                    damage = (qiUsed/10) + 11;
                    damageDealt.setText("You dealt " + damage + " damage!");
                } else if ((risingSea1stStrike.isSelected() && qiUsed <= 99)) {
                    damage = (qiUsed/4) + 11;
                    damageDealt.setText("You dealt " + damage + " damage!");
                } else if (risingSea1stStrike.isSelected() && (qiUsed <= 200)) {
                    damage = (qiUsed/4) + 11;
                    damageDealt.setText("You dealt " + damage + " damage! and an additional 50 damage to armor!");
                } else if (risingSea2ndStrike.isSelected() && (qiUsed < 200)) {
                    damage = (qiUsed/3) + 11;
                    damageDealt.setText("You dealt " + damage + " damage!");
                } else if (risingSea2ndStrike.isSelected() && (qiUsed == 200)) {
                    damageDealt.setText("You dealt " + (75 + 11) + " damage!");
                } else if (risingSea3rdStrike.isSelected() && (qiUsed <= 500)) {
                    damage = (qiUsed/2) + 11;
                    damageDealt.setText("You dealt " + damage + " damage! and sent forward a wave of qi attacking all enemies within 50 ft!");
                } else {
                    damageDealt.setText("Select technique or use less qi!");
                }
            } else if (user.equals("Fu Zihao")) {
                if (ironPalmStrike.isSelected() && (qiUsed <= 400)) {
                    damage = (qiUsed/5) + 13;
                    damageDealt.setText("You dealt " + damage + " damage!");
                } else {
                    damageDealt.setText("Select technique or use less qi!");
                }
            }
        } else if ((e.getSource() == calculate) && cultivationCalc.isSelected()) {

        } else if ((e.getSource() == createNewCharButton)) {
            frame.add(charCreationPanel, BorderLayout.CENTER);
            frame.remove(loginPanel);
            frame.revalidate();
        } else if ((e.getSource() == createCharButton)) {
            String name = newCharNameField.getText();
            String exp = newCharExpField.getText();
            String age = newCharAgeField.getText();
            String rootQuality = newCharRootQualityField.getText();
            String rootPurity = newCharRootPurityField.getText();
            String rootAttribute = newCharRootAttributeField.getText();
            String bones = newCharBonesField.getText();
            String meridians = newCharMeridianField.getText();
            String sect = newCharSectField.getText();
            String comprehension = newCharComprehensionField.getText();
            String strength = newCharStrField.getText();
            String inteligence = newCharIntField.getText();
            String charisma = newCharChrField.getText();
            String luck = newCharLckField.getText();
            String contribution = newCharContributionField.getText();
            String stones = newCharSpiritStonesField.getText();
            newCharacter = new characterCreator();
            chooseChar.addItem(newCharacter.createCharacter(name, exp, age, rootQuality, rootPurity, rootAttribute, bones, meridians, sect, comprehension, strength, inteligence, charisma, luck, contribution, stones));
            frame.add(loginPanel, BorderLayout.CENTER);
            frame.remove(charCreationPanel);
            frame.revalidate();
            frame.repaint();
            success.setText("Character Created!");
        } else if (e.getSource() == charSheetButton) {
            charSelected = chooseChar.getSelectedItem().toString();
            y = 0;
            while (!(charNames[0].equals(charSelected))) {
                charNames = csvReader.readLine("src/charSheets/character_Stats.csv", y);
                System.out.println("Looking for character: " + charSelected);
                System.out.println("Found Char: " + charNames[0]);
                if (charNames[0].equals(charSelected)) {
                    System.out.println("Correct Character Found");
                } else {
                    System.out.println("Still Looking");
                    y++;
                }
            }
            frame.add(charSheet, BorderLayout.CENTER);
            frame.remove(loginPanel);
            frame.revalidate();
            frame.repaint();
            charNameLabel.setText("Name: " + charNames[0]);

        } else {
            System.out.println("error?");
        }
    }
}