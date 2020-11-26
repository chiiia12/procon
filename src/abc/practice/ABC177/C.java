package abc.practice.ABC177;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int N = sc.nextInt();
        long mod = 1000000007;
        long[] arr = new long[N + 1];
        long sum = 0;
        for (int i = 1; i < N + 1; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i] % mod;
            sum %= mod;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            sum -= arr[i];
            if (sum < 0) {
                sum += mod;
            }
            ans += arr[i] * sum % mod;
            ans %= mod;
        }
        System.out.println(ans % mod);
    }
}