package findKthLargest;

/**
 * @author Albert
 * @date 2020/5/8 - 11:26 上午
 */

import java.util.PriorityQueue;

/**
 * 接之前的方法和思路
 * 新思路：只用 k 个容量的优先队列，而不用全部 len 个容量
 */
public class findKthLargest01 {
    public static void main(String[] args) {
    }
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);    //使用一个含有 k 个元素的最小堆
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = k; i < len; i++) {
            Integer topEle = minHeap.peek();    //看一眼，不拿出，因为有可能没有必要替换

            if (nums[i] > topEle) {
                minHeap.poll();                 //只要当前遍历的元素比堆顶元素大，堆顶弹出
                minHeap.add(nums[i]);           //遍历的元素进去
            }
        }
        return minHeap.peek();
    }
}
