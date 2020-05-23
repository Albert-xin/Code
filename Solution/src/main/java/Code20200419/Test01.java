package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 3:45 下午
 */

import java.util.HashSet;
import java.util.Set;

/**
public class Code20200419.Test01 {
    public static void main(String[] args) {
        int[]nums = {2,3,4,4,8,22,30};
        for (int i=0; i<nums.length-1; i++ ) {
            if (nums[i] != nums[i+1]) {
                System.out.println(nums[i]);
                //System.out.println(",");
            }
            System.out.println(nums[nums.length-1]);
        }
    }
}
*/

/**
 * set 排序，自带去重属性，
 */
public class Test01 {
    public static void main(String[] args) {
        int[]nums = {2,3,4,4,8,21,22,30};
        Set<Integer> set = new HashSet<>();
            //set集合，集合里面只能存int类型的数字,取出时 也是直接是这个integer 对象，不需要强转。在写代码的时候，方便写入和取出
        for (int num : nums) {
            //for(元素类型t 元素变量x : 遍历对象obj){
            //这是一个foreach循环遍历，就是把nums这个数组进行遍历，它有多少个数，就遍历多少遍，遍历的时候每次就把其中的一个值给num;
            if (set.add(num)) {
                System.out.println(num);
                //System.out.println(",");
            }
        }
    }
}
