package core;


/**
 * @author luozhou
 * @Description:反转链表
 * Input:1->2->3->4->5->null
 * Output:5->4->3->2->1->null
 * @date 2018/10/29 15:12
 */
public class ReverselinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //保存下一个节点，为下一个循环做处理
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


}
