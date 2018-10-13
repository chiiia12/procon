package leetcode;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int[] result = new TwoSum().twoSum(nums, -8);
        System.out.println(result[0] + " " + result[1]);
//        int[] nums = new int[]{2, 7, 11, 15};
//        int[] result = new TwoSum().twoSum(nums, 9);
//        System.out.println(result[0] + " " + result[1]);

//        int[] nums = new int[]{2, 5, 5, 11};
//        int[] result = new TwoSum().twoSum(nums, 10);
//        System.out.println(result[0] + " " + result[1]);
//        int[] nums2 = new int[]{2, 3, 4};
//        int[] result2 = new TwoSum().twoSum(nums2, 6);
//        System.out.println(result2[0] + " " + result2[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int startIndex = search(nums, target, nums.length / 2);
        while (startIndex > 0) {
            int sum = nums[startIndex];
            for (int i = 0; i < startIndex; i++) {
                if (nums[i] == target - sum) {
                    return new int[]{
                            i, startIndex
                    };
                }
            }
            startIndex--;
        }
        return null;
    }

    private int search(int[] nums, int target, int length) {
        if (length > nums.length || (length == nums.length && nums[nums.length - 1] < target)) {
            return nums.length - 1;
        }
        if (length < nums.length - 1 && nums[length] <= target && nums[length + 1] > target) {
            return length;
        }
        if (nums[length] < target) {
            return search(nums, target, (int) (length + Math.ceil((double) length / 2)));
        } else {
            return search(nums, target, length / 2);
        }
    }
}
