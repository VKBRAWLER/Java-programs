class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    ListNode temp = list1.next;
    if (a==0) { list1 = list2; }
    else { 
      for (int i = 0; i < a; i++) { 
        temp = list1.next;
      }
    }
  }
}

class minimum {
  public static void main (String[] args) {
    Solution s = new Solution();
    
  }
}