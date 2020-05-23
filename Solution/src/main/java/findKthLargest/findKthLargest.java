package findKthLargest;
/**
 * @author Albert
 * @date 2020/5/8 - 8:52 上午
 */
import java.util.Random;
/**
 * 数组中的第K个最大元素：
 * 在未排序的数组中找到第k个最大的元素,请注意你需要找的是数组排序后的第k个最大的元素，而不是第k个不同的元素。
 *
 * 后续使用切分，优先队列，小顶堆，大顶堆等思路来实现；
 *
 * 拓展：有没有缩小时间和空间复杂度的思路或方案？
 * k较小的时候使用最小堆，k较大的时候使用最大堆。
 *
 */
public class findKthLargest {
    public static void main(String[] args) {
    }

    int[] nums;

    public void swap(int a, int b) {
        int tmp = this.nums[a];
        this.nums[a] = this.nums[b];
        this.nums[b] = tmp;
    }

    public int partition(int left, int right, int pivot_index) {    //partition切分
        int pivot = this.nums[pivot_index];
        swap(pivot_index, right);                    //把枢轴交换到最后
        int store_index = left;

        for (int i = left; i <= right; i++) {
            if (this.nums[i] < pivot) {
                swap(store_index, i);                //把所有较小元素都交换到左边
                store_index++;
            }
        }
        swap(store_index, right);
        return store_index;
    }

    public int quickselect(int left, int right, int k_smallest) {

        if (left == right)
            return this.nums[left];

        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left);

        pivot_index = partition(left, right, pivot_index);

        if (k_smallest == pivot_index)
            return this.nums[k_smallest];

        else if (k_smallest < pivot_index)
            return quickselect(left, pivot_index - 1, k_smallest);

        return quickselect(pivot_index + 1, right, k_smallest);
    }

    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        int size = nums.length;
        return quickselect(0, size - 1, size - k);
    }
}