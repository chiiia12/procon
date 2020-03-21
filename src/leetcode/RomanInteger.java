package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class RomanInteger {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.next();
        int ans = romanToInt(input);
        System.out.println(ans);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int i = 0;
        char[] arr = s.toCharArray();
        int ans = 0;
        int prev = 0;
        while (i < arr.length) {
            int value = map.get(arr[i]);
            if (prev != 0 && (value / prev == 5 || value / prev == 10)) {
                ans -= prev;
                ans += value - prev;
            } else {
                ans += value;
            }
            i++;
            prev = value;
        }
        return ans;
    }
}
