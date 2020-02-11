package codejam;

import java.util.Scanner;

public class GridEscape {

    static Scanner sc = new Scanner(System.in);
    static private int[] r;
    static private int[] c;
    static private int[] k;

    public static void main(String[] args) {
        int n = sc.nextInt();

        r = new int[n];
        c = new int[n];
        k = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
            k[i] = sc.nextInt();
            calculate(i);
        }
    }

    private static void calculate(int index) {
        int count = 0;
        char[][] ans = new char[r[index]][c[index]];
        for (int i = 0; i < r[index]; i++) {
            for (int j = 0; j < c[index]; j++) {
                count++;
                if (count <= k[index]) {
                    ans[i][j] = 'N';
                } else {
                    if (i - 1 > 0 && ans[i - 1][j] != 'N') {
                        ans[i][j] = 'N';
                    } else if (i + 1 < r[index] && ans[i + 1][j] != 'N') {
                        ans[i][j] = 'S';
                    } else if (j - 1 > 0 && ans[i][j - 1] != 'N') {
                        ans[i][j] = 'W';
                    } else if (j + 1 < c[index] && ans[i][j + 1] != 'N') {
                        ans[i][j] = 'E';
                    } else {
                        System.out.println("Case #" + index + ": IMPOSSIBLE");
                        return;
                    }
                }
            }
        }
        System.out.println("Case #" + index + ": POSSIBLE");
        for (int i = 0; i < r[index]; i++) {
            for (int j = 0; j < c[index]; j++) {
                System.out.print(ans[i][j]);
            }
            if (i + 1 < r[index]) {
                System.out.println();
            }
        }
    }
}
