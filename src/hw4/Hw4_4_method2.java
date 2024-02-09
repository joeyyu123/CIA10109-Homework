package hw4;

import java.util.HashMap;
import java.util.Map;
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
public class Hw4_4_method2 {
    public static void main(String[] args) {
        // 存放員工資料
        Map<Integer, Integer> staffs = new HashMap<>();
        staffs.put(25, 2500);
        staffs.put(32, 800);
        staffs.put(8, 500);
        staffs.put(19, 1000);
        staffs.put(27, 1200);

        // 輸入要借的金額
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入要借多少錢: ");
        int borrow = sc.nextInt();

        int count = 0;


        String staffIds = "";

        for (Map.Entry<Integer, Integer> entry : staffs.entrySet()) {
            if (entry.getValue() >= borrow) {
                count++;
                staffIds += entry.getKey()+ " ";
            }
        }

        System.out.println("員工編號:" + staffIds);
        System.out.println("共 " + count + " 人");
        sc.close();
    }
}
