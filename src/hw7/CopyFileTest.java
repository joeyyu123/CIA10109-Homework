package hw7;

import java.io.*;

public class CopyFileTest {
    public void copyFile(File f1, File f2) throws IOException {
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);
        int i;
        while ((i = br.read()) != -1) {
            bw.write(i);
            bw.flush();
        }
    }

    public static void main(String[] args) {
        CopyFileTest cft = new CopyFileTest();
        File f1 = new File("C:/CIA10109_WORKSPACE/CIA10109-Homework/src/hw7/Data.txt");
        File f2 = new File("C:/CIA10109_WORKSPACE/CIA10109-Homework/src/hw7/Data2.txt");

        try {
            cft.copyFile(f1, f2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
