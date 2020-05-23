package ListSolution;

import java.util.List;

/**
 * @author Albert
 * @date 2020/5/8 - 3:56 下午
 */

/**
 * 合并 K 个有序链表
 * 解法：数组两两合并后递归
 */
public class mergeKLists02<ListNode> {
    public static void main(String[] args) {
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return merge(lists,0,lists.length-1);
    }
    private ListNode merge(ListNode[] lists,int lo,int hi){
        if (lo == hi) {
            return lists[lo];
        }
        int mid = lo+(hi - lo) / 2 ;
        ListNode l1 = merge(lists,lo,mid);
        ListNode l2 = merge(lists,mid+1,hi);
        return merge2KLists(l1,l2);
    }

    private ListNode merge2KLists(ListNode l1, ListNode l2) {
        return null;
    }
}
