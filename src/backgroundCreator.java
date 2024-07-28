import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class backgroundCreator extends JPanel implements ActionListener {

    BufferedImage bg;
    BufferedImage ab;
    BufferedImage bb;
    BufferedImage ib;
    BufferedImage tb;
    private int bgWidth, bgHeight;
    private int scWidth, scHeight;
    public JLabel charNameLabel;
    public JLabel charAgeLabel;
    public JLabel charRealmLabel;
    public JLabel charSpiritualRootLabel;
    public JLabel charBodyLabel;
    public JLabel charExpLabel;
    public JLabel charRootQualityLabel;
    public JLabel charRootPurityAttributeLabel;
    public JLabel charBonesLabel;
    public JLabel charMeridianLabel;
    public JLabel charSectLabel;
    public JLabel charStatLabel;
    public JLabel charStrLabel;
    public JLabel charComprehensionLabel;
    public JLabel charIntLabel;
    public JLabel charChrLabel;
    public JLabel charSpiritStonesLabel;
    public JLabel charLckLabel;
    public JLabel charHpLabel;
    public JLabel charContributionLabel;
    public JLabel charQiLabel;
    public JLabel charSkillsLabel;
    public JLabel charMainTechiquesLabel;
    public JButton allTechniquesButton;
    public JButton inventoryButton;
    public JButton calculateCostButton;

    public backgroundCreator(String[] charInput){
        loadBackground();
        init();
        setPreferredSize(new Dimension(scWidth, scHeight));


        charNameLabel = new JLabel();
        charNameLabel.setBounds(10, 10, 50, 25);
        charNameLabel.setText("Name: " + charInput[0]);
        this.add(charNameLabel);

        charAgeLabel = new JLabel();
        charAgeLabel.setBounds(1, 1, 1, 25);
        charAgeLabel.setText("Age: " + charInput[2]);
        this.add(charAgeLabel);

        charRealmLabel = new JLabel();
        charRealmLabel.setBounds(1, 1, 1, 25);
        charRealmLabel.setText("Realm: " + charInput[16]);
        this.add(charRealmLabel);

        charSpiritualRootLabel = new JLabel();
        charSpiritualRootLabel.setBounds(1, 1, 1, 25);
        charSpiritualRootLabel.setText("Root: " + charInput[3]);
        this.add(charSpiritualRootLabel);

        charBodyLabel = new JLabel();
        charBodyLabel.setBounds(1, 1, 1, 25);
        charBodyLabel.setText("Body");
        this.add(charBodyLabel);

        charExpLabel = new JLabel();
        charExpLabel.setBounds(1, 1, 1, 25);
        charExpLabel.setText("Xp: " + charInput[1]);
        this.add(charExpLabel);

        charRootQualityLabel = new JLabel();
        charRootQualityLabel.setBounds(1, 1, 1, 25);
        charRootQualityLabel.setText("Root Quality: " + charInput[3]);
        this.add(charRootQualityLabel);

        charRootPurityAttributeLabel = new JLabel();
        charRootPurityAttributeLabel.setBounds(1, 1, 1, 25);
        charRootPurityAttributeLabel.setText("Attribute: " + charInput[4] + " " + charInput[5]);
        this.add(charRootPurityAttributeLabel);

        charBonesLabel = new JLabel();
        charBonesLabel.setBounds(1, 1, 1, 25);
        charBonesLabel.setText("Bones: " + charInput[6]);
        this.add(charBonesLabel);

        charMeridianLabel = new JLabel();
        charMeridianLabel.setBounds(1, 1, 1, 25);
        charMeridianLabel.setText("Meridians: " + charInput[7]);
        this.add(charMeridianLabel);

        charSectLabel = new JLabel();
        charSectLabel.setBounds(1, 1, 1, 25);
        charSectLabel.setText("Sect: " + charInput[8]);
        this.add(charSectLabel);

        charStatLabel = new JLabel();
        charStatLabel.setBounds(1, 1, 1, 25);
        charStatLabel.setText("Stats");
        this.add(charStatLabel);

        charStrLabel = new JLabel();
        charStrLabel.setBounds(1, 1, 1, 25);
        charStrLabel.setText("Strength: " + charInput[10] + "/10");
        this.add(charStrLabel);

        charComprehensionLabel = new JLabel();
        charComprehensionLabel.setBounds(1, 1, 1, 25);
        charComprehensionLabel.setText("Comprehension: " + charInput[9]);
        this.add(charComprehensionLabel);

        charIntLabel = new JLabel();
        charIntLabel.setBounds(1, 1, 1, 25);
        charIntLabel.setText("Inteligence: " + charInput[11] + "/10");
        this.add(charIntLabel);

        charChrLabel = new JLabel();
        charChrLabel.setBounds(1, 1, 1, 25);
        charChrLabel.setText("Charisma: " + charInput[12] + "/10");
        this.add(charChrLabel);

        charLckLabel = new JLabel();
        charLckLabel.setBounds(1, 1, 1, 25);
        charLckLabel.setText("Luck: " + charInput[13] + "/10");
        this.add(charLckLabel);

        charHpLabel = new JLabel();
        charHpLabel.setBounds(1, 1, 1, 25);
        charHpLabel.setText("Hp: " + "/");
        this.add(charHpLabel);

        charContributionLabel = new JLabel();
        charContributionLabel.setBounds(1, 1, 1, 25);
        charContributionLabel.setText("Contribution Points: " + charInput[14]);
        this.add(charContributionLabel);

        charQiLabel = new JLabel();
        charQiLabel.setBounds(1, 1, 1, 25);
        charQiLabel.setText("Qi: " + "qi" + "/" + "maxQi");
        this.add(charQiLabel);

        charSkillsLabel = new JLabel();
        charSkillsLabel.setBounds(1, 1, 1, 25);
        this.add(charSkillsLabel);

        charMainTechiquesLabel = new JLabel();
        charMainTechiquesLabel.setBounds(1, 1, 1, 25);
        this.add(charMainTechiquesLabel);

        allTechniquesButton = new JButton();
        allTechniquesButton.setBounds(1, 1, 100, 100);
        allTechniquesButton.addActionListener(this);
        allTechniquesButton.setIcon(new ImageIcon(tb));
        allTechniquesButton.setMargin(new Insets(0,0,0,0));
        allTechniquesButton.setBorder(null);
        allTechniquesButton.setPreferredSize(new Dimension(100,100));
        allTechniquesButton.setSize(100,100);
        this.add(allTechniquesButton);

        inventoryButton = new JButton();
        inventoryButton.setBounds(1, 1, 100, 100);
        inventoryButton.addActionListener(this);
        inventoryButton.setIcon(new ImageIcon(ib));
        inventoryButton.setMargin(new Insets(0,0,0,0));
        inventoryButton.setBorder(null);
        this.add(inventoryButton);

        calculateCostButton = new JButton();
        calculateCostButton.setBounds(1, 1, 100, 100);
        calculateCostButton.addActionListener(this);
        calculateCostButton.setIcon(new ImageIcon(ab));
        calculateCostButton.setMargin(new Insets(0,0,0,0));
        calculateCostButton.setBorder(null);
        this.add(calculateCostButton);

        charSpiritStonesLabel = new JLabel();
        charSpiritStonesLabel.setBounds(1, 1, 1, 25);
        charSpiritStonesLabel.setText("Spirit Stones: " + charInput[15]);
        this.add(charSpiritStonesLabel);
    }

    private void init(){
        bgWidth = bg.getWidth();
        bgHeight = bg.getHeight();
        scWidth = bgWidth;
        scHeight = bgHeight;

    }

    private void loadBackground(){
        try{
            bg = ImageIO.read((getClass().getResource("resources/mortal_Sheet.png")));
        }catch (IOException ioe){System.out.println("Unable to open file");}
        try{
            ab = ImageIO.read((getClass().getResource("resources/attack_Button.png")));
            bb = ImageIO.read((getClass().getResource("resources/back_Button.png")));
            ib = ImageIO.read((getClass().getResource("resources/inventory_Button.png")));
            tb = ImageIO.read((getClass().getResource("resources/techniques_Button.png")));
        }catch (Exception ex){System.out.println("Unable to open button files");}
    }

    @Override public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, bgWidth, bgHeight, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
