package abc.practice.ABC104;

import java.util.Scanner;

public class A {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else if (a < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
