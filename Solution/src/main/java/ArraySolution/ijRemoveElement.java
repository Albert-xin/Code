package ArraySolution;

/**
 * @author Albert
 * @date 2020/5/5 - 1:22 下午
 */
class ijRemoveElement {
    public static void main(String[] args) {
    }
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}