import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class characterCreator {
    public static String createCharacter(String name, String exp, String age, String rootQuality, String rootPurity, String rootAttribute, String bones, String meridians, String sect, String comprehension, String strength, String inteligence, String charisma, String luck, String contribution, String stones, String realm) {
        String filepath = "src/charSheets/character_Stats.csv";
        String filepathTwo = "src/charSheets/char_Names.csv";
        try {
            FileWriter charfw = new FileWriter(filepath, true);
            BufferedWriter charbw = new BufferedWriter(charfw);
            PrintWriter charpw = new PrintWriter(charbw);

            charpw.println(name+","+exp+","+age+","+rootQuality+","+rootPurity+","+rootAttribute+","+bones+","+meridians+","+sect+","+comprehension+","+strength+","+inteligence+","+charisma+","+luck+","+contribution+","+stones+","+realm);
            charpw.flush();
            charpw.close();

            FileWriter charNamefw = new FileWriter(filepathTwo, true);
            BufferedWriter charNamebw = new BufferedWriter(charNamefw);
            PrintWriter charNamepw = new PrintWriter(charNamebw);

            charNamepw.println(name);
            charNamepw.flush();
            charNamepw.close();
        }
        catch (Exception E) {
            System.out.println("character creation failed");
        }

        return name;
    }

    public  static  void createCombat(String name, String rank, String comprehension, String cost, String damage, String maxQi, String effectCost, String effect, String description) {
        String filepath = "src/charSheets/combat_Techniques.csv";
        try {
            FileWriter combatfw = new FileWriter(filepath, true);
            BufferedWriter combatbw = new BufferedWriter(combatfw);
            PrintWriter combatpw = new PrintWriter(combatbw);

            combatpw.println(name+","+rank+","+comprehension+","+cost+","+damage+","+maxQi+","+effectCost+","+effect+","+description);
            combatpw.flush();
            combatpw.close();
        }
        catch (Exception E) {
            System.out.println("combat technique creation failed");
        }
    }

    public static void createCultivation(String name, String rank, String peak, String comprehension, String expGain, String description) {
        String filepath = "src/charSheets/cultivation_Techniques.csv";
        try {
            FileWriter cultivationfw = new FileWriter(filepath, true);
            BufferedWriter cultivationbw = new BufferedWriter(cultivationfw);
            PrintWriter cultivationpw = new PrintWriter(cultivationbw);

            cultivationpw.println(name+","+rank+","+comprehension+","+peak+","+comprehension+","+expGain+","+description);
            cultivationpw.flush();
            cultivationpw.close();
        }
        catch (Exception E) {
            System.out.println("cultivation technique creation failed");
        }
    }

    public static void createEscape(String name, String rank, String comprehension, String cost, String speed, String description) {
        String filepath = "src/charSheets/escape_Techniques.csv";
        try {
            FileWriter escapefw = new FileWriter(filepath, true);
            BufferedWriter escapebw = new BufferedWriter(escapefw);
            PrintWriter escapepw = new PrintWriter(escapebw);

            escapepw.println(name+","+rank+","+comprehension+","+cost+","+speed+","+description);
            escapepw.flush();
            escapepw.close();
        }
        catch (Exception E) {
            System.out.println("Escape technique creation failed");
        }
    }

    public  static  void createMovement(String name, String rank, String comprehension, String lowerLvlCost, String sameLvlCost, String higherLvlCost, String description) {
        String filepath = "src/charSheets/movement_Techniques.csv";
        try {
            FileWriter movementfw = new FileWriter(filepath, true);
            BufferedWriter movementbw = new BufferedWriter(movementfw);
            PrintWriter movementpw = new PrintWriter(movementbw);

            movementpw.println(name+","+rank+","+comprehension+","+lowerLvlCost+","+sameLvlCost+","+higherLvlCost+","+description);
            movementpw.flush();
            movementpw.close();

        }
        catch (Exception E) {
            System.out.println("Movement technique creation failed");
        }
    }

    public static void createItem(String name, String amount, String description) {
        String filepath = "src/charSheets/character_Inventory.csv";
        try {
            FileWriter escapefw = new FileWriter(filepath, true);
            BufferedWriter escapebw = new BufferedWriter(escapefw);
            PrintWriter escapepw = new PrintWriter(escapebw);

            escapepw.println(name+","+amount+","+description);
            escapepw.flush();
            escapepw.close();
        }
        catch (Exception E) {
            System.out.println("Item creation failed");
        }
    }
}
