package ArraySolution;

/**
 * @author Albert
 * @date 2020/5/5 - 12:06 下午
 */

/**
 * 移除元素：给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组
 */

/**
 * 标签：交换移除
 * 主要思路是遍历数组nums，遍历指针为i，总长度为ans
 * 在遍历过程中如果出现数字与需要移除的值不相同时，则i自增1，继续下一次遍历
 * 如果相同的时候，则将nums[i]与nums[ans-1]交换，即当前数字和数组最后一个数字进行交换，交换后就少了一个元素，故而ans自减1
 * 这种思路在移除元素较少时更适合使用，最极端的情况是没有元素需要移除，遍历一遍结束即可
 */

public class SwapRemoveElement {
    public static void main(String[] args) {
    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int ans = nums.length;
            for (int i = 0; i < ans;) {
                if (nums[i] == val) {
                    nums[i] = nums[ans - 1];        //交换，当前数字和数组最后一个数字进行交换
                    ans--;                          //交换后就少了一个元素
                }else {
                    i++;
                }
            }
            return ans;
        }
    }
}