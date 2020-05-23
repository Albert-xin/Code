package DPSolution;

/**
 * @author Albert
 * @date 2020/5/8 - 5:33 下午
 */

/**
 * 300 最长上升子序列：给定一个无序的整数数组，找到其中最长上升子序列的长度；The length of the longest ascending subsequence
 *
 * 解法1：自底向上bottom-Up
 *
 * 时间复杂度分析：
 * 下边是一个双重for循环，i=0 内循环执行0次，i=n 内循环执行n-1次，O(1+2+3+...+n-1)=n(n-1)/2=O(n^2)
 */
public class lengthOfLIS01 {
    public int LIS(int[] nums, int n) {
        int[] cache = new int[n];               //使用一维数组cache来存储结果
        int i,j,max = 0;

        for (i = 0; i < n; i++) {
            cache[i] = 1;                       //初始化cache里的每个元素的值为1
        }

        for (i = 0; i < n; i++) {               //自底向上的求解每个子问题的最优解
            for (j = 0; j < i; j++) {
                if (nums[j]<nums[i] && cache[i]<cache[j]+1) {
                    cache[i] = cache[j] + 1;
                }
                /**
                 * 以上for循环表示：//拿遍历遇到的每个元素num[i]和nums[j]比较，如果有num[i]<nums[j]，
                 * 说明num[i]有机会构成上升序列，如果新的上升序列比之前计算过的还要长，更新以下，保存到cacahe
                 */
                max = Math.max(max,cache[i]);   //用当前计算好的长度与全局的最大值进行比较，求最大
            }
        }
        return max;
    }
}
