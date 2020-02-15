package codejam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BurgerOptimization {

    static Scanner sc = new Scanner(System.in);
    static private int k;
    static private List<Integer> d;

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            k = sc.nextInt();

            d = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                d.add(sc.nextInt());
            }
            calculate(i);
        }
    }

    private static void calculate(int index) {
        int sum = 0;
        d.sort(Comparator.naturalOrder());
        for (int i = 0; i < k / 2; i++) {
            sum += Math.pow(d.get(2 * i) - Math.abs(i), 2);
            sum += Math.pow(d.get(2 * i + 1) - Math.abs(i), 2);
        }
        if (k % 2 == 1) {
            sum += Math.pow(d.get(k - 1) - Math.abs((k - 1) / 2), 2);
        }
        System.out.println("Case #" + (index + 1) + ": " + sum);
    }
}
