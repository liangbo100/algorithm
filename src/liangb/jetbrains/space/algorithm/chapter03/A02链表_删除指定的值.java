package liangb.jetbrains.space.algorithm.chapter03;

public class A02链表_删除指定的值 {


    public static class Node{
        int value;
        Node next;
        Node(int x){
            value = x;
        }
    }


    public static Node removeValue(Node head, int num){
        while (head != null){
            if (head.value != num)
                break;
            head = head.next;
        }

        Node pre = head;
        Node cur = head;
        while ( cur != null){
            if (cur.value == num)
                pre.next = cur.next;
            else
                pre = cur;
            cur = cur.next;
        }
        return head;
    }
}
