package abc.practice.ABC183;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long w = sc.nextLong();
        long[] timeline = new long[(int) (2 * Math.pow(10, 5) + 1)];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            long p = sc.nextLong();
            timeline[s] += p;
            timeline[t] -= p;
        }
        long amount = 0;
        for (int i = 0; i < timeline.length; i++) {
            amount += timeline[i];
            if (amount > w) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}