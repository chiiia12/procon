package abc.practice.ABC181;

import java.util.Scanner;

public class C {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean hasAnswer = search(i, points);
            if (hasAnswer) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    private static boolean search(int first, int[][] points) {
        for (int i = first + 1; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[i][0] - points[first][0];
                int x3 = points[j][0] - points[first][0];
                int y2 = points[i][1] - points[first][1];
                int y3 = points[j][1] - points[first][1];
                if (x2 * y3 == x3 * y2) {
                    return true;
                }
            }
        }
        return false;
    }
}