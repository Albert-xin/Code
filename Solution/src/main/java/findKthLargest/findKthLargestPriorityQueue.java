package findKthLargest;

/**
 * @author Albert
 * @date 2020/5/8 - 10:52 上午
 */

import java.util.PriorityQueue;

/**
 * 使用优先队列和小顶堆实现
 *
 * 思路：把 len 个元素都放入一个最小堆中，然后再 pop() 出 len - k 个元素，此时最小堆只剩下 k 个元素，堆顶元素就是数组中的第 k 个最大元素
 * 堆满的时候，如果新读到的数小于等于堆顶，肯定不是我们要找的元素，只有新都到的数大于堆顶的时候，才将堆顶拿出，
 * 然后放入新读到的数，进而让堆自己去调整内部结构。
 * 说明：这里最合适的操作其实是 replace，即直接把新读进来的元素放在堆顶，然后执行下沉（siftDown）操作。
 * Java 当中的 PriorityQueue 没有提供这个操作，只好先 poll() 再 offer()
 */
public class findKthLargestPriorityQueue {
    public static void main(String[] args) {
    }
    public class Solution {
        public int findKthLargest(int[] nums, int k) {
            int len = nums.length;
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(len, (a, b) -> a - b);
            // 使用一个含有 len 个元素的最小堆，默认是最小堆，可以不写 lambda 表达式：(a, b) -> a - b
            for (int i = 0; i < len; i++) {
                minHeap.add(nums[i]);
            }
            for (int i = 0; i < len - k; i++) {
                minHeap.poll();
            }
            return minHeap.peek();
        }
    }
}
