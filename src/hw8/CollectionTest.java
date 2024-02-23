package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add(new Integer(100));
        collection.add(new Double(3.14));
        collection.add(new Long(21L));
        collection.add(new Short("100"));
        collection.add(new Double(5.1));
        collection.add("Kitty");
        collection.add(new Integer(100));
        collection.add(new Object());
        collection.add("Snoopy");
        collection.add(new BigInteger("1000"));

        for (int i = 0; i < collection.size(); i++) {
            System.out.println(((ArrayList) collection).get(i));
        }
        System.out.println("-----------------------------");

        // Iterator
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------");

        // for each
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("------------------------------");

        // 移除不是java.Lang.Number的物件
        collection.removeIf(o -> !(o instanceof Number));

        // 印出
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}

