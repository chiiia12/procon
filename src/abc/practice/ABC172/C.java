package abc.practice.ABC172;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }
        long[][] dp = new long[n + 1][m + 1];
        int max = 0;
        for (int i = 0; i <= n; i++) {
            inside:
            for (int j = 0; j <= m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = k;
                    continue;
                }
                if (j == 0 && i > 0) {
                    dp[i][j] = dp[i - 1][j] - a[i - 1];
                } else {
                    dp[i][j] = dp[i][j - 1] - b[j - 1];
                }
                if (dp[i][j] >= 0) {
                    max = Math.max(max, i + j);
                } else {
                    break inside;
                }
            }
        }
        System.out.println(max);
    }
}