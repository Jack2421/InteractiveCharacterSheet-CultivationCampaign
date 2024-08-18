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
    Image newab;
    Image newbb;
    Image newib;
    Image newtb;
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
    public JButton backBtn;
    public JScrollPane charNameScrPn;

    public backgroundCreator(String[] charInput){
        loadBackground();
        init();
        setPreferredSize(new Dimension(scWidth, scHeight));
        this.setLayout(null);



        charNameLabel = new JLabel();
        charNameLabel.setBounds(230, 10, 200, 40);
        charNameLabel.setText(convertToMultiline("Name: \n" + charInput[0]));
        charNameLabel.setFont(new Font("Courier", Font.PLAIN, 15));
        this.add(charNameLabel);

        charAgeLabel = new JLabel();
        charAgeLabel.setBounds(390, 10, 100, 25);
        charAgeLabel.setText("Age: " + charInput[2]);
        this.add(charAgeLabel);

        charRealmLabel = new JLabel();
        charRealmLabel.setBounds(550, 10, 200, 25);
        charRealmLabel.setText("Realm: " + charInput[16]);
        this.add(charRealmLabel);

        charSpiritualRootLabel = new JLabel();
        charSpiritualRootLabel.setBounds(230, 70, 200, 25);
        charSpiritualRootLabel.setText("Spiritual Root [" + "%]");
        this.add(charSpiritualRootLabel);

        charBodyLabel = new JLabel();
        charBodyLabel.setBounds(390, 70, 100, 25);
        charBodyLabel.setText("Body");
        this.add(charBodyLabel);

        charExpLabel = new JLabel();
        charExpLabel.setBounds(550, 70, 100, 25);
        charExpLabel.setText("Xp: " + charInput[1] + "/");
        this.add(charExpLabel);

        charRootQualityLabel = new JLabel();
        charRootQualityLabel.setBounds(230, 140, 100, 25);
        charRootQualityLabel.setText("Root Quality: " + charInput[3]);
        this.add(charRootQualityLabel);

        charRootPurityAttributeLabel = new JLabel();
        charRootPurityAttributeLabel.setBounds(230, 170, 200, 25);
        charRootPurityAttributeLabel.setText("Attribute: " + charInput[4] + " " + charInput[5]);
        this.add(charRootPurityAttributeLabel);

        charBonesLabel = new JLabel();
        charBonesLabel.setBounds(390, 140, 100, 25);
        charBonesLabel.setText("Bones: " + charInput[6]);
        this.add(charBonesLabel);

        charMeridianLabel = new JLabel();
        charMeridianLabel.setBounds(390, 170, 100, 25);
        charMeridianLabel.setText("Meridians: " + charInput[7]);
        this.add(charMeridianLabel);

        charSectLabel = new JLabel();
        charSectLabel.setBounds(550, 140, 400, 25);
        charSectLabel.setText("Sect: " + charInput[8]);
        this.add(charSectLabel);

        charStatLabel = new JLabel();
        charStatLabel.setBounds(1, 1, 1, 25);
        charStatLabel.setText("Stats");
        this.add(charStatLabel);

        charStrLabel = new JLabel();
        charStrLabel.setBounds(20, 265, 100, 25);
        charStrLabel.setText("Strength: " + charInput[10] + "/10");
        this.add(charStrLabel);

        charComprehensionLabel = new JLabel();
        charComprehensionLabel.setBounds(250, 265, 150, 25);
        charComprehensionLabel.setText("Comprehension: " + charInput[9]);
        this.add(charComprehensionLabel);

        charIntLabel = new JLabel();
        charIntLabel.setBounds(480, 265, 100, 25);
        charIntLabel.setText("Inteligence: " + charInput[11] + "/10");
        this.add(charIntLabel);

        charChrLabel = new JLabel();
        charChrLabel.setBounds(20, 315, 100, 25);
        charChrLabel.setText("Charisma: " + charInput[12] + "/10");
        this.add(charChrLabel);

        charLckLabel = new JLabel();
        charLckLabel.setBounds(480, 315, 100, 25);
        charLckLabel.setText("Luck: " + charInput[13] + "/10");
        this.add(charLckLabel);

        charHpLabel = new JLabel();
        charHpLabel.setBounds(20, 365, 100, 25);
        charHpLabel.setText("Hp: " + "/");
        this.add(charHpLabel);

        charContributionLabel = new JLabel();
        charContributionLabel.setBounds(250, 365, 200, 25);
        charContributionLabel.setText("Contribution Points: " + charInput[14]);
        this.add(charContributionLabel);

        charQiLabel = new JLabel();
        charQiLabel.setBounds(480, 365, 100, 25);
        charQiLabel.setText("Qi: " + "qi" + "/" + "maxQi");
        this.add(charQiLabel);

        charSkillsLabel = new JLabel();
        charSkillsLabel.setBounds(1, 1, 1, 25);
        this.add(charSkillsLabel);

        charMainTechiquesLabel = new JLabel();
        charMainTechiquesLabel.setBounds(1, 1, 1, 25);
        this.add(charMainTechiquesLabel);

        allTechniquesButton = new JButton();
        allTechniquesButton.setBounds(60, 800, 100, 100);
        allTechniquesButton.addActionListener(this);
        allTechniquesButton.setIcon(new ImageIcon(newtb));
        allTechniquesButton.setMargin(new Insets(0,0,0,0));
        allTechniquesButton.setBorder(null);
        allTechniquesButton.setPreferredSize(new Dimension(100,100));
        allTechniquesButton.setSize(100,100);
        this.add(allTechniquesButton);

        inventoryButton = new JButton();
        inventoryButton.setBounds(220, 800, 100, 100);
        inventoryButton.addActionListener(this);
        inventoryButton.setIcon(new ImageIcon(newib));
        inventoryButton.setMargin(new Insets(0,0,0,0));
        inventoryButton.setBorder(null);
        inventoryButton.setPreferredSize(new Dimension(100,100));
        inventoryButton.setSize(100,100);
        this.add(inventoryButton);

        calculateCostButton = new JButton();
        calculateCostButton.setBounds(380, 800, 100, 100);
        calculateCostButton.addActionListener(this);
        calculateCostButton.setIcon(new ImageIcon(newab));
        calculateCostButton.setMargin(new Insets(0,0,0,0));
        calculateCostButton.setBorder(null);
        calculateCostButton.setPreferredSize(new Dimension(100, 100));
        this.add(calculateCostButton);

        backBtn = new JButton();
        backBtn.setBounds(540, 800, 100, 100);
        backBtn.addActionListener(this);
        backBtn.setIcon(new ImageIcon(newbb));
        backBtn.setMargin(new Insets(0, 0, 0,0));
        backBtn.setBorder(null);
        backBtn.setPreferredSize(new Dimension(100,100));
        this.add(backBtn);


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
        System.out.println(scWidth);
        System.out.println(scHeight);

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
            newab = ab.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            newbb = bb.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            newib = ib.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            newtb = tb.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        }catch (Exception ex){System.out.println("Unable to open button files");}
    }

    public static String convertToMultiline(String orig)
    {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }


    @Override public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, bgWidth, bgHeight, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
