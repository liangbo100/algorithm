package liangb.jetbrains.space.algorithm.chapter03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class A08链表_环形链表 {



    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null)
                return false;

            ListNode low = head,fast = head;
            while (low.next != null &&  fast.next != null && fast.next.next!= null){
                if (low.next == fast.next.next)
                    return true;

                low = low.next;
                fast = fast.next.next;
            }
            return false;
        }
    }
}
