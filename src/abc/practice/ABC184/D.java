package abc.practice.ABC184;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double[][][] dp = new double[101][101][101];
        dp[a][b][c] = 1;
        double ans = 0;
        for (int i = a; i <= 100; i++) {
            for (int j = b; j <= 100; j++) {
                for (int k = c; k <= 100; k++) {
                    if (i == 100 || j == 100 || k == 100) {
                        ans += dp[i][j][k] * (i + j + k - (a + b + c));
                        continue;
                    }
                    dp[i + 1][j][k] += dp[i][j][k] * i / (i + j + k);
                    dp[i][j + 1][k] += dp[i][j][k] * j / (i + j + k);
                    dp[i][j][k + 1] += dp[i][j][k] * k / (i + j + k);
                }
            }
        }
        System.out.println(ans);
    }

}