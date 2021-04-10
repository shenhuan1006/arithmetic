package _01_sort;

/**
 * @description: 插入排序
 * @author: shenhuan
 **/
public class _02_InsertSort {

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 99, 45, 3};

        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    private static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < nums[j]) {
                    nums[j + 1] = nums[j];
                }else {
                    break;
                }
            }
            nums[j + 1] = value;
        }
    }

}
