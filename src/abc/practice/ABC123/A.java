package abc.practice.ABC123;

import java.util.Scanner;

public class A {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();
        if (e - a <= k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
