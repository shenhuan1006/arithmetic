package practice_02; /**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-19 14:26
 **/


import com.sun.org.apache.regexp.internal.RE;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 */

public class _005_206_反转链表_02 {

    //递归
    public ListNode reverseList1(ListNode head) {



        if (head.next == null){
            return head;
        }
        return null;
    }

    //迭代
    public ListNode reverseList2(ListNode head) {
        return null;


    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}





