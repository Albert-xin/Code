package SortSolution;

/**
 * @author Albert
 * @date 2020/5/15 - 2:23 下午
 */

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
    }
    public int partition(int[] sortArray, int low, int height) {
        int key = sortArray[low];
        while (low < height) {
            while (low < height && sortArray[height] >= key)
                height--;
            sortArray[low] = sortArray[height];
            while (low < height && sortArray[low] <=key)
                low++;
            sortArray[height] = sortArray[low];
        }
        sortArray[low] = key;
        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i] + "\t");
        }
        System.out.println();
        return low;
    }
}
