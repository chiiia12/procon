package leetcode;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public static void main(String[] args) {
//        int[] nums = new int[]{-1, -2, -3, -4, -5};
//        int[] result = new TwoSum().twoSum(nums, -8);
//        System.out.println(result[0] + " " + result[1]);
//        int[] nums = new int[]{2, 7, 11, 15};
//        int[] result = new TwoSum().twoSum(nums, 9);
//        System.out.println(result[0] + " " + result[1]);

//        int[] nums = new int[]{2, 5, 5, 11};
//        int[] result = new TwoSum().twoSum(nums, 10);
//        System.out.println(result[0] + " " + result[1]);
        int[] nums2 = new int[]{2, 3, 4};
        int[] result2 = new TwoSum().twoSum(nums2, 6);
        System.out.println(result2[0] + " " + result2[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        while (index < nums.length) {
            for (int i = index + 1; i < nums.length; i++) {
                if (nums[index] + nums[i] == target) {
                    return new int[]{index, i};
                }
            }
            index++;
        }
        return null;
    }
}
