package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/data/Object.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object[] objs = new Object[4];
        try {
            for (int i = 0; i < objs.length; i++) {
                objs[i] = ois.readObject();
            }
        } catch (EOFException e) {
            System.out.println("資料讀取完畢");
        }
        for (Object obj : objs) {
            if (obj instanceof Dog) {
                ((Dog) obj).speak();
            } else
                ((Cat) obj).speak();
        }

        ois.close();
        fis.close();
    }
}
