package Merged2SortedLists;

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

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode();
    ListNode currentNode = dummy;
    while (list1 != null || list2 != null) {
      if (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
          currentNode.next = new ListNode(list1.val);
          list1 = list1.next;
        } else {
          currentNode.next = new ListNode(list2.val);
          list2 = list2.next;
        }
      } else if (list1 != null) {
        currentNode.next = new ListNode(list1.val);
        list1 = list1.next;
      } else {
        currentNode.next = new ListNode(list2.val);
        list2 = list2.next;
      }

      currentNode = currentNode.next;
    }

    return dummy.next;
        
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    ListNode head1 = insertLinkedList(new int[]{1,2,4});
    ListNode head2 = insertLinkedList(new int[]{1,3,4});
    ListNode res = sol.mergeTwoLists(head1, head2);
    readLinkedList(res);
  }
  
}
