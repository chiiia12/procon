package codejam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CEOSearch {

    static Scanner sc = new Scanner(System.in);
    static List<Employee> list;

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            list = new ArrayList<>();

            for (int j = 0; j < l; j++) {
                Employee emp = new Employee();
                emp.num = sc.nextInt();
                emp.level = sc.nextInt();
                list.add(emp);
            }
            calculate(i);
        }
    }

    private static void calculate(int index) {
        list.sort((Comparator.comparing(Employee::getLevel)));
        int sum = 0;
        int level = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sum = list.get(i).num;
                level = list.get(i).level;
                break;
            }
            Employee one = list.get(i);
            Employee two = list.get(i + 1);
            if (two.level - one.num < 0) {
                sum += two.level - one.num;
                level = one.level;
            } else {
                if (sum > 0) {
                    if (two.level - one.num - sum >= 0) {
                        level = 0;
                    }
                }
            }
        }
        int ans;
        if (sum > level) {
            ans = sum;
        } else {
            ans = level + 1;
        }

        System.out.println("Case #" + (index + 1) + ": " + ans);
    }

    static class Employee {
        public int getLevel() {
            return level;
        }

        int level;
        int num;
    }
}
