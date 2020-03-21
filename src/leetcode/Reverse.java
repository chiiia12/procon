package leetcode;

import java.util.Scanner;

public class Reverse {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = sc.nextInt();
        int ans = reverse(input);
        System.out.println(ans);
    }

    private static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && 7 < pop)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && -8 > pop)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
    

}
