package com.gorban.javadev.test;

import com.gorban.javadev.LinkedListSolutions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListSolutionsTest {

    LinkedListSolutions linkedList = new LinkedListSolutions();

    @Test
    void test() {
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        assertEquals(2, linkedList.get(1));
        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        assertEquals(3, linkedList.get(1));            // returns 3
    }

    @Test
    void hasCycle() {
//        Input: head = [3,2,0,-4], pos = 1
//        Output: true
        LinkedListSolutions.ListNode head = new LinkedListSolutions.ListNode(3);
        LinkedListSolutions.ListNode node1= new LinkedListSolutions.ListNode(2);
        LinkedListSolutions.ListNode node2= new LinkedListSolutions.ListNode(0);
        LinkedListSolutions.ListNode node3= new LinkedListSolutions.ListNode(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        assertTrue(linkedList.hasCycle(head));
        assertTrue(linkedList.hasCycle2(head));
        assertEquals(2, linkedList.detectCycle(head).val);
    }

    @Test
    void hasCycle2() {
//        Input: head = [1,2], pos = 0
//        Output: true
        LinkedListSolutions.ListNode head = new LinkedListSolutions.ListNode(1);
        LinkedListSolutions.ListNode node1= new LinkedListSolutions.ListNode(2);
        head.next = node1;
        node1.next = head;
        assertTrue(linkedList.hasCycle(head));
        assertTrue(linkedList.hasCycle2(head));
        assertEquals(1, linkedList.detectCycle(head).val);
    }

    @Test
    void hasCycle3() {
//        Input: head = [1], pos = -1
//        Output: false
        LinkedListSolutions.ListNode head = new LinkedListSolutions.ListNode(1);
        assertFalse(linkedList.hasCycle(head));
        assertFalse(linkedList.hasCycle2(head));
        assertNull(linkedList.detectCycle(head));
    }

    @Test
    void hasCycle4() {
        assertFalse(linkedList.hasCycle(null));
        assertFalse(linkedList.hasCycle2(null));
        assertNull(linkedList.detectCycle(null));
    }

    @Test
    void hasCycle5() {
//        Input: head = [27,-12,6,29,-12,5], pos = -1
//        Output: false
        LinkedListSolutions.ListNode head = new LinkedListSolutions.ListNode(27);
        LinkedListSolutions.ListNode node1= new LinkedListSolutions.ListNode(-12);
        LinkedListSolutions.ListNode node2= new LinkedListSolutions.ListNode(6);
        LinkedListSolutions.ListNode node3= new LinkedListSolutions.ListNode(29);
        LinkedListSolutions.ListNode node4= new LinkedListSolutions.ListNode(-12);
        LinkedListSolutions.ListNode node5= new LinkedListSolutions.ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        assertFalse(linkedList.hasCycle(head));
        assertFalse(linkedList.hasCycle2(head));
        assertNull(linkedList.detectCycle(head));
    }

    @Test
    void hasCycle6() {
//        Input: head = [9,20,14,14,2], pos = -1
//        Output: false
        LinkedListSolutions.ListNode head = new LinkedListSolutions.ListNode(9);
        LinkedListSolutions.ListNode node1= new LinkedListSolutions.ListNode(20);
        LinkedListSolutions.ListNode node2= new LinkedListSolutions.ListNode(14);
        LinkedListSolutions.ListNode node3= new LinkedListSolutions.ListNode(14);
        LinkedListSolutions.ListNode node4= new LinkedListSolutions.ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        assertFalse(linkedList.hasCycle(head));
        assertFalse(linkedList.hasCycle2(head));
        assertNull(linkedList.detectCycle(head));
    }

    @Test
    void removeDuplicates() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,5,1,2,1,9,8,6));
        LinkedList<Integer> expectedList = new LinkedList<>(Arrays.asList(1,5,2,9,8,6));
        assertEquals(expectedList, linkedList.removeDuplicates(list));
    }

    @Test
    void removeDuplicates2() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,5,1,2,1,9,8,6));
        LinkedList<Integer> expectedList = new LinkedList<>(Arrays.asList(1,5,2,9,8,6));
        assertEquals(expectedList, linkedList.removeDuplicates2(list));
    }

    @Test
    void removeDuplicates3() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,5,1,2,1,9,8,6));
        LinkedList<Integer> expectedList = new LinkedList<>(Arrays.asList(1,5,2,9,8,6));
        assertEquals(expectedList, linkedList.removeDuplicates3(list));
    }
}