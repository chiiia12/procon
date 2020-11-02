package abc.practice.ABC181;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String s = sc.next();
        if (search(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean search(String s) {
        if (s.length() == 1) return s.equals("8");
        if (s.length() == 2)
            return Integer.parseInt(s) % 8 == 0 || Integer.parseInt(new StringBuilder(s).reverse().toString()) % 8 == 0;

        int[] cnt = new int[10];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - '0']++;
        }
        for (int i = 100; i < 1000; i++) {
            if (i % 8 != 0) continue;
            String str = String.valueOf(i);
            int[] tempCount = new int[10];
            for (int j = 0; j < str.length(); j++) {
                tempCount[str.charAt(j) - '0']++;
            }
            boolean enable = true;
            for (int j = 0; j < tempCount.length; j++) {
                if (cnt[j] < tempCount[j]) {
                    enable = false;
                }
            }
            if (enable) {
                return true;
            }
        }

        return false;
    }
}