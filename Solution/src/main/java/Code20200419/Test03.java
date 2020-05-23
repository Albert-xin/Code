package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 4:40 下午
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组奇偶调换，不允许开辟第三个数组
 */
/**
public class Code20200419.Test03 {
    public static void main(String[] args) {
        Integer[] nums = {7,6,4,8,9,0,2,1,3,4,5,4,3};
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                list2.add(num);
            }else {
                list1.add(num);
            }
        }
        list1.addAll(list2);
        list1.toArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
 */
public class Test03 {
    public static void main(String[] args) {
        Integer[] nums = {7,6,4,8,9,0,2,1,3,4,5,4,3};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                //除以2判断是否是偶数
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[j];
                        //取一个基位temp
                        for (;j > i; j--) {
                            nums[j] = nums[j-1];
                            //数组向后移，非交换
                        }
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}