package LeetCode.DailyChallenge;

import java.util.HashSet;

public class RemoveDuplicateFromSortedList2
{
    public ListNode deleteDuplicates(ListNode head)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        ListNode curr = head;
        ListNode prev = head;
        while (curr!=null)
        {
            if (!set.contains(curr.val))
            {
                set.add(curr.val);
            }
            else
            {
                duplicate.add(curr.val);
            }
            curr = curr.next;
        }
        while (prev.next!=null)
        {
            if (duplicate.contains(prev.next.val))
            {
                prev.next = prev.next.next;
            }
            prev = prev.next;
        }
        return head;
    }
}
