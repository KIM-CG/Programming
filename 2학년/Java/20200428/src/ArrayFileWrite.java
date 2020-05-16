import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayFileWrite {
    public static void main(String[] args) throws IOException {
        ArrayList<String> a = new ArrayList<String>();
        FileWriter fin = new FileWriter("test.txt");
        Scanner sc = new Scanner(System.in);
        String linedata = "";
        while(true) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                break;
            }
            a.add(line);
        }
        Collections.sort(a);
        for(String listdata : a) {
            linedata += listdata + "\r\n";
        }
        fin.write(linedata);
        System.out.println(a);
        fin.close();
        sc.close();
    }
}
