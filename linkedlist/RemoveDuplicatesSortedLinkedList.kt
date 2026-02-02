package com.ford.car.settings.ford.display.util

class RemoveDuplicatesSortedLinkedList {

//    83. Remove Duplicates from Sorted List
//    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
//    Example 1:
//    Input: head = [1,1,2]
//    Output: [1,2]
//
//    Example 2:
//    Input: head = [1,1,2,3,3]
//    Output: [1,2,3]
//
//
//    Constraints:
//    -100 <= Node.val <= 100
//    The list is guaranteed to be sorted in ascending order.
//
//    /**
//     * Example:
//     * var li = ListNode(5)
//     * var v = li.`val`
//     * Definition for singly-linked list.
//     * class ListNode(var `val`: Int) {
//     *     var next: ListNode? = null
//     * }
//     */
    class Solution {
        fun deleteDuplicates(head: ListNode?): ListNode? {
            var current = head
            if(current==null)return head

            while(current?.next!=null){
                if(current?.`val`==current?.next?.`val`){
                    current?.next=current?.next?.next
                }else
                    current=current?.next
            }
            return head
        }
    }
}