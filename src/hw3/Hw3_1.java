package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {
    public static void main(String[] args) {

        //TODO 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
        //     三角形、其它三角形或不是三角形,如圖示結果:
        //     (進階功能：加入直角三角形的判斷)

        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];

        //接收用戶輸入的資料
        System.out.println("請輸入三個數字");
        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);

        // 判斷為何種三角形
        if (!(data[0] + data[1] > data[2])) {
            System.out.println("不是三角形");
        } else if (data[0] == data[1] && data[0] == data[2]) {
            System.out.println("正三角形");
        } else if (data[0] == data[1] || data[0] == data[2] || data[1] == data[2]) {
            System.out.println("等腰三角形");
        } else if (Math.pow(data[0],2) + Math.pow(data[1],2) == Math.pow(data[2],2) ) {
            System.out.println("直角三角形");
        } else {
            System.out.println("其他三角形");
        }
    }
}
