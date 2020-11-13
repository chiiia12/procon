package abc.practice.ABC180;

import java.util.*;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long n = sc.nextLong();
        Set<Long> set = new HashSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        List<Long> list = new ArrayList(set);
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}