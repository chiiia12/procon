package abc.practice.ABC087;

import java.util.Scanner;


public class A {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((x - a) % b);
    }

}
