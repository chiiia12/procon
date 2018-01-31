package abc.practice.ABC001;

import java.util.Scanner;

public class B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = sc.nextInt();
        float km = (float)m / 1000;
        if (km < 0.1) {
            System.out.println("00");
        } else if (km <= 5) {
            System.out.println(String.format("%02d", Math.round(km * 10)));
        } else if (km <= 30) {
            System.out.println(String.format("%02d", Math.round(km + 50)));
        } else if (km <= 70) {
            System.out.println(String.format("%02d", Math.round((km - 30) / 5 + 80)));
        }else{
            System.out.println("89");
        }
    }
}
