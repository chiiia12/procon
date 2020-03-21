package leetcode;

public class LongestCommonPrefix {


    public static void main(String[] args) {
//        String[] input = new String[]{"fl", "flow", "flight"};
        String[] input2 = new String[]{};
//        String ans = longestCommonPrefix(input);
//        System.out.println(ans);
        String ans2 = longestCommonPrefix(input2);
        System.out.println("ans2 is "+ans2);
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs.)
        String ans = "";
        int j = 0;
        while (true) {
            String prefix = "";
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < j+1) {
                    return ans;
                }
                String value = strs[i].substring(j, j + 1);
                if (prefix.equals("") || prefix.equals(value)) {
                    prefix = value;
                    continue;
                } else {
                    return ans;
                }
            }
            ans += prefix;
            j++;
        }
    }
}
