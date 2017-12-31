package learnalgorithm;

public class Ex02 {

    public static void main(String[] args) {

        int[] vs = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println("1 contains : " + contains(1, vs));
        System.out.println("11 contains : " + contains(11, vs));
    }

    /**
     * v:int最大22億 32bit
     * vs:最大1億
     */
    private static boolean contains(int v, int[] vs) {
        for (int i = 0; i < vs.length; i++) {
            if (v == vs[i]) {
                return true;
            }
        }
        return false;
    }
}
