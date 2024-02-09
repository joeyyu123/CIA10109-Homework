package hw5;

import java.util.Scanner;

/**
 * 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，
 */
public class Work01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入寬與高");

        int weight = sc.nextInt();
        int height = sc.nextInt();
        starSquare(weight, height);
        sc.close();
    }

    public static void starSquare(int weight, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
