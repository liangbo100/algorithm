package liangb.jetbrains.space.algorithm.chapter05;

public class A01二叉树_实现 {


    public static class Node{
        int value;
        Node left;
        Node right;
        Node(int data){
            value = data;
        }
    }

    public  void f(Node head){
        if (head == null)
            return;

        f(head.left);
        f(head.right);
    }


    public static int f1(int n){
        if (n == 1)
            return 1;
        return n*f1(n-1);
    }

    public static void main(String[] args) {

        System.out.println(f1(5));

    }
}
