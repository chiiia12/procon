package leetcode;

import java.util.Scanner;

public class Palindrome {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = sc.nextInt();
        boolean ans = palindrome(input);
        System.out.println(ans);
    }

    private static boolean palindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int ans = 0;
        while (x > ans) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans == x || ans / 10 == x;
    }
}
