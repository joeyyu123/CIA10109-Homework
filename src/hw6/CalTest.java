package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int x, y;

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("請輸入x的值: ");
                x = sc.nextInt();
                System.out.println("請輸入y的值: ");
                y = sc.nextInt();
                System.out.println(x + "的" + y + "次方等於: " + cal.powerXY(x, y));
                return;

            } catch (CalException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("輸入格式不正確");
            }
        }


    }
}
