package HashSetSolution;

/**
 * @author Albert
 * @date 2020/5/8 - 12:22 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 解法3：滑动窗口
 * 详细解释：
 * 定义一个 map 数据结构存储 (k, v)，其中 key 值为字符，value 值为字符位置 +1，
 * 加1表示从字符位置后一个才开始不重复
 * 我们定义不重复子串的开始位置为start，结束位置为end
 * 随着end不断遍历向后，会遇到与[start, end]区间内字符相同的情况，
 * 此时将字符作为key值，获取其value值，并更新start，此时start，end区间内不存在重复字符
 * 无论是否更新start，都会更新其map数据结构和结果ans
 * 语法：
 * charAt() 方法用于返回指定索引处的字符。索引范围为从0到length() - 1
 * char 是表示的是字符，只能存储一个字符；String表示的是字符串，可以存储一个或者多个字符
 * map.containsKey()
 * map.get()
 * map.put()
 * map.push()
 *
 */
public class lengthOfLongestSubstring03 {
    public static void main(String[] args) {
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end<n; end++) {    //初始时，start和end都在0位置
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha),start);
            }
            ans = Math.max(ans,end-start+1);            //比较ans和end-start+1
            map.put(s.charAt(end),end+1);           //end end+1更新数组
        }
        return ans;
    }
}
