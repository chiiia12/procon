package abc.practice.ABC001;

import java.util.HashMap;
import java.util.Map;
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
    static final double[] rangeArray = {
            0,
            33.75,
            56.25,
            78.75,
            101.25,
            123.75,
            146.25,
            168.75,
            191.25,
            213.75,
            236.25,
            281.25,
            303.75,
            326.25,
            348.75
    };

    static final double[] windArr = {
            0.2,
            1.5,
            3.3,
            5.4,
            7.9,
            10.7,
            13.8,
            17.1,
            20.7,
            24.4,
            28.4,
            32.6
    };

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int dir = sc.nextInt();
        int w = sc.nextInt();

        float dirans = (float) dir / 10;
        float windans = (float) Math.round((float) w / 60 * 10) / 10;
        String ans1 = findDir(dirans);
        int ans2 = findWind(windans);
        System.out.println((ans2 == 0 ? 'C' : ans1) + " " + ans2);
    }

    private static int findWind(float windans) {
        for (int i = 0; i < windArr.length; i++) {
            if (windans <= windArr[i]) {
                return i;
            }
        }
        return windArr.length;
    }

    private static String findDir(float dirans) {
        float x = (float) 365 / 16;
        int a = (int) Math.floor((dirans + (x / 2) / x));
        System.out.println(Math.floor((dirans + (x / 2))));
        System.out.println(Math.floor((dirans + (x / 2)) / x));
        System.out.println((dirans + (x / 2) / x));
        System.out.println(array[Math.round(a)]);
        return array[Math.round(a)];
    }
}
