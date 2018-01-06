package learnalgorithm;

public class Ex02 {

    public static void main(String[] args) {

        int[] vs = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println("1 contains : " + contains(1, vs, 0, vs.length));
        System.out.println("11 contains : " + contains(11, vs, 0, vs.length - 1));
        int[] vs2 = new int[]{
                1, 3, 5, 6, 10
        };
        System.out.println("4 contains : " + contains(4, vs2, 0, vs.length - 1));
        System.out.println("5 contains : " + contains(5, vs2, 0, vs.length - 1));
    }

    /**
     * v:int最大22億 32bit
     * vs:最大1億
     */
    private static boolean contains(int v, int[] vs, int left, int right) {
        int mid = left + (right - left) / 2;//真ん中を取ろうとしてleft+right/2とするとintがあふれる可能性
        if (right - left == 1 && vs[right] != v && vs[left] != v) {
            return false;
        }
        if (v == vs[mid]) {
            return true;
        }
        if (vs[mid] > v) {
            return contains(v, vs, left, mid);
        } else {
            return contains(v, vs, mid, right);
        }
    }
}
