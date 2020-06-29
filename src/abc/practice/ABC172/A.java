package abc.practice.ABC172;

import java.util.Scanner;

public class A {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        long sum = a + (a * a) + (a * a * a);
        System.out.println(sum);
    }
}