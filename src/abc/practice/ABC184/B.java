package abc.practice.ABC184;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < n; i++) {
            if (s[i] == 'o') {
                x++;
            } else if (s[i] == 'x') {
                x = Math.max(0, x - 1);
            }
        }
        System.out.println(x);
    }
}