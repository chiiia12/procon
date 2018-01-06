package abc.practice.ABC083;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class D {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        s = sc.next();
//        s = "010";
        int count = 0;
        char before2 = 0;
        char before = 0;

        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (before == s.charAt(i)) {
                count++;
            } else if (before2 == s.charAt(i)) {
                count++;
            } else {
                answerList.add(count);
                count = 1;
            }
            before2 = before;
            before = s.charAt(i);

        }
        answerList.add(count);
        System.out.println(answerList.stream().max(Comparator.naturalOrder()).get());
    }
}
