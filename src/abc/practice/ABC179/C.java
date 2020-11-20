package abc.practice.ABC179;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans += ((n - 1) / i);
        }
        System.out.println(ans);
    }
}