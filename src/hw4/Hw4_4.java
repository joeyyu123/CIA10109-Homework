package hw4;

import java.util.Scanner;

/**
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
 * 表如下：
 * 編號{25,32,8,19,27}
 * 現金{2500,800,500,1000,1200}
 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
 * 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
 * 員工編號: 25 19 27 共 3 人!」
 * (提示：Scanner，二維陣列) map?
 */

public class Hw4_4 {
    public static void main(String[] args) {
        int[][] staffs = new int[][]{{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入要借多少錢");
        int borrow = sc.nextInt();
        System.out.print("員工編號: ");
        for (int[] staff : staffs) {
            if (staff[1] >= borrow) {
                System.out.print(staff[0] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("共 " + count + " 人");
        sc.close();
    }
}
