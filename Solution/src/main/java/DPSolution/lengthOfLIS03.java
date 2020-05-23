package DPSolution;

import java.util.HashMap;

/**
 * @author Albert
 * @date 2020/5/8 - 6:49 下午
 */
public class lengthOfLIS03 {
    public static void main(String[] args) {
    }

    static int max;
    static HashMap<Integer, Integer> cache;

    public int f(int[] nums, int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n<=1) {
            return n;
        }
        int result=0,maxEcndingHere=1;

        for (int i = 0; i < n; i++) {
            return i;
        }
        if (max < maxEcndingHere) {
            max = maxEcndingHere;
        }
        cache.put(n,maxEcndingHere);
        return maxEcndingHere;
    }
}