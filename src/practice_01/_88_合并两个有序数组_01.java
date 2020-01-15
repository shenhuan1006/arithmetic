package practice_01;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-19 14:34
 **/

import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _88_合并两个有序数组_01 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1.先合并再排序
      /*  System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);*/

        // 2.快慢指针 --> 从前到后

        // 3.快慢指针 --> 从后到前
        int mslow = m - 1;
        int nSlow = n - 1;
        int index = m + n - 1;

        while (mslow >= 0 && nSlow >= 0) {
            if (nums1[mslow] < nums2[nSlow]) {
                nums1[index] = nums2[nSlow];
                nSlow--;
            } else {
                nums1[index] = nums1[mslow];
                mslow--;
            }
            index--;
        }

        if (nSlow > 0) {
            System.arraycopy(nums2, 0, nums1, 0, nSlow + 1);
        }


    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }
}
