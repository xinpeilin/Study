package com.ss;

public class Day02 {

	public static void main(String[] args) {
		System.out.println(addTwoNumbers1(new ListNode(123), new ListNode(456)));
		System.out.println(addTwoNumbers2(new ListNode(123), new ListNode(456)));

	}

	// 递归解法，可以只考虑两个节点相加，要进行两步，首先是节点相加，然后是相加的结果和余数相加。

	public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		if (l1 == null || l2 == null) {
			return l1 == null ? l2 : l1;
		}
		int value = l1.val + l2.val;
		ListNode result = new ListNode(value % 10);
		// 节点相加
		result.next = addTwoNumbers1(l1.next, l2.next);
		// 节点相加的结果和余数相加.
		if (value >= 10) {
			result.next = addTwoNumbers1(new ListNode(value / 10), result.next);
		}
		return result;
	}

	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode resultList = new ListNode(0);
		int cache = 0;

		ListNode l3 = resultList;
		while (l1 != null || l2 != null || cache > 0) {
			int l1Val = l1 == null ? 0 : l1.val;
			int l2Val = l2 == null ? 0 : l2.val;
			int l3Val = l1Val + l2Val + cache;
			cache = 0;

			// 判断是否大于 9 大于9 进一位
			if (l3Val > 9) {
				cache = 1;
				l3Val = l3Val - 10;
			}

			l3.next = new ListNode(l3Val);

			l3 = l3.next;
			l1 = l1 == null ? l1 : l1.next;
			l2 = l2 == null ? l2 : l2.next;
		}

		return resultList.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
