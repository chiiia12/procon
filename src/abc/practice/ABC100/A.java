package abc.practice.ABC100;

import java.util.Scanner;

public class A {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 8 && b <= 8) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
