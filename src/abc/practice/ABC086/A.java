package abc.practice.ABC086;

import java.util.Scanner;


public class A {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long m = sc.nextLong();
        long n = sc.nextLong();
        if (m * n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
