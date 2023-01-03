package MergedKSortedLists;

import java.util.Iterator;
import java.util.PriorityQueue;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
  public static void readLinkedList(ListNode head) {
    ListNode currNode = head;

    while (currNode != null) {
      System.out.print(Integer.toString(currNode.val) + " ");
      currNode = currNode.next;
    }
    System.out.println("");
  }

  public static ListNode insertLinkedList(int[] arr) {
    if (arr.length == 0) {
      return null;
    }

    ListNode head = new ListNode(arr[0]);
    ListNode currNode = head;
    for (int i = 1; i < arr.length; i++) {
      ListNode node = new ListNode(arr[i]);
      currNode.next = node;
      currNode = currNode.next;
    }

    return head;
  }

  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (ListNode head: lists) {
      ListNode node = head;
      while (node != null) {
        System.out.println(node.val);
        pq.add(node.val);
        node = node.next;
      }
    }

    ListNode dummyHead = new ListNode();
    ListNode currNode = dummyHead;

    while (!pq.isEmpty()) {
      currNode.next = new ListNode(pq.poll());
      currNode = currNode.next;
    }

    return dummyHead.next;
  }
  
  public static void main(String[] args) {
    Solution sol = new Solution();
    ListNode head1 = insertLinkedList(new int[]{1,4,5});
    ListNode head2 = insertLinkedList(new int[]{1,3,4});
    ListNode head3 = insertLinkedList(new int[]{2,6});
    ListNode res = sol.mergeKLists(new ListNode[]{head1, head2, head3});
    readLinkedList(res);
  }
  
}
