package practice_02; /**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-19 14:27
 **/

import com.sun.org.apache.regexp.internal.RE;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _006_24_两两交换链表中的节点_02 {


    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        swapPairs(head1);
    }



    public static ListNode swapPairs(ListNode head) {
        return null;

    }



     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
