package abc.practice.ABC086;


import java.util.*;


public class C {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();

        int tc = 0;
        int xc = 0;
        int yc = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xy_diff = Math.abs(xc - x) + Math.abs(yc - y);
            if (t % 2 == 0) {
                if ((xy_diff <= t - tc) && (xy_diff % 2 == 0)) {
                    tc = t;
                    continue;
                } else {
                    System.out.println("No");
                    return;
                }
            } else {
                if ((xy_diff <= t - tc) && (xy_diff % 2 == 1)) {
                    tc = t;
                    continue;
                } else {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }


    private static class XY {
        int x;
        int y;

        public XY(int x1, int y2) {
            x = x1;
            y = y2;
        }
    }
}

