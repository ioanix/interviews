package com.ioana;



public class Main {

    public static void main(String[] args) {

        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        System.out.println(l1);
        System.out.println("***************");

        ListNode l6 = new ListNode(4);
        ListNode l5 = new ListNode(6, l6);
        ListNode l4 = new ListNode(5, l5);

        System.out.println(l4);
        System.out.println("***************");


        System.out.println(mergeTwoLists(l1, l4));



    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy  = new ListNode(-1);
        ListNode head = dummy;

        while(l1 != null && l2 != null) {

            if (l1.val < l2.val) {

                dummy.next = l1;
                l1 = l1.next;

            } else {

                dummy.next = l2;
                l2 = l2.next;
            }

            dummy = dummy.next;

        }

        if(l1 != null) {

            dummy.next = l1;

        } else {

            dummy.next = l2;
        }

        return head.next;
    }
}
