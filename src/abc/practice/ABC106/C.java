package abc.practice.ABC106;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String s = sc.next();
        long k = sc.nextLong();
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) != '1') {
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println(1);
    }
}
