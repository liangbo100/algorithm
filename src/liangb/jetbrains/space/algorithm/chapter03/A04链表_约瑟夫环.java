package liangb.jetbrains.space.algorithm.chapter03;

import java.util.Scanner;

public class A04链表_约瑟夫环 {


    static class Node{
        int val;
        Node next;
        Node(int v){
            val = v;
        }
    }


    public static void out(Node head, int m){

        while (head != head.next) {
            for (int i = 1; i < m; i++) {
                head = head.next;
            }
            System.out.println(head.next.val);
            head.next = head.next.next;
        }
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int m = input.nextInt();

        Node head = new Node(1);
        Node x = head;
        for (int i = 2; i <=n ; i++) {
            x = (x.next = new Node(i));
        }
        x.next = head;

        for (int i = 1; i <= k -1 ; i++) {
            x = x.next;
        }


        out(x,m);
    }

}
