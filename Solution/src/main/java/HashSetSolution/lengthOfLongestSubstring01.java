package HashSetSolution; /**
 * @author Albert
 * @date 2020/5/7 - 10:02 下午
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串:给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * 解法1：哈希集合
 *
 * 所使用语法：
 * set.contains
 * s.charAt()
 * Math.max()
 */
public class lengthOfLongestSubstring01 {
    public static void main(String[] args) {
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();           //定义一个哈希集合
        int max = 0;                                    //初始化结果max为0

        for (int i = 0,j = 0; j < s.length(); i++) {    //利用快慢指针ij扫描一遍字符串
            while (set.contains(s.charAt(j))) {         //如果快指针指向的字符出现在哈希集合
                set.remove(s.charAt(i));                //将慢指针指向的字符从哈希集合中删除
                i++;                                    //i指针继续向前
            }
            set.add(s.charAt(j));                       //当快指针的字符能加入到哈希集合
            max = Math.max(max,set.size());             //更新结果max
        }
        return max;                                     //遍历完毕，返回结果max
    }

}
