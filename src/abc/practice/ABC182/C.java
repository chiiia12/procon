package abc.practice.ABC182;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String n = sc.next();
        int[] c = new int[3];
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            c[num % 3]++;
            sum += num;
        }
        sum = sum % 3;
        if (sum == 0) {
            System.out.println(0);
            return;
        }
        if (sum == 1) {
            if (c[sum] > 0 && n.length() > 1) {
                System.out.println(1);
            } else if (c[2] >= 2 && n.length() > 2) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }
            return;
        }

        if (sum == 2) {
            if (c[sum] > 0 && n.length() > 1) {
                System.out.println(1);
            } else if (c[1] >= 2 && n.length() > 2) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }
            return;
        }
    }

}