/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode cur = pre.next;
       // ListNode nex = pre.next.next;
        int pc = 2;
        List<Integer> ans = new ArrayList<>();
        while (cur != null && cur.next != null) {
            if (pre.val < cur.val && cur.val >cur.next.val || cur.val < pre.val && cur.val < cur.next.val) {
                ans.add(pc);
            }
            pre = pre.next;
            cur = cur.next;
            pc++;
        }
        int Arr[] = { -1, -1 };

        if (ans.size() > 1) {
            Arr[1] = ans.get(ans.size() - 1) - ans.get(0);
            int min = Integer.MAX_VALUE;
            for (int j = 1; j < ans.size(); j++) {
                min = Math.min(min, ans.get(j) - ans.get(j - 1));
            }
            Arr[0] = min;
        }

        return Arr;
    }
}