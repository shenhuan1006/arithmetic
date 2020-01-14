package practice_01; /**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-19 14:27
 **/

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
public class _24_两两交换链表中的节点_01 {


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

        // 解法一：直接交换
        /*ListNode headPre = new ListNode(-1);
        headPre.next = head;
        ListNode temp = headPre;

        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }

        return headPre.next;*/

        if(head == null || head.next == null){
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return next;


        // 解法二：迭代交换

        // 解法三：递归交换
    }



     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
}
