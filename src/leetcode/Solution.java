package leetcode;


public class Solution {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ans = s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println("ans is " + ans[0] + " " + ans[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int start = search(nums, target, 0, nums.length - 1);
        int end = search(nums, target + 1, 0, nums.length - 1) - 1;
        return new int[]{start, end};
    }

    private int search(int[] nums, int target, int left, int right) {
        if (left == right) return left;
        int mid = left+((right-left)/2);
        if (nums[mid] < target) {
            return search(nums, target, mid + 1, right);
        } else {
            return search(nums, target, left, mid);
        }
    }

}


