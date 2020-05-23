package Solution; /**
 * @author Albert
 * @date 2020/5/4 - 9:36 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 标签：哈希映射
 * 这道题本身如果通过暴力遍历的话也是很容易解决的，时间复杂度在 O(n2)
 * 由于哈希查找的时间复杂度为 O(1)，所以可以利用哈希容器 map 降低时间复杂度
 * 遍历数组 nums，i 为当前下标，每个值都判断map中是否存在 target-nums[i] 的 key 值
 * 如果存在则找到了两个值，如果不存在则将当前的 (nums[i],i) 存入 map 中，继续遍历直到找到为止
 * 如果最终都没有结果则抛出异常
 * 时间复杂度：O(n)
 */
class TwoSumHashMap {
    public static void main(String[] args) {
    }
    public int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])){           //map中的containsKey方法是判断该key在map中是否有key存在
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);                                //map.put()方法将获取map集合的所有键名，并存放在一个set集合对象中
        }
        throw new IllegalArgumentException("No");
    }
}
