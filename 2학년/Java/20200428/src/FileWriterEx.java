import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        fout = new FileWriter("test.txt");
        while(true) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                break;
            }
            fout.write(line, 0, line.length());
            fout.write("\r\n", 0, 2);
        }
        fout.close();
        sc.close();
    }
}
