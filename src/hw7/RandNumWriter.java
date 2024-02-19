package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
 * append功能讓每次執行結果都能被保存起來)
 */

public class RandNumWriter {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();


        while (set.size() != 10) {
            set.add(random.nextInt(1, 1001));
        }

        System.out.println(set);

        File file = new File("C:/CIA10109_WORKSPACE/CIA10109-Homework/src/hw7/Data.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream ps = new PrintStream(bos);
            ps.println(set);

            ps.close();
            bos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
