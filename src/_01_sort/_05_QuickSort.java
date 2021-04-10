package _01_sort;

/**
 * @description: 快速排序
 * @author: shenhuan
 **/
public class _05_QuickSort {

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSort(int[] nums, int low, int hight) {
        if (low < hight) {
            int index = partition(nums, low, hight);
            quickSort(nums, low, index - 1);
            quickSort(nums, index + 1, hight);
        }

    }

    public int partition(int[] nums, int low, int hight) {

        int index = nums[low];
        while (low < hight) {
            while (low < hight && nums[hight] >= index) {
                hight--;
            }
            if (low < hight) {
                nums[low] = nums[hight];
            }


            while (low < hight && nums[low] <= index) {
                low++;
            }

            if (low < hight) {
                nums[hight] = nums[low];
            }
        }
        nums[low] = index;
        return low;

    }
}
