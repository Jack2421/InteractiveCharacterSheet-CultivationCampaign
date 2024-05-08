import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

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
    private JButton createCharButton;

    private JPanel charCreationPanel;
    private JLabel newCharNameLabel;
    private JTextField newCharNameField;
    private JLabel newCharExpLabel;
    private JFormattedTextField newCharExpField;
    private JLabel newCharAgeLabel;
    private JTextField newCharAgeField;
    private JLabel newCharRootQualtiyLabel;
    private JTextField newCharRootQualityField;
    private JLabel newCharAttributeLabel;
    private JTextField newCharAttributeField;
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


    public GUI() {

        frame = new JFrame();
        loginPanel = new JPanel();
        ykDamage = new JPanel();
        ykCultivation = new JPanel();
        fzDamage = new JPanel();
        fzCultivation = new JPanel();
        charCreationPanel = new JPanel();

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

        createCharButton = new JButton("Create Character");
        createCharButton.setBounds(100, 110, 150, 25);
        createCharButton.addActionListener(this);
        loginPanel.add(createCharButton);

        newCharNameLabel = new JLabel("Name:");
        newCharNameLabel.setBounds(10, 10, 80, 25);
        charCreationPanel.add(newCharNameLabel);

        newCharNameField = new JTextField();
        newCharNameField.setBounds(100, 10, 80,25);
        charCreationPanel.add(newCharNameField);
    }

    public static void main(String[] args) {
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
                } else if (cultivationCalc.isSelected()) {
                    success.setText("Not Yet Implemented!");
                    frame.remove(loginPanel);
                    frame.add(ykCultivation, BorderLayout.CENTER);
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
                } else if (cultivationCalc.isSelected()) {
                    success.setText("Not Yet Implemented!");
                    //frame.remove(loginPanel);
                    //frame.add(fzCultivation, BorderLayout.CENTER);
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

        } else if ((e.getSource() == createCharButton)) {
            //frame.remove(loginPanel);
            //frame.add(charCreationPanel, BorderLayout.CENTER);
            success.setText("Not Yet Implemented!");
        } else {
            System.out.println("Nope");
        }
    }
}
