package abc.practice.ABC172;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D {

    static Scanner sc = new Scanner(System.in);

    static Set<Integer>[] memo;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0;
        memo = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            memo[i] = new HashSet<>();
            sum += calc(i);
        }
        System.out.println(sum);
    }

    private static int calc(int n) {
        memo[n].add(n);
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                if (memo[i].size() > 0) {
                    memo[n].addAll(memo[i]);
                }
                memo[n].add(i);
            }
        }
        return n * memo[n].size();
    }
}