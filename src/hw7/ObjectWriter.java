package hw7;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        File dir = new File("C:/data");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(dir, "Object.ser");
        Object[] objs = new Object[4];
        objs[0] = new Dog("Dog1");
        objs[1] = new Dog("Dog2");
        objs[2] = new Cat("Cat1");
        objs[3] = new Cat("Cat2");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < objs.length; i++) {
                oos.writeObject(objs[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
