package abc.practice.ABC184;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long r1 = sc.nextLong();
        long c1 = sc.nextLong();
        long r2 = sc.nextLong();
        long c2 = sc.nextLong();
        if (r1 == r2 && c1 == c2) {
            System.out.println(0);
            return;
        }

        if (ok(r1, c1, r2, c2)) {
            System.out.println(1);
            return;
        }

        if ((r1 + c1) % 2 == (r2 + c2) % 2) {
            System.out.println(2);
            return;
        }
        for (int i = -3; i <= 3; i++) {
            for (int j = -3; j <= 3; j++) {
                long r3 = r1 - i;
                long c3 = c1 - j;
                if (ok(r1, c1, r3, c3) && ok(r3, c3, r2, c2)) {
                    System.out.println(2);
                    return;
                }
            }
        }
        System.out.println(3);
    }

    private static boolean ok(long a, long b, long c, long d) {
        if (a + b == c + d) return true;
        if (a - b == c - d) return true;
        return Math.abs(a - c) + Math.abs(b - d) <= 3;
    }
}