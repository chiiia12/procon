package abc.practice.ABC181;

import java.util.Scanner;

public class A {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }
}