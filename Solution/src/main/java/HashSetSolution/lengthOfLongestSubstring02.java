package HashSetSolution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Albert
 * @date 2020/5/7 - 10:21 下午
 */

/**
 * 解法2：优化01
 */
public class lengthOfLongestSubstring02 {
    public static void main(String[] args) {
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();   //定义一个hashset记录上次某字符出现的位置
        int max = 0;

        for (int i = 0,j = 0; i < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {         //如果发现快指针所对应的字符已经出现过
                i = Math.max(i,map.get(s.charAt(j))+1); //慢指针就进行跳跃
            }
            map.put(s.charAt(j),j);         //把快指针所对应的字符添加到哈希表中
            max = Math.max(max,j-i+1);      //更新结果max
        }
        return max;
    }
}
