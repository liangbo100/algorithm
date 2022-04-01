package liangb.jetbrains.space.algorithm.chapter03;

import java.util.LinkedList;

public class A06链表_合并两个有序链表 {


//    public static void main(String[] args) {
//
//        int arr1[] = {1,2,4};
//        int arr2[] = {1,3,4};
//
//        ListNode l1 = null;
//
//        for (int i = 0; i < arr1.length; i++) {
//            l1 = new ListNode(arr1[i]);
//
//            l1 = l1.next;
//        }
//
//        System.out.println(l1.val);
//    }




    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        else if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next ,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }


//        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


