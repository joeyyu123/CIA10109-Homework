package hw10;

import java.math.BigInteger;
import java.util.Random;

/**
 * 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
 * 為質數
 */

public class Hw10_1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            BigInteger bigInteger = BigInteger.valueOf((long) (Math.random() * 100 + 1));
            if (bigInteger.isProbablePrime(100)) {
                System.out.println(bigInteger + "是質數");
            } else {
                System.out.println(bigInteger + "不是質數");
            }
        }
    }
}
