package luozhou;

/**
 * @author luozhou
 * @Description:
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 单位 数字。

如果，我们将这两个数起来相加起来，则会返回出一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 * @date 2018/11/19 14:04
 */
public class TwoNumbersAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=l1,b=l2;
        //构造一个哑节点
        ListNode dumyHead=new ListNode(0);
        //把哑节点赋值给当前节点
        ListNode curr=dumyHead;
        //进位flag
        int flag=0;
        while(a!=null||b!=null){
            int x=(a==null)?0:a.val;
            int y=(b==null)?0:b.val;
            int sum=x+y+flag;
            //计算相加后当前节点的值，因为有可能相加成为2位数，
            // 所以当前节点取模就可以求出相加后个位数
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            //这里求进位，比如相加后为2位数，flag肯定大于0，那么需要加到下一个节点
            flag=sum/10;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        //如果计算最后一个节点flag进位还是大于0，那么说明还需要进1位，构造一个节点即可。
        if(flag>0){
            curr.next=new ListNode(flag);
        }
        return dumyHead.next;


    }

   private  class ListNode{
        int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
