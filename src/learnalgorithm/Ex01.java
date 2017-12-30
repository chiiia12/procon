package learnalgorithm;

public class Ex01 {
    public static void main(String[] args) {

        System.out.println(powmod(2, 2, 3));
    }

    private static int powmod(int a, int k, int m) {
        int pow = 1;
        for (int i = 0; i < k; i++) {
            pow = pow * a;
        }
        return pow % m;
    }
}
