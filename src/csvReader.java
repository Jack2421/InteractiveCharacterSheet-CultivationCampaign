import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.lang3.ArrayUtils;
import java.io.LineNumberReader;

public class csvReader {
    public static String[] readCategory(String path, int category) {
        String line = "";
        String[] values = {};
        String[] test = {};
        try {
            BufferedReader categorybr = new BufferedReader(new FileReader(path));
            while ((line = categorybr.readLine()) != null) {
                test = line.split(",");
                values = (String[]) ArrayUtils.add(values, test[category]);
                System.out.println(values);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return values;
    }
    public static String[] readLine(String path, int line) {
        String row = "test";
        String[] rowArray = null;
        System.out.println("Looking for line #" + line);
        int lineNumber = 0;

        try {
            BufferedReader linebr = new BufferedReader(new FileReader(path));
            System.out.println("Reading line #" + lineNumber);
            while (rowArray == null) {
                row = linebr.readLine();
                System.out.println("Reading #" + lineNumber);
                //System.out.println("Reading line: " + row);
                if (lineNumber == line ){
                    rowArray = row.split(",");
                    System.out.println("Found: " + rowArray[0]);
                } else if (lineNumber > 1000) {
                    System.out.println("Got stuck in a loop");
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Found line #" + lineNumber);
        return rowArray;
    }
}
