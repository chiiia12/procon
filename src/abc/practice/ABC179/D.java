package abc.practice.ABC179;

import java.util.*;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> set = new HashSet();
        for (int i = 0; i < k; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= end; j++) {
                set.add(j);
            }
        }
        int[] dp = new int[n];
        Deque<Integer> stack = new ArrayDeque();
        stack.push(n);
        while (!stack.isEmpty()) {
            int num = stack.pop();
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (num - next >= 1) {
                    dp[num - next] = (dp[num - next] + 1) % 998244353;
                    stack.push(num - next);
                }
            }
        }
        System.out.println(dp[1]);
    }
}