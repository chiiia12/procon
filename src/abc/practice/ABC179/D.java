package abc.practice.ABC179;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[k];
        int[] r = new int[k];
        long mod = 998244353L;
        for (int i = 0; i < k; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        long[] dp = new long[n + 1];
        long[] dpsum = new long[n + 1];
        dp[1] = 1;
        dpsum[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                int li = i - r[j];
                int ri = i - l[j];
                if (ri < 0) continue;
                li = Math.max(1, li);
                dp[i] = (dp[i] % mod + dpsum[ri] % mod - dpsum[li - 1] % mod);
                dp[i] = (dp[i] + mod) % mod;
            }
            dpsum[i] = (dpsum[i - 1] % mod + dp[i] % mod) % mod;
        }
        System.out.println(dp[n]);
    }
}