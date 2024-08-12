package com.example.problems;

import com.example.models.ListNode;

import java.util.HashSet;

public class LinkedListCycle {

    public static boolean cachingSolution(ListNode head) {
        var cache = new HashSet<ListNode>();

        var node = head;

        while (node != null) {

            if (cache.contains(node))
                return true;

            cache.add(node);
            node = node.getNext();
        }

        return false;
    }

    public static boolean floydCycleSolution(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;
        var slow = head;
        var fast = head.next;
        boolean first = true;


        while (slow != null && fast != null) {

            if (slow == fast) return true;

            slow = slow.next;
            if (fast.next != null) fast = fast.next.next;
            else return false;
        }

        return false;
    }

}
