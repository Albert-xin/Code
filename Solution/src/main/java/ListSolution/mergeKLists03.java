package ListSolution;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Albert
 * @date 2020/5/8 - 4:26 下午
 */
/**
public class mergeKLists03<ListNode> {
    //public static void main(String[] args) {
    //}
    public ListNode merge(ListNode[] lists) {
        if (lists == null || lists.length == 0){
            return null;
        }
        //以下为 创建一个小根堆，并定义好排序函数
        PriorityQueue<ListNode> queue = new PriorityQueue(new Comparator<ListNode>() {
            public int compare(ListNode o1,ListNode o2) {
                return (o1.val - o2.val);
            }
        }
        );
        ListNode dummy = new ListNode(-1);  //只有带参的构造函数才可用
        ListNode cur = dummy;

        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            if (head != null) {
                queue.add(head);            //把k个链表的第一个结点放入到堆中
            }
        }

        while (queue.size()>0) {
            ListNode node = queue.poll();   //不断的从堆中取出结点
            cur.next = node;
            cur = cur.next;
            if (node.next != null) {        //如果这个节点不为空还有下一个节点
                queue.add(node.next);       //继续将下个节点也放入堆中
            }
        }
        cur.next = null;
        return dummy.next;
    }
}
 */