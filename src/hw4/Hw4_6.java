package hw4;

/**
 * 班上有8位同學，他們進行了6次考試結果如下：
 * 請算出每位同學考最高分的次數
 * (提示：二維陣列
 */

public class Hw4_6 {
    public static void main(String[] args) {
        int[][] students = {{10, 37, 100, 77, 98, 90}, {35, 75, 70, 95, 70, 80}, {40, 77, 79, 70, 89, 100}, {100, 89, 90, 89, 90, 75}, {90, 64, 75, 60, 75, 50}, {85, 75, 70, 75, 90, 20}, {75, 70, 79, 85, 89, 99}, {70, 95, 90, 89, 90, 75}};

        // 初始化每位學生得到最高分的次數
        int[] studentBestScoreCount = new int[students.length];

        // 同時找出每次小考的最高分並計算每位學生得到最高分的次數
        for (int i = 0; i < 6; i++) { // 假設每位學生都有6次考試成績
            int testMaxScore = 0;
            for (int[] student : students) {
                if (student[i] > testMaxScore) {
                    testMaxScore = student[i];
                }
            }
            for (int j = 0; j < students.length; j++) {
                if (students[j][i] == testMaxScore) {
                    studentBestScoreCount[j]++;
                }
            }
        }

        // 輸出每位同學考最高分的次數
        for (int i = 0; i < studentBestScoreCount.length; i++) {
            System.out.println((i + 1) + "號共有" + studentBestScoreCount[i] + "次最高分");
        }
    }
}
