package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
 * Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
 */
public class SampleReader {
    public static void main(String[] args) {
        long bytes = 0, chars = 0, lines = 0;

        try {
            File myDir = new File("C:/CIA10109_WORKSPACE/CIA10109-Homework/src/hw7");
            File file = new File(myDir, "Sample.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            bytes = file.length();

            while ((br.read() != -1)) {
                chars++;
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            File myDir = new File("C:/CIA10109_WORKSPACE/CIA10109-Homework/src/hw7");
            File file = new File(myDir, "Sample.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                lines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sample.txt檔案共有" + bytes + "個位元組，" + chars + "個字元，" + lines + "列資料\n");


    }
}
