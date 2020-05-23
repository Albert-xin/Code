package Solution;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Albert
 * @date 2020/5/4 - 9:53 下午
 */

/**
 * 复原ip地址：给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * s表示字符串，ans 新List
 * 同样的，先判断边界条件：s不能等于空/s长度不等于0；
 * pos：当前遍历到s字符串中的位置，cur：当前存放已经确定好的ip段的数量
 */
public class Solution08 {
    public static void main(String[] args) {
    }

    public class Solution {
        public List<String> restoreIpAddresses(String s) {
            List<String> ans = new ArrayList<>();
            if (s == null || s.length() == 0) {
                return ans;
            }
            backTrace(s, 0, new ArrayList<>(), ans);
            return ans;
        }

        private void backTrace(String s, int pos, List<String> cur, List<String> ans) {
            if (cur.size() == 4) {
                if (pos == s.length()) {
                    ans.add(String.join(".", cur));     //String.join方法，在元素中间加上.
                }
                return;
            }
            for (int i = 1; i <= 3; i++) {                  //IP地址每段最多有三个数字
                if (pos + i > s.length()) {
                    break;                                  // 如果当前位置距离s末尾小于3就不用再分段了，直接跳出循环
                }

                String segment = s.substring(pos, pos + i); // substring() 方法返回字符串的子字符串，将 s 的子串开始分段
                if (segment.startsWith("0") && segment.length() > 1 || (i == 3 && Integer.parseInt(segment) > 255)) {
                    continue;

                    //Integer.parseInt()是把()里的内容转换成整型integer

                    // 剪枝条件：段的起始位置不能为0，段的长度要大于1，段拆箱成 int 类型的长度不能大于 255
                }
                cur.add(segment);   //符合要求就加入到 cur 数组中，继续递归遍历下一个位置
                backTrace(s, pos + i, cur, ans);     // 回退到上一个元素，即回溯
                cur.remove(cur.size() - 1);
            }
        }
    }
}