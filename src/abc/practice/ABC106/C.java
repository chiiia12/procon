package abc.practice.ABC106;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long gosencho = (long) (Math.pow(10, 12) * 5);

        String s = sc.next();
        long k = sc.nextLong();
        int index = Integer.parseInt(String.valueOf(s.charAt(0)));

        if (index == 1 && k == 1) {
            System.out.println(1);
            return;
        }

        if (index == 1 && k > 1 && k < Math.pow(10, 12)) {
            System.out.println(s.charAt(1));
            return;
        }
        int i = (int) (k / Math.pow(10, 12));
        System.out.println(s.charAt(i));

    }
}
