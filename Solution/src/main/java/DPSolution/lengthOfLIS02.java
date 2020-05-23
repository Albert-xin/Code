package DPSolution;

/**
 * @author Albert
 * @date 2020/5/8 - 6:16 下午
 */

/**
 * 300 最长上升子序列
 * 解法2：递归
 * 时间复杂度：O(2^n)
 * 递归 包含很多重复重叠的计算，
 */
public class lengthOfLIS02 {
    public static void main(String[] args) {
    }
    static int max;                             //定义一个静态变量max，用来保存最终的最长上升子序列的长度

    public int f(int[] nums, int n) {
        if (n <= 1) {                           //边界条件
            return n;
        }
        int result = 0;                 //int result = 0,int maxEndingHere = 1;
        int maxEndingHere = 1;          //包含当前最后一个元素的情况下，最长的上升子序列长度

        for (int i = 0; i < n; i++) {
            result = f(nums,i);

            if (nums[i-1] < nums[n-1] && result+1 > maxEndingHere) {
                maxEndingHere = result+1;
            }                           //以上循环是遍历数组，递归的求出以每个点为结尾的子数组中最长上升序列的长度
        }
        if (max < maxEndingHere) {
            max = maxEndingHere;
        }
        return maxEndingHere;           //比大小，哪个大返回哪个
    }
    public int LIS(int[] nums) {
        max = 1;
        f(nums,nums.length);
        return max;
    }
}