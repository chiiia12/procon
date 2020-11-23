package abc.practice.ABC178;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int N = sc.nextInt();
        long mod = 1000000007;
        long ten = 1;
        long nine = 1;
        long eight = 1;
        for (int i = 0; i < N; i++) {
            ten = ten * 10 % mod;
            nine = nine * 9 % mod;
            eight = eight * 8 % mod;
        }
//            long ans = (long) Math.pow(10, n) % mod - 2 * (long) Math.pow(9, n) % mod + (long) Math.pow(8, n) % mod;
        long ans = (ten - nine - nine + eight + 3 * mod) % mod;
        System.out.println(ans);
    }
}