package hw4;

/**
 * 有個字串陣列如下 (八大行星)：
 * {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * (提示：字元比對，String方法)
 */
public class Hw4_3 {
    public static void main(String[] args) {


        String[] planets = new String[]{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        Character[] vowels = new Character[]{'a', 'e', 'i', 'o', 'u'};

        int count = 0;


        // 判斷單字中的每個字母是否為母音
        for (String planet : planets) {
            for (char c : planet.toCharArray()) {
                for (Character vowel : vowels) {
                    if (c == vowel) {
                        count++;
                    }
                }
            }
        }
        System.out.println("總共"+count+"個母音");

    }
}
