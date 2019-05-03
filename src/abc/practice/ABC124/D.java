package abc.practice.ABC124;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        List<Integer> list = new ArrayList<>();
        if (s.charAt(0) == '0') {

        }
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int left = i;
            int right = Math.min(i + k * 2, list.size());
            int num = 0;
            for (int j = left; j < right; j++) {
                num += list.get(j);
            }
            if (ans < num) {
                ans = num;
            }
        }

        System.out.println(ans);
    }
}
