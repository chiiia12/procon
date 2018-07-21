package abc.practice.ABC103;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            answer = answer + b - 1;
        }
        System.out.println(answer);
    }
}
