package abc.practice.ABC083;

import java.util.Scanner;

public class D {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long x, y;
        x = sc.nextLong();
        y = sc.nextLong();
        long num = x;
        long count = 1;
        while (num * 2 <= y) {
            num = num * 2;
//            System.out.println(num);
            count++;
        }
        System.out.println(count);

    }
}
