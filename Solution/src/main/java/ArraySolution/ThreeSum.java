package ArraySolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Albert
 * @date 2020/5/5 - 11:59 上午
 */
/**
 * 三数之和：数组中任意三个数的和等于0，列出所有可能的三个数，且不重复；
 * 通用思路 上来先做几件事：使用ans表示数组或列表，声明length，判断边界条件
 * 具体思路：排序 遍历数组 然后使用双指针
 */
class ThreeSum {
    public static void main(String[] args) {
    }
    class Solution {
        public List<List<Integer>> threeSum(int[] nums){
            List<List<Integer>> ans = new ArrayList();
            int len = nums.length;
            if (nums == null || len < 3) return ans;
            Arrays.sort(nums);                              //把数组排序
            for (int i = 0; i < len; i++) {                     //遍历数组
                if (nums[i] > 0) break;                       //如果数组中的其中一个数字大于0，那么三数之和肯定大于0，放弃，结束循环
                if (i > 0 && nums[i] == nums[i - 1]) continue;  //如果数组中的其中一个数字大于0，而且该数字重复，放弃，跳过
                int L = i + 1;                                //L表示指向左端的指针，左指针,i是第一个数字 i=0,L=i+1=1
                int R = len - 1;                              //R表示指向右端的指针，右指针，代表最右端
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];  //三个数字
                    if (sum == 0) {                         //满足三数和等于0的情况下去重
                        ans.add(Arrays.asList(nums[i], nums[L], nums[R]));    //Arrays的asList方法，后者是前者的静态内部类，将数组转化为列表
                        while (L < R && nums[L] == nums[L + 1]) L++;  //去重
                        while (L < R && nums[R] == nums[R - 1]) R--;  //去重
                        L++;    //左指针继续往前
                        R--;    //右指针继续向后
                    } else if (sum < 0) L++;    //和小于0，继续向前搜寻
                    else if (sum > 0) R--;    //和大于0，继续向后搜寻
                }
            }
            return ans;
        }
    }
}
