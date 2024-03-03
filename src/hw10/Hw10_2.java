package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("請輸入數字: ");
                String s = sc.next();

                // 使用正規表示法來判斷輸入的是否為數字
                if (!s.matches("-?\\d+(\\.\\d+)?")) {
                    throw new NumberFormatException();
                }

                double number = Double.parseDouble(s);

                // 計算小數位數
                String decimalPart = s.contains(".") ? s.split("\\.")[1] : "";
                int decimalPlaces = decimalPart.length();

                System.out.print("格式化成(1)千分位(2)百分比(3)科學記號 ");
                int j = sc.nextInt();
                switch (j) {
                    case 1:
                        String formatString = "#,##0";
                        if (decimalPlaces > 0) {
                            formatString += "." + new String(new char[decimalPlaces]).replace("\0", "0");
                        }
                        Format dfm1 = new DecimalFormat(formatString);
                        System.out.println(dfm1.format(number));
                        break;
                    case 2:
                        Format dfm2 = new DecimalFormat("0%");
                        System.out.println(dfm2.format(number));
                        break;
                    case 3:
                        Format dfm3 = new DecimalFormat("0.00E00");
                        System.out.println(dfm3.format(number));
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("數字格式不對，請再輸入一次!");
                continue;
            } catch (NumberFormatException e) {
                System.out.println("輸入的不是數字，請再輸入一次!");
                continue;
            }
            break;
        }
        sc.close();
    }
}