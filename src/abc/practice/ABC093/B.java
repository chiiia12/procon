package abc.practice.ABC093;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = a; i < Math.min(a + c, b+1); i++) {
            System.out.println(i);
        }
        for (int i = Math.max(b - c + 1, a + c ); i <= b; i++) {
            System.out.println(i);
        }
    }
}
