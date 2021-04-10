package _01_sort;


/**
 * @description: 冒泡排序
 * @author: shenhuan
 **/
public class _01_BubblingSort {

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 99, 45, 3};

        int[] sortNums = sort(nums);

        for (int i = 0; i < sortNums.length; i++) {
            System.out.println(sortNums[i]);
        }
    }

    private static int[] sort(int[] nums) {
        //参数校验 省略
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }


    private static int[] sort1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
