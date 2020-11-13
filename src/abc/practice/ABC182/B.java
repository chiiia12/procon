package abc.practice.ABC182;

import java.util.Scanner;

public class B {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int ansMax = 0;
        int ans = 0;
        for (int i = 2; i <= max; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i == 0) {
                    temp++;
                }
            }
            if (ansMax <= temp) {
                ansMax = temp;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}