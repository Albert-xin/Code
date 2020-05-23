package Code20200419;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Albert
 * @date 2020/5/1 - 6:35 下午
 */

/**
 * 找出数组里的最大值和最小值
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arry = {12,2,1,34,5,77};
        int maxIndex = arry[0];         //定义最大值为该数组的第一个数
        int minIndex = arry[0];         //定义最小值为该数组的第一个数
        //遍历循环数组
        for (int i = 0; i < arry.length; i++) {
            if (maxIndex < arry[i]) {
                maxIndex = arry[i];
            }
            if (minIndex > arry[i]) {
                minIndex = arry[i];
            }
        }
        for (int i = 0; i < arry.length; i++) {
            //System.out.println(arry[i] + "");
        }
        System.out.println("最大值为："+maxIndex+"\n最小值为："+minIndex);
    }
}
