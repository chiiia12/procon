package abc.practice.ABC113;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);

    static long answer = 0;
    static int h;
    static int r;
    static int k;

    public static void main(String[] args) {
        h = sc.nextInt();
        r = sc.nextInt();
        k = sc.nextInt();

        solve(1, 1, 1);

        System.out.println(answer);
    }

    private static void solve(int x, int y, long ans) {
        if (h + 1 - y < Math.abs(k - x)) {
            return;
        }
        if (y == h + 1) {
            if (x == k) {
                answer = ans;
            }
            return;
        }
        int degree = 0;
        //right
        if (x < r) {
            degree = x == 1 ? 2 : 3;
            int any = (int) Math.pow(2, Math.max(r - 1 - degree, 0));
            solve(x + 1, y + 1, ans * any);
        }
        //left
        if (x > 1) {
            degree = x == r ? 2 : 3;
            int any = (int) Math.pow(2, Math.max(r - 1 - degree, 0));
            solve(x - 1, y + 1, ans * any);
        }
        //don't go
        degree = (x == r) || (x == 1) ? 1 : 2;
        int any = (int) Math.pow(2, r - 1 - degree);
        solve(x, y + 1, ans * any);
    }
}