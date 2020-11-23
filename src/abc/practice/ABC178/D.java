package abc.practice.ABC178;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
        int mod = 1000000007;
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int i = 0; i <= s; i++) {
            for (int j = 0; j <= i - 3; j++) {
                dp[i] += dp[j];
                dp[i] %= mod;
            }
        }
        System.out.println(dp[s] % mod);
    }
}