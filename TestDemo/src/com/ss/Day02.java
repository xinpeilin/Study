package com.ss;


public class Day02 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        //余数
        int remainder = 0;
        
        while (l1 != null || l2 != null || remainder > 0) {
            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            //记录余数.
            int item = remainder + a + b;
            remainder = item >= 10 ? 1 : 0;
            ListNode current = new ListNode(item % 10);
            if (tail == null) {
                tail = current;
                head = current;
            } else {
                tail.next = current;
                tail = tail.next;
            }
        }
        return head;
    }
	
	
	
	  public class ListNode {
		  int val;
		  ListNode next;
		  ListNode(int x) { val = x; }
	  }
}



