package hw4;

import java.util.Scanner;

/**
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * (提示1：Scanner，陣列)
 * (提示2：需將閏年條件加入)
 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29
 */
public class Hw4_5 {
    public static void main(String[] args) {

        outer:
        while (true) {
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            boolean leapYear = false;
            int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int days = 0;

            // 判斷日期輸入是否正確
            switch (month) {
                case 1,3,5,7,8,10,12:
                    if (day > 31) {
                        System.out.println("請輸入正確的日期!");
                        break outer;
                    }
                case 2:
                    if (day > 29) {
                        System.out.println("請輸入正確的日期!");
                        break outer;
                    }
                case 4,6,9,11:
                    if (day > 30) {
                        System.out.println("請輸入正確的日期!");
                        break outer;
                    }
            }

            // 判斷是否為閏年
            if (year % 4 == 0) {
                leapYear = true;
            }
            if (year % 100 == 0) {
                leapYear = false;
            }
            if (year % 400 == 0) {
                leapYear = true;
            }

            // 計算天數
            switch (month) {
                case (12):
                    days += monthDays[10]; //11
                case (11):
                    days += monthDays[9]; //10
                case (10):
                    days += monthDays[8]; //9
                case (9):
                    days += monthDays[7]; //8
                case (8):
                    days += monthDays[6]; //7
                case (7):
                    days += monthDays[5]; //6
                case (6):
                    days += monthDays[4]; //5
                case (5):
                    days += monthDays[3]; //4
                case (4):
                    days += monthDays[2]; //3
                case (3):
                    days += monthDays[1]; //2
                case (2):
                    days += monthDays[0]; //1
                case (1):
                    days += day;
            }
            if (leapYear && month > 2) {
                days++;
            }

            System.out.println("輸入的日期為該年第" + days + "天");
        }
    }
}
