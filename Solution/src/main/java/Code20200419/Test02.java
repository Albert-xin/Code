package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 4:23 下午
 */

/**
 * 数组常考：交换 去重 排序
 * 数组应注意：边界条件 防止下标越界
 */
public class Test02 {
    public static void main(String[] args) {
        int[] nums = {1,2,6,4,3,6,10,9};
        int[] orders = new int[nums.length];
        //定义nums order两个数组,num[i]序号就是orders[i]
        for (int i = 0; i < nums.length; i++) {
            orders[i] = i + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    temp = orders[i];
                    orders[i] = orders[j];
                    orders[j] = temp;
                    //把编号也交换

                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+"序号"+orders[i]);
        }
    }
}
