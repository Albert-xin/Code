package DPSolution;

/**
 * @author Albert
 * @date 2020/5/5 - 3:07 下午
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 复原ip地址
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式
 */
/**
class ResotreIpAddress {
    public static void main(String[] args) {
    }
    class Solution {
        public List<String> restoreIpAddress(String s) {
            if (s.length() > 12 || s.length() < 4) {
                return new ArrayList<>();
            }
            ArrayList<ArrayList<String>>[] dp = new ArrayList[s.length() + 1];
            dp[0] = new ArrayList<ArrayList<String>>() {{add(new ArrayList<>());}};

            for (int i = 0; i < s.length(); i++) {
                dp[i] = new ArrayList<>();
                for (int j = 0; j < s.length(); j++) {
                    String Str = s.substring(j,i);
                    int str = 0;
                    int num = Integer.valueOf(str);
                }
            }
            return int[];
        }
    }
}
*/