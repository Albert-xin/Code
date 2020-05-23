package FocusOn;

/**
 * @author Albert
 * @date 2020/5/8 - 1:11 下午
 */

/**
 * 寻找两个有序数组的中位数
 * 解法2：
 */
public class findMedianSortedArrays02 {
    public static void main(String[] args) {
    }
    public static double findKth(int[] nums1, int l1, int h1, int[] nums2, int l2, int h2, int k) {
        int m = h1 - l1 + 1;                        //findKth是为了寻找第k小的元素
        int n = h2 - l2 + 1;
        if (m > n) {
            return findKth(nums2,l2,h2,nums1,l1,h1,k);
        }                                           //如果nums1的长度大于nums2，将两者互换
        if (m == 0) {
            return nums2[l2 + k - 1];               //如果nums1长度为0，直接返回nums2中第k小的数
        }
        if (k == 1) {
            return Math.min(nums1[l1],nums2[l2]);   //当k=1，返回两个数组中的最小值
        }
        int na = Math.min(k/2,m);
        int nb = k - na;
        int va = nums1[l1 + na -1];
        int vb = nums2[l2 + nb -1];                 //以上四行表示 分别选两个数组的中间数

        if (va == vb) {
            return va;
        }else if (va < vb) {
            return findKth(nums1, l1+na, h1, nums2, l2, l2 + nb - 1, k - na);
        }else {
            return findKth(nums1, l1, l1 + na - 1, nums2, l2 + nb, h2, k - nb);
        }
    }
}