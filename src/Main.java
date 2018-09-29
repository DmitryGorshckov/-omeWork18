import java.io.*;

public class Main {
    /**
     *
     * Копирование файла с одной кодировкой в фай с другой.
     */
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("test.txt")){   //по умолчанию кодировка UTF-8
            os.write("Hello, Мир!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream is = new FileInputStream("test.txt")){
            int b;
            byte[] bytes = new byte[1000];
            if((b=is.read(bytes))!=-1){
                String s = new String(bytes,"Windows-1251");
                System.out.println(s);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
