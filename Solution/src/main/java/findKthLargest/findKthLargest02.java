package findKthLargest;

/**
 * @author Albert
 * @date 2020/5/8 - 11:33 上午
 */

import java.util.PriorityQueue;

/**
 * 接之前的方法和思路
 * 新思路：用k+1个容量的优先队列，使得上面的过程更“连贯”一些，到了k个以后的元素，就进来一个出去一个
 * 让优先队列自己去维护大小关系。
 */
public class findKthLargest02 {
    public static void main(String[] args) {
    }

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k + 1, (a, b) -> (a - b));
        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);
        }
        for (int i = k; i < len; i++) {
            priorityQueue.add(nums[i]);
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}