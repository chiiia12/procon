package learnalgorithm;

public class Ex01 {
    public static void main(String[] args) {

        System.out.println(powmod(3, Integer.MAX_VALUE, 10000));
    }

    private static int powmod(int a, int k, int m) {
        if (k == 0) {
            return 1;
        }
        long pow = powmod(a, k / 2, m);
        pow = (pow * pow) % m;
        if (k % 2 == 1) {
            pow = (pow * a) % m;
        }
        return (int) pow;
    }
}
