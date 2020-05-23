package ArraySolution;

/**
 * @author Albert
 * @date 2020/5/5 - 11:37 上午
 */

/**
 * 两数之和：找出数组中和为目标target的两个整数，返回他们的数组下标
 * 同一个元素不能使用两遍
 * 方法一：暴力法，遍历每一个元素x，并查找是否存在一个值与target-x相等的目标元素；
 * 时间复杂度O(n^2)
 */
class TwoSumbaolifa {
    public static void main(String[] args) {
    }
    int[] nums = new int[]{2,7,11,15};
    int target;
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i,j};
                    }
                }
            }
            throw new IllegalArgumentException("No");
        }
    }
}
