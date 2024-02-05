package hw4;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Hw4_5_method2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        //檢查日期合法性
        if(!validateDate(year, month, day)) {
            System.out.println("日期輸入不正確!");
            return;
        }


        LocalDate date = LocalDate.of(year, month, day);

        //直接調用方法獲取當年第幾天
        int dayOfYear = date.getDayOfYear();

        System.out.println("輸入日期為當年第"+dayOfYear+"天");

    }

    //日期合法性檢查
    public static boolean validateDate(int year, int month, int day){
        if(month < 1 || month > 12){
            return false;
        }
        if(day < 1){
            return false;
        }

        int maxDays = Year.isLeap(year) ? 29 : 28;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDays = 31; break;
            case 4: case 6: case 9: case 11:
                maxDays = 30; break;
        }
        return day <= maxDays;
    }

}