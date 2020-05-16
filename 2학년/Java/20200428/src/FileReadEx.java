import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("C:\\Users\\User\\Desktop\\text.txt");
            int c;
            while((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
