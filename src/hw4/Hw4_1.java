package hw4;

/**
 * 有個一維陣列如下：
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * (提示：陣列，length屬性)
 */
public class Hw4_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int average;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        average = sum / arr.length;
        System.out.println("平均: " + average);

        for (int i : arr) {
            if (i > average) {
                System.out.println(i);
            }
        }
    }
}
