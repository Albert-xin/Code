import java.util.HashMap;
import java.util.Map;

/**
 * @author Albert
 * @date 2020/5/19 - 8:51 下午
 */
class twosum {
    public static void main(String[] args) {
    }
    public int[] twosum(int[] nums, int targrt) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(targrt-nums[i])) {
                return new int[] {map.get(targrt-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IndexOutOfBoundsException("No");
    }
}
