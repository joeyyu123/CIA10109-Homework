package hw3;

import java.util.Random;
import java.util.Scanner;

public class Hw3_2 {
    // TODO 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
    //      對則顯示正確訊息,
    //      (進階: 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        //產生亂數
        int ans = rd.nextInt(101);

        //判斷用戶猜測的答案是否正確
        while (true) {
            System.out.println("請猜一個0~100的數字");
            int guess = sc.nextInt();
            if (guess == ans) {
                System.out.println("答對了! 答案是" + ans);
                break;
            } else if (guess > ans){
                System.out.println("猜錯摟~答案比較小");
            }else {
                System.out.println("猜錯摟~答案比較大");
            }
        }
    }
}
