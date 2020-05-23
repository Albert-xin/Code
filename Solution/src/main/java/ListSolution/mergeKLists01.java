package ListSolution;

/**
 * @author Albert
 * @date 2020/5/8 - 3:24 下午
 */

/**
 * 合并 K 个有序链表
 * 解法：数组两两合并后迭代
 */
public class mergeKLists01<ListNode> {
    public static void main(String[] args) {
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        int k = lists.length;
        while (k > 1) {
            int idx = 0;
            for (int i = 0; i < k; i += 2) {
                if (i == k - 1) {
                    lists[idx++] = lists[i];
                } else {
                    lists[idx++] = merge2Lists(lists[i], lists[i + 1]);
                }
            }
            k = idx;
        }
        return lists[0];
    }
    private ListNode merge2Lists(ListNode list, ListNode list1) {
        return list;
    }
}
