package abc.practice.ABC099;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = b - a;

        System.out.println(Math.round(n * (n + 1) / 2) - b);
    }
}
