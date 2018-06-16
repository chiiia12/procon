package abc.practice.ABC100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class D {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Cake> xlist = new ArrayList<>();
        List<Cake> ylist = new ArrayList<>();
        List<Cake> zlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Cake c = new Cake();
            c.x = sc.nextLong();
            c.y = sc.nextLong();
            c.z = sc.nextLong();
            xlist.add(c);
        }
        ylist = new ArrayList<>(xlist);
        zlist = new ArrayList<>(xlist);
        xlist.sort(new Comparator<Cake>() {
            @Override
            public int compare(Cake o1, Cake o2) {
                return o1.x < o2.x ? 1 : -1;
            }
        });
        ylist.sort(new Comparator<Cake>() {
            @Override
            public int compare(Cake o1, Cake o2) {
                return o1.y < o2.y ? 1 : -1;
            }
        });
        zlist.sort(new Comparator<Cake>() {
            @Override
            public int compare(Cake o1, Cake o2) {
                return o1.z < o2.z ? 1 : -1;
            }
        });
//        long xsum = 0;
//        long ysum = 0;
//        long zsum = 0;
//        long mxsum = 0;
//        long mysum = 0;
//        long mzsum = 0;
        Long[] sum = new Long[6];
        sum[0] = 0L;
        sum[1] = 0L;
        sum[2] = 0L;
        sum[3] = 0L;
        sum[4] = 0L;
        sum[5] = 0L;
        for (int i = 0; i < m; i++) {
//            xsum = xsum + xlist.get(i).x;
//            ysum = ysum + ylist.get(i).y;
//            zsum = zsum + zlist.get(i).z;
//            mxsum = mxsum + xlist.get(m - i).x;
//            mysum = mysum + ylist.get(m - i).y;
//            mzsum = mzsum + zlist.get(m - i).z;
            sum[0] += xlist.get(i).x;
            sum[1] += ylist.get(i).y;
            sum[2] += zlist.get(i).z;
            sum[3] += xlist.get(n - i - 1).x;
            sum[4] += ylist.get(n - i - 1).y;
            sum[5] += zlist.get(n - i - 1).z;
        }
        sum[0] = Math.abs(sum[0]);
        sum[1] = Math.abs(sum[1]);
        sum[2] = Math.abs(sum[2]);
        sum[3] = Math.abs(sum[3]);
        sum[4] = Math.abs(sum[4]);
        sum[5] = Math.abs(sum[5]);


        List<Long> list = new ArrayList<>(Arrays.asList(sum));
        Collections.sort(list, Collections.reverseOrder());
        if (sum[0] == list.get(0)) {
            int countx = 0;
            int county = 0;
            int countz = 0;
            for (int i = 0; i < m; i++) {
                countx += xlist.get(i).x;
                county += xlist.get(i).y;
                countz += xlist.get(i).z;
            }
            System.out.println(Math.abs(countx) + Math.abs(county) + Math.abs(countz));
            return;
        }
        if (sum[1] == list.get(0)) {
            int countx = 0;
            int county = 0;
            int countz = 0;
            for (int i = 0; i < m; i++) {
                countx += ylist.get(i).x;
                county += ylist.get(i).y;
                countz += ylist.get(i).z;
            }
            System.out.println(Math.abs(countx) + Math.abs(county) + Math.abs(countz));
            return;
        }
        if (sum[2] == list.get(0)) {
            int countx = 0;
            int county = 0;
            int countz = 0;
            for (int i = 0; i < m; i++) {
                countx += zlist.get(i).x;
                county += zlist.get(i).y;
                countz += zlist.get(i).z;
            }
            System.out.println(Math.abs(countx) + Math.abs(county) + Math.abs(countz));
            return;
        }
        if (sum[3] == list.get(0)) {
            int countx = 0;
            int county = 0;
            int countz = 0;
            for (int i = 0; i < m; i++) {
                countx += xlist.get(n - i - 1).x;
                county += xlist.get(n - i - 1).y;
                countz += xlist.get(n - i - 1).z;
            }
            System.out.println(Math.abs(countx) + Math.abs(county) + Math.abs(countz));
            return;
        }
        if (sum[4] == list.get(0)) {
            int countx = 0;
            int county = 0;
            int countz = 0;
            for (int i = 0; i < m; i++) {
                countx += ylist.get(n - i - 1).x;
                county += ylist.get(n - i - 1).y;
                countz += ylist.get(n - i - 1).z;
            }
            System.out.println(Math.abs(countx) + Math.abs(county) + Math.abs(countz));
            return;
        }
        if (sum[5] == list.get(0)) {
            int countx = 0;
            int county = 0;
            int countz = 0;
            for (int i = 0; i < m; i++) {
                countx += zlist.get(n - i - 1).x;
                county += zlist.get(n - i - 1).y;
                countz += zlist.get(n - i - 1).z;
            }
            System.out.println(Math.abs(countx) + Math.abs(county) + Math.abs(countz));
            return;

        }
    }

    static class Cake {
        long x;
        long y;
        long z;
    }
}
