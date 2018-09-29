import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
           Checktext();

    }

    /**
     * удаление номеров со Scanner.
     */
    public static void Checktext() {
        try {
            File file = new File("somefile.txt");
            Scanner sc = new Scanner(file);
            BufferedWriter writer = new BufferedWriter(new FileWriter("somefile2.txt"));
            while (sc.hasNext()) {

                if (sc.hasNextLong()) {
                    long a = sc.nextLong();
                } else {
                    String d = sc.next();
                    writer.write(d);
                    System.out.print(d);
                }
            }
            writer.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
