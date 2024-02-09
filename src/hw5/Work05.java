package hw5;

import java.util.Random;

/**
 * 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
 * genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
 * 與數字的亂數組合
 */
public class Work05 {
    public static void main(String[] args) {
        Work05 work05 = new Work05();
        System.out.println("本次生成之隨機驗證碼: \n" + work05.genAuthCode());
    }

    public String genAuthCode() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 8; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }
}
