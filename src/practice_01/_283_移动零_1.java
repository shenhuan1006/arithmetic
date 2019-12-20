package practice_01;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-18 14:04
 **/
public class _283_移动零_1 {
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
        int[] nums = {0,1,0,3,12};
        moveZeroes2(nums);
    }

    // 1. 找到一个0 就开始移动 直到移动完成

    // 遇到为0的就前移 最后全部补为0
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int s = 0 ;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != 0){
                nums[s++] = nums[i];
            }
        }
        for (int i = s; i <nums.length ; i++) {
            nums[s++] = 0;
        }
        System.out.println("");
    }
    // 2. 快慢指针，慢指针指向已经处理好的元素
    public static void moveZeroes2(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int s = 0 ;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != 0){
                if(s != i){
                    nums[s] = nums[i];
                    nums[i] = 0;
                }
                s++;
            }
        }
        System.out.println("");
    }

}
