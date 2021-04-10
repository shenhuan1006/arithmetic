package _01_sort;

/**
 * @description: 归并排序
 * @author: shenhuan
 **/
public class _04_MergeSort {

    int[] tmp;

    public int[] sortArray(int[] nums) {
        tmp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) >> 1;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    private void merge(int[] nums, int l, int mid, int r) {
        int i = l, j = mid + 1;
        int index = 0;
        //比较两边大小
        while (i <= mid && j <= r) {
            if (nums[i] > nums[j]) {
                tmp[index++] = nums[j++];
            } else {
                tmp[index++] = nums[i++];
            }
        }
        //处理那种比较完后还有剩下的全部大于或小于另一边的数据
        while (i <= mid) {
            tmp[index++] = nums[i++];
        }
        while (j < r) {
            tmp[index++] = nums[j++];
        }

        //最后把结果复制到原数组
        for (int k = 0; k < r - l + 1; k++) {
            nums[k + l] = tmp[k];
        }
    }


}
