package AddTwoNumbers;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode shadowHead = new ListNode();
    ListNode currentNode = shadowHead;
    int rem = 0;
    while (l1 != null || l2 != null || rem != 0) {
      int val1, val2;
      val1 = val2 = 0;

      if (l1 != null) {
        val1 = l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        val2 = l2.val;
        l2 = l2.next;
      }

      int sumVal = val1 + val2 + rem;
      ListNode node = new ListNode(sumVal % 10);
      currentNode.next = node;
      currentNode = currentNode.next;

      rem = sumVal / 10;
    }

    return shadowHead.next;      
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

    // ListNode l1 = insertLinkedList(new int[]{2,4,3});
    // ListNode l2 = insertLinkedList(new int[]{5,6,4});
    // ListNode l1 = insertLinkedList(new int[]{0});
    // ListNode l2 = insertLinkedList(new int[]{0});
    ListNode l1 = insertLinkedList(new int[]{9,9,9,9,9,9,9});
    ListNode l2 = insertLinkedList(new int[]{9,9,9,9});

    ListNode res = sol.addTwoNumbers(l1, l2);
    readLinkedList(res);
    
  }
}