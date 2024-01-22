package hw1;

import java.util.Date;

public class hw1 {
    public static void main(String[] args) {

        // TODO 請設計一隻Java程式,計算12,6這兩個數值的和與積
        System.out.println("和: " + (12 + 6));
        System.out.println("積: " + (12 * 6));


        // TODO 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
        int eggs = 200;
        System.out.printf("%d打%d顆%n",eggs/12,eggs%12);


        // TODO 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
        int seconds = 256559, minutes, hours, days;

        days = seconds / (24 * 60 * 60);
        seconds = seconds % (24 * 60 * 60);

        hours = seconds / (60 * 60);
        seconds %= (60 * 60);

        minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("%d天%d小時%d分%d秒%n",days,hours,minutes,seconds);


        // TODO 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
        final double PI = 3.1415;
        System.out.printf("圓面積為: %f%n", Math.pow(5,2) * PI);
        System.out.printf("圓周長為: %f%n", 2 * PI * 5);


        // TODO 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
        double saving = 1_500_000;
        saving = saving * Math.pow(1.02,10);
        System.out.println("本金加利息共:" + saving);


        // TODO 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
        //      5 + 5
        //      5 + ‘5’
        //      5 + “5”
        //      並請用註解各別說明答案的產生原因

        // 整數加整數會直接輸出兩個的和
        System.out.println(5 + 5);
        // '5'透過unicode轉換後的數字為53，53加上5等於58
        System.out.println(5 + '5');
        // 字串相加時int會被視為字串，字串串接後為55
        System.out.println(5 + "5");
    }
}
