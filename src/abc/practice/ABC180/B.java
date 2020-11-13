package abc.practice.ABC180;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = 0;
        long y = 0;
        long c = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long value = Math.abs(sc.nextLong());
            m += value;
            y += (value * value);
            c = Math.max(c, value);
        }

        System.out.println(m);
        System.out.println(Math.sqrt(y));
        System.out.println(c);
    }
}