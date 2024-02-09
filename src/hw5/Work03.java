package hw5;

/**
 * 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
 * 可以找出二維陣列的最大值並回傳
 */
public class Work03 {

    public static void main(String[] args) {
        int[][] intArray = new int[][]{{1, 2, 3}, {4, 5, 90}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        double[][] doubleArray = new double[][]{{20.5, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};

        Work03 work03 = new Work03();
        int maxElement1 = work03.maxElement(intArray);
        double maxElement2 = work03.maxElement(doubleArray);

        System.out.println(maxElement1);
        System.out.println(maxElement2);

    }

    public double maxElement(double[][] x) {
        double maxDouble = 0;

        for (double[] doubles : x) {
            for (double aDouble : doubles) {
                if (aDouble > maxDouble) {
                    maxDouble = aDouble;
                }
            }
        }

        return maxDouble;
    }

    public int maxElement(int[][] x) {
        int maxInt = 0;
        for (int[] ints : x) {
            for (int anInt : ints) {
                if (anInt > maxInt) {
                    maxInt = anInt;
                }
            }
        }
        return maxInt;
    }
}
