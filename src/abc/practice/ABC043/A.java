package abc.practice.ABC043;

import java.util.Scanner;


public class A {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }

}
