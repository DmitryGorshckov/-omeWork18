import java.io.*;

/**
 * вариант удаления номеров с BufferedReader;
 */
public class Test {
    public static void main(String[] args) {
        try{
             BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("somefile3.txt"));
            while (reader.ready()) {
                String st = reader.readLine();
                String s = st.replaceAll("[0-9]","");
                writer.write(s);
            }
            writer.close();
        }catch (IOException e){e.printStackTrace();}

        }

}
