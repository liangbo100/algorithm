package liangb.jetbrains.space.algorithm.chapter03;

import java.util.LinkedList;

public class A03链表_查找链表中点 {

    static class Node{
        int value;
        Node next;
        Node(int val){
            value = val;
        }
    }

    /**
     * 输入链表的头节点，奇数长度返回中点，偶数长度返回上中点
     *
     *  解析： 用快慢指针的方法完成该操作
     *   快指针走两步，  慢指针（mid）走一步 ， 直到快指针走完， 慢指针就会来到中点的位置
     * @param head 链表头节点
     * @return  中点或上中点
     */
    public static Node midOrUpMidNode(Node head){
        if (head == null) return null;
        Node cur = head, mid = head;
        boolean flag = false;
        while (cur.next != null){
            cur = cur.next;
            if (flag)
                mid = mid.next;
            flag = !flag;
        }

        return mid;
    }



    // for test
    public static Node generateRandomLinkedList(int len, int value) {
        int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }
        size--;
        Node head = new Node((int) (Math.random() * (value + 1)));
        Node pre = head;
        while (size != 0) {
            Node cur = new Node((int) (Math.random() * (value + 1)));
            pre.next = cur;
            pre = cur;
            size--;
        }
        return head;
    }

    //for test
    public static Node checkLinkedListGetMid(Node head){

        if (head == null) return head;
        LinkedList<Node> linkedList = new LinkedList<>();
        Node mid = head;
        for (Node c = head; c != null ; c = c.next) {
            linkedList.add(c);
        }

        int size = linkedList.size();
        mid = (  size % 2 == 0 ? linkedList.get( size/2 - 1) : linkedList.get(size/2) );
        return mid;
    }


    public static void main(String[] args) {

        int len = 50;
        int value = 100;
        int testTime = 100000;
        System.out.println("test begin!");
        for (int i = 0; i < testTime; i++) {
            Node node1 = generateRandomLinkedList(len, value);
            Node a = midOrUpMidNode(node1);
            Node b = checkLinkedListGetMid(node1);

            if (a != b) {
                System.out.println("失败!");
                break;
            }
            Node node2 = generateRandomLinkedList(len, value);
            Node c = midOrUpMidNode(node2);
            Node d = checkLinkedListGetMid(node2);

            if (c != d) {
                System.out.println("失败!");
                break;
            }
        }
        System.out.println("test finish!");

    }



    public static void printNode(Node head){

        Node cur = head;
        while ( cur != null){
            System.out.print(cur.value + "\t");
            cur = cur.next;
        }
        System.out.println();
    }
}
