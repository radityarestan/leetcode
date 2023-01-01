package RemoveNthNodeFromEndOfList;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int size = 0;

    ListNode currentNode = head;
    while (currentNode != null) {
      size++;
      currentNode = currentNode.next;
    }

    int idx = size - n;
    if (idx == 0) {
      return head.next;
    }

    currentNode = head;
    ListNode prevNode = null;
    while (idx != 0) {
      idx--;
      prevNode = currentNode;
      currentNode = currentNode.next;
    }

    prevNode.next = currentNode.next;
    
    return head;
  }

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

  public static void main(String[] args) {
    Solution sol = new Solution();

    ListNode head = insertLinkedList(new int[]{1,2,3,4,5});
    ListNode res = sol.removeNthFromEnd(head, 4);
    // ListNode head = insertLinkedList(new int[]{1});
    // ListNode res = sol.removeNthFromEnd(head, 1);
    // ListNode head = insertLinkedList(new int[]{1,2});
    // ListNode res = sol.removeNthFromEnd(head, 1);
    readLinkedList(res);
  }
}
