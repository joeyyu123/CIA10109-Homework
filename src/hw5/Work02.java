package hw5;

import java.util.Arrays;
import java.util.Random;

/**
 * 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
 */
public class Work02 {
    public static void main(String[] args) {
        Work02 work02 = new Work02();
        work02.randAvg();
    }

    public void randAvg() {
        int[] randNum = new int[10];
        Random random = new Random();
        int sum = 0;
        double average;

        for (int i = 0; i < randNum.length; i++) {
            randNum[i] = random.nextInt(101);
        }
        System.out.println("本次亂數結果:");
        System.out.println(Arrays.toString(randNum));

        for (int i : randNum) {
            sum += i;
        }
        average = (double) sum / randNum.length;

        System.out.println("平均為 " + average);
    }
}
