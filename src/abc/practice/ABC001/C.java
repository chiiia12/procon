package abc.practice.ABC001;

import java.util.Scanner;

public class C {
    static final String[] array = {
            "N",
            "NNE",
            "NE",
            "ENE",
            "E",
            "ESE",
            "SE",
            "SSE",
            "S",
            "SSW",
            "SW",
            "WSW",
            "W",
            "WNW",
            "NW",
            "NNW"
    };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int dir = sc.nextInt();
        int w = sc.nextInt();

        float dirans = (float) dir / 10;
        findDir(dirans);
    }

    private static String findDir(float dirans) {
        float x = (float) 365 / 16;
        int a = (int) Math.floor((dirans + (x / 2)) / x);
        System.out.println(Math.floor((dirans + (x / 2)) / x));
        System.out.println((dirans + (x / 2) / x));
        System.out.println(array[Math.round(a)]);
        return array[Math.round(a)];
    }
}
