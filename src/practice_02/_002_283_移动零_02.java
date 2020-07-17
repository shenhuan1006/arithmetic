package practice_02;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-18 14:04
 **/
public class _002_283_移动零_02 {
    /*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    示例:
    输入: [0,1,0,3,12]
    输出: [1,3,12,0,0]
    说明:
    必须在原数组上操作，不能拷贝额外的数组。
    尽量减少操作次数。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/move-zeroes
     */

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes2(nums);
        System.out.println(nums);
    }


    public static void moveZeroes(int[] nums) {
        // 遍历，遇到0就往后移动
        //参数验证
        if (nums == null || nums.length < 1) {
            return;
        }

        // 两次遍历
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZeroes2(int[] nums) {
        //参数验证
        if (nums == null || nums.length < 1) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }

    }

}
