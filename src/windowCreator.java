import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class windowCreator implements ActionListener {

    JFrame frame;
    JLabel charSheetLabel;
    ImageIcon charSheetImage;

        public void charSheetWindow() {
            JLabel charNameLabel;
            JLabel charAgeLabel;
            JLabel charRealmLabel;
            JLabel charSpiritualRootLabel;
            JLabel charBodyLabel;
            JLabel charExpLabel;
            JLabel charRootQualityLabel;
            JLabel charRootPurityAttributeLabel;
            JLabel charBonesLabel;
            JLabel charMeridianLabel;
            JLabel charSectLabel;
            JLabel charStatLabel;
            JLabel charStrLabel;
            JLabel charComprehensionLabel;
            JLabel charIntLabel;
            JLabel charChrLabel;
            JLabel charSpiritStonesLabel;
            JLabel charLckLabel;
            JLabel charHpLabel;
            JLabel charContributionLabel;
            JLabel charQiLabel;
            JLabel charSkillsLabel;
            JLabel charMainTechiquesLabel;
            JButton allTechniquesButton;
            JButton inventoryButton;
            JButton calculateCostButton;

            frame = new JFrame("Character Sheet");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            try {
                charSheetImage = new ImageIcon(getClass().getResource("mortal_Sheet.png"));
                charSheetLabel = new JLabel(charSheetImage);
                frame.add(charSheetLabel);
            } catch (Exception E) {
                System.out.println("Image not found");
            }
            frame.setSize(720, 940);
            frame.setVisible(true);
            charNameLabel = new JLabel();
            charNameLabel.setBounds(10, 10, 50, 25);
            frame.add(charNameLabel);

            charAgeLabel = new JLabel();
            charAgeLabel.setBounds(1, 1, 1, 25);
            frame.add(charAgeLabel);

            charRealmLabel = new JLabel();
            charRealmLabel.setBounds(1, 1, 1, 25);
            frame.add(charRealmLabel);

            charSpiritualRootLabel = new JLabel();
            charSpiritualRootLabel.setBounds(1, 1, 1, 25);
            frame.add(charSpiritualRootLabel);

            charBodyLabel = new JLabel();
            charBodyLabel.setBounds(1, 1, 1, 25);
            frame.add(charBodyLabel);

            charExpLabel = new JLabel();
            charExpLabel.setBounds(1, 1, 1, 25);
            frame.add(charExpLabel);

            charRootQualityLabel = new JLabel();
            charRootQualityLabel.setBounds(1, 1, 1, 25);
            frame.add(charRootQualityLabel);

            charRootPurityAttributeLabel = new JLabel();
            charRootPurityAttributeLabel.setBounds(1, 1, 1, 25);
            frame.add(charRootPurityAttributeLabel);

            charBonesLabel = new JLabel();
            charBonesLabel.setBounds(1, 1, 1, 25);
            frame.add(charBonesLabel);

            charMeridianLabel = new JLabel();
            charMeridianLabel.setBounds(1, 1, 1, 25);
            frame.add(charMeridianLabel);

            charSectLabel = new JLabel();
            charSectLabel.setBounds(1, 1, 1, 25);
            frame.add(charSectLabel);

            charStatLabel = new JLabel();
            charStatLabel.setBounds(1, 1, 1, 25);
            frame.add(charStatLabel);

            charStrLabel = new JLabel();
            charStrLabel.setBounds(1, 1, 1, 25);
            frame.add(charStrLabel);

            charComprehensionLabel = new JLabel();
            charComprehensionLabel.setBounds(1, 1, 1, 25);
            frame.add(charComprehensionLabel);

            charIntLabel = new JLabel();
            charIntLabel.setBounds(1, 1, 1, 25);
            frame.add(charIntLabel);

            charChrLabel = new JLabel();
            charChrLabel.setBounds(1, 1, 1, 25);
            frame.add(charChrLabel);

            charLckLabel = new JLabel();
            charLckLabel.setBounds(1, 1, 1, 25);
            frame.add(charLckLabel);

            charHpLabel = new JLabel();
            charHpLabel.setBounds(1, 1, 1, 25);
            frame.add(charHpLabel);

            charContributionLabel = new JLabel();
            charContributionLabel.setBounds(1, 1, 1, 25);
            frame.add(charContributionLabel);

            charQiLabel = new JLabel();
            charQiLabel.setBounds(1, 1, 1, 25);
            frame.add(charQiLabel);

            charSkillsLabel = new JLabel();
            charSkillsLabel.setBounds(1, 1, 1, 25);
            frame.add(charSkillsLabel);

            charMainTechiquesLabel = new JLabel();
            charMainTechiquesLabel.setBounds(1, 1, 1, 25);
            frame.add(charMainTechiquesLabel);

            allTechniquesButton = new JButton("All Techniques");
            allTechniquesButton.setBounds(1, 1, 1, 25);
            allTechniquesButton.addActionListener(this);
            frame.add(allTechniquesButton);

            inventoryButton = new JButton("Inventory");
            inventoryButton.setBounds(1, 1, 1, 25);
            inventoryButton.addActionListener(this);
            frame.add(inventoryButton);

            calculateCostButton = new JButton("Calculate Damage");
            calculateCostButton.setBounds(1, 1, 1, 25);
            calculateCostButton.addActionListener(this);
            frame.add(calculateCostButton);

            charSpiritStonesLabel = new JLabel();
            charSpiritStonesLabel.setBounds(1, 1, 1, 25);
            frame.add(charSpiritStonesLabel);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
