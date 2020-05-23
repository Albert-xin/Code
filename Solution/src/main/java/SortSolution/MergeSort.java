package SortSolution;

/**
 * @author Albert
 * @date 2020/5/7 - 8:32 下午
 */

/**
 * 合并两个数组
 */
public class MergeSort {
    public static void main(String[] args) {
    }
    public void sort(int[] nums,int lo, int mid, int hi, int i, int j) {
        int[] copy = nums.clone();          //复制一份原来的数组，如果直接在原来的数组上修改，后续比较会出错；

        int k = lo; i = lo; j = mid+1;      //三个指针，k表示从什么位置开始，ij分别表示左右半边的起始位置

        while (k<=hi) {
            if (i>mid) {
                nums[k++] = copy[j++];      //第一种情况，左半边都
            }else if (j>hi) {
                nums[k++] = copy[i++];      //第二种情况
            }else if (copy[j]<copy[i]) {
                nums[k++] = copy[j++];      //第三种情况
            }else {
                nums[k++] = copy[i++];      //第四种情况
            }
        }
    }
}
