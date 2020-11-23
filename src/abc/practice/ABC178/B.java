package abc.practice.ABC178;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long max = Math.max(a * c, a * d);
        max = Math.max(b * c, max);
        max = Math.max(b * d, max);
        System.out.println(max);
    }
}