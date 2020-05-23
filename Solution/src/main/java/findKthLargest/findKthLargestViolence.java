package findKthLargest;

import java.util.Arrays;

/**
 * @author Albert
 * @date 2020/5/8 - 10:33 上午
 */

/**
 * 数组中的第K个最大元素（暴力解法）
 * 注意讲出 排序后目标元素索引，升序排序以后，目标元素的索引是 len - k
 */
public class findKthLargestViolence {
    public static void main(String[] args) {
    }
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len-k];
    }
}
