package abc.practice.ABC183;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        double sx = sc.nextDouble();
        double sy = sc.nextDouble();
        double gx = sc.nextDouble();
        double gy = sc.nextDouble();
        double ans = (gy * sx + gx * sy) / (sy + gy);
        System.out.println(ans);
    }
}