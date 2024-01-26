package hw3;

import java.util.*;

public class HW3_3_method2 {
    /**
     * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
     * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9)
     * 畫面會顯示他可以選擇的號碼與總數
     * (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] availableNum = new int[49];

        int count = 0;

        System.out.println("請輸入你討厭哪個數字 (1~9)");
        int hateNum = sc.nextInt();

        // 確保使用者輸入的是1到9之間的數字
        if (hateNum < 1 || hateNum > 9) {
            System.out.println("請輸入1到9之間的數字");
            return;
        }

        for (int j = 1; j <= 49; j++) {
            if (j % 10 == hateNum || j / 10 == hateNum)
                continue;
            System.out.print(j + " ");
            availableNum[count] = j;
            count++;
        }
        System.out.println("\n總共:" + count + "個數字可以選");

        // 選出六個不重複的數字

        int[] chosenNum = new int[6];
        int index;

        outer:
        for (int j = 0; j < chosenNum.length; j++) {
            // 隨機選取一個索引值
            index = (int) (Math.random() * count);
            // 若chosenNum中沒有出現過的話就放進去陣列
            // 若出現過的話把計數減一並回到外層迴圈
            for (int i : chosenNum) {
                if (availableNum[index] == i) {
                    j--;
                    continue outer;
                }
            }
            chosenNum[j] = availableNum[index];
        }

        // 輸出選好的數字
        System.out.println("幫你選好以下六個數字");
        for (int j = 0; j < 6; j++) {
            System.out.print(chosenNum[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}
