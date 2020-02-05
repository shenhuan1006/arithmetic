package practice_01;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-19 14:33
 **/

import sun.security.x509.NetscapeCertTypeExtension;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _189_旋转数组 {


    public static void main(String[] args) {
        int[] nums = {6,7,1,2,3,4,5};
        rotate(nums,3);
    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length<1 || k<=0){
            return;
        }
        //1.暴力，每次移动1个。
       /* for (int i = 1; i <= k ; i++) {
            int move = nums[nums.length - 1];
            int temp;
            for (int j = 0; j <nums.length ; j++) {
                temp = nums[j];
                nums[j] = move;
                move = temp;
            }
        }*/
        
        //2.直接交换

       /* k = k % nums.length;
        int temp;
        int pre;
        int count = 0;
        for (int i = 0; count <nums.length ; i++) {
            pre = i;
            int preValue = nums[pre];
            do {
                int next = (pre + k) % nums.length;
                temp = nums[next];
                nums[next] = preValue;
                preValue = temp;
                pre = next;
                count++;
            } while (pre != i);


        }*/

       // 3.翻转

        System.out.println("");
    }
}
