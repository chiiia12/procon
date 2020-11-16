package abc.practice.ABC183;

import java.util.Arrays;
import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);

    static long answer = 0;

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[][] t = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = sc.nextLong();
            }
        }
        solve(k, t, new boolean[n], 0);
        System.out.println(answer);
    }

    private static void solve(long amount, long[][] time, boolean[] check, long now) {
        if (amount < 0) {
            return;
        }
        if (amount == time[(int) now][0]) {
            boolean visited = true;
            for (int i = 1; i < check.length; i++) {
                if (!check[i]) visited = false;
            }
            if (visited) {
                answer++;
                return;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {
                boolean[] copy = Arrays.copyOfRange(check, 0, check.length);
                copy[i] = true;
                solve(amount - time[(int) now][i], time, copy, i);
            }
        }
    }
}