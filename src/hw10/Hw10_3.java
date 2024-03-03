package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$");
        while (true) {
            try {
                System.out.println("請輸入日期(年月日)，例如20121230");
                String s = sc.next();
                Matcher matcher = pattern.matcher(s);
                if (!matcher.matches()) {
                    throw new InputMismatchException();
                } else if (s.length() != 8) {
                    throw new InputMismatchException();
                }

                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
                Date date = inputFormat.parse(s);

                System.out.print("(1)年/月/日(2)月/日/年(3)日/月/年 ");
                int j = sc.nextInt();
                SimpleDateFormat outputFormat;
                switch (j) {
                    case 1:
                        outputFormat = new SimpleDateFormat("yyyy/MM/dd");
                        System.out.println("年/月/日: " + outputFormat.format(date));
                        break;
                    case 2:
                        outputFormat = new SimpleDateFormat("MM/dd/yyyy");
                        System.out.println("月/日/年: " + outputFormat.format(date));
                        break;
                    case 3:
                        outputFormat = new SimpleDateFormat("dd/MM/yyyy");
                        System.out.println("日/月/年: " + outputFormat.format(date));
                        break;
                    default:
                        throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {
                System.out.println("輸入格式不對，請再輸入一次!");
                continue;
            } catch (ParseException e) {
                System.out.println("請輸入正確的日期格式，請再輸入一次!");
                continue;
            } catch (Exception e) {
                System.out.println("發生錯誤，請再試一次");
                continue;
            }
            break;
        }
        sc.close();
    }
}