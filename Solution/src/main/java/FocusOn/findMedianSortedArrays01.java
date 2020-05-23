package FocusOn;

/**
 * @author Albert
 * @date 2020/5/5 - 12:43 上午
 */
/**
 * 寻找两个有序数组的中位数
 * 解法1：暴力法
 * 遍历全部数组（m+n），时间复杂度O(m+n)，原题要求时间复杂度为O(log(m+n))
 */
class findMedianSortedArrays01 {
    public static void main(String[] args) {
        class Solution {
            public double findMediaSortedArrays() {
                int[] nums1 = new int[]{1, 2};
                int[] nums2 = new int[]{3, 4};
                int m = nums1.length;
                int n = nums2.length;
                int[] nums = new int[m + n];

                if (m == 0) {
                    if (n % 2 == 0) {
                        return (nums2[n / 2 - 1] + nums2[n / 2]) / 2;
                    } else {
                        return nums2[n / 2];
                    }
                }
                if (n == 0) {
                    if (m % 2 == 0) {
                        return (nums1[m / 2 - 1] + nums1[m / 2]) / 2;
                    } else {
                        return nums1[m / 2];
                    }
                }
                int count = 0;
                int i = 0, j = 0;
                while (count != (m + n)) {
                    if (i == m) {
                        while (j != m) {
                            nums[count++] = nums2[j++];
                        }
                        break;
                    }
                    if (j == n) {
                        while (i != m) {
                            nums[count++] = nums1[i++];
                        }
                        break;
                    }

                    if (nums1[i] < nums2[j]) {
                        nums[count++] = nums1[i++];
                    } else {
                        nums[count++] = nums2[j++];
                    }
                }
                if (count % 2 == 0) {
                    return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
                } else {
                    return nums[count / 2];
                }
            }
        }
    }
}
