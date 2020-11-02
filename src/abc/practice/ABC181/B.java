package abc.practice.ABC181;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            sum += (b - a + 1) * (a + b) / 2;
        }
        System.out.println(sum);
    }
}