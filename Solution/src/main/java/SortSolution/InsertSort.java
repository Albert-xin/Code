package SortSolution;

/**
 * @author Albert
 * @date 2020/5/7 - 8:24 下午
 */

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
    }
    public void sort(int[] nums) {
            for (int i = 1,j,current; i < nums.length; i++) {
                //将数组中的第一个元素看作是排好序的部分，所以从第二个元素开始，即i=1
                current = nums[i];
                //遍历的值 用current保存起来 当前的值
                for (int i1 = i-1; i>=0 && nums[i]>current; i--) {
                    nums[i+1] = nums[i];
                }
                nums[i+1] = current;
            }
        }
    }
