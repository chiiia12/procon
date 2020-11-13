package abc.practice.ABC180;

import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long x = sc.nextLong();
        long y = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = 0;
        while (x * a > 0 && x * a < x + b && x * a < y) {
            x *= a;
            ans++;
        }
        ans += (y - x - 1) / b;
        System.out.println(ans);
    }
}