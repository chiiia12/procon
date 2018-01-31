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

        int dirans = dir % 365;
        findDir(dirans);
    }

    private static String findDir(int dirans) {
        float a = (float) dirans / (365 / 16);
        System.out.println(array[Math.round(a)]);
        return array[Math.round(a)];
    }
}
