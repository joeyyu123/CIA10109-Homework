package hw2;

public class hw2 {
    public static void main(String[] args) {
        // TODO 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("偶數和: " + sum);
        System.out.println("==========================================");

        // TODO 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
        int sumProduct = 1;
        for (int i = 1; i <= 10; i++) {
            sumProduct *= i;
        }
        System.out.println("連乘積: "+sumProduct);
        System.out.println("==========================================");

        // TODO 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
        int i = 1;
        sumProduct = 1;
        while (i <= 10) {
            sumProduct *= i;
            i++;
        }
        System.out.println("連乘積: "+sumProduct);
        System.out.println("==========================================");

        // TODO 請設計一隻Java程式,輸出結果為以下:
        //      1 4 9 16 25 36 49 64 81 100
        for (int j = 1; j <= 10; j++) {
            System.out.print((j * j) + " ");
        }
        System.out.println();
        System.out.println("==========================================");

        // TODO 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
        //      輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
        int count = 0;
        System.out.println("可選擇: ");
        for (int j = 1; j <= 49; j++) {
            if (j % 10 == 4 || j / 10 == 4)
                continue;
            System.out.print(j + " ");
            count++;
        }
        System.out.println("\n總共:" + count);
        System.out.println("==========================================");

        // TODO 請設計一隻Java程式,輸出結果為以下:
        //      1 2 3 4 5 6 7 8 9 10
        //      1 2 3 4 5 6 7 8 9
        //      1 2 3 4 5 6 7 8
        //      1 2 3 4 5 6 7
        //      1 2 3 4 5 6
        //      1 2 3 4 5
        //      1 2 3 4
        //      1 2 3
        //      1 2
        //      1
        for (int j = 10; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("==========================================");

        // TODO 請設計一隻Java程式,輸出結果為以下:
        //      A
        //      BB
        //      CCC
        //      DDDD
        //      EEEEE
        //      FFFFFF

        for (int j = 1; j <= 6; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }

        System.out.println("==========================================");

    }

}
