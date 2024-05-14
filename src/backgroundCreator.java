import javax.swing.*;

public class backgroundCreator extends JFrame {

    JFrame frame;
    JLabel charSheetLabel;
    ImageIcon charSheetImage;

    public backgroundCreator(){
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
    }
    public static  void main(String[] args) {
        backgroundCreator i = new backgroundCreator();
    }
}
