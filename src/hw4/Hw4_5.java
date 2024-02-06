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

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入年、月、日：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        if (!isValidDate(year, month, day)) {
            System.out.println("請輸入正確的日期!");
            sc.close();
            return;
        }

        boolean leapYear = isLeapYear(year);
        int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (leapYear) {
            monthDays[1] = 29;
        }

        int days = calculateDayOfYear(monthDays, month, day);

        System.out.println("輸入的日期為該年第" + days + "天");
        sc.close();
    }

    private static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;
        
        int[] monthDays = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        return day > 0 && day <= monthDays[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int calculateDayOfYear(int[] monthDays, int month, int day) {
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }
        days += day;
        return days;
    }
}
