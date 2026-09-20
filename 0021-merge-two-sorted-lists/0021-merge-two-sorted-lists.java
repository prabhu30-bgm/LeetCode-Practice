/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode one = list1;
        ListNode two  = list2;
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        while(one != null && two != null)
        {
            if (one.val < two.val) {
                cur.next = one;
                one = one.next;
                cur = cur.next;
            } 
            else 
            {
                cur.next = two;
                two = two.next;
                cur = cur.next;
            }
        }

        if(one != null)
            cur.next = one;
        else
            cur.next = two;
        return temp.next;
    }
}
