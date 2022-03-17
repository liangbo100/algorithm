package liangb.jetbrains.space.algorithm.chapter03;



public class A01链表_反转 {

    public static void main(String[] args) {


    }

    /**
     * 单向链表
     */
    public static class Node{
        int value;
        Node next;
        Node(int x){
            value = x;
        }
    }

    /**
     * 双向链表
     */
    public static  class DoubleNode{
        int value;
        DoubleNode pre, next;
        DoubleNode(int x){
            value = x;
        }
    }

    /**
     * 反转单链表
     * @param head 传入一个单链表
     * @return 反转后的链表
     */
    public static Node reverseLinkedList(Node head){

        Node pre = null, next;

        while (head != null){
            next = head.next ;
            head.next = pre ;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 反转双向链表
     * @param head 双向链表
     * @return 反转后的双向链表
     */
    public static DoubleNode reverseDoubleLinkedList(DoubleNode head){

        return null;
    }

}
