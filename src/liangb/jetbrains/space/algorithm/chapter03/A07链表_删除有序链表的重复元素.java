package liangb.jetbrains.space.algorithm.chapter03;

public class A07链表_删除有序链表的重复元素 {


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return head;
        ListNode cur = head ;
        while (cur.next!=null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
