package practice_01;

import sun.applet.resources.MsgAppletViewer;

import java.util.*;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-17 19:04
 **/
public class _15_三数之和_1 {

    public static void main(String[] args) {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {0,0,0,0};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    // https://leetcode-cn.com/problems/3sum/
    /*给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。*/
    public static List<List<Integer>> threeSum(int[] nums) {
        // 1.暴露求解  时间：O(n*n*n) 空间O(1)

        // 2.类似于两数求和 使用1个hashtable 时间：O(n^2) 空间O(n)

        // 3.先排序，使用双指针方式 时间：O(n^2) 空间O(1)

        //解法2 --> 这种方式会出现数据漏 或者 结果重复
        /*List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int twoSum = nums[i] + nums[j];
                List<Integer> value = new ArrayList<>();
                value.add(nums[i]);
                value.add(nums[j]);
                map.put(-twoSum, value);
            }
        }
        for (int i = 2; i <nums.length ; i++) {
            List<Integer> integers = map.get(nums[i]);
            if (integers != null){
                integers.add(nums[i]);
                result.add(integers);
            }
        }*/

        //解法3 先排序再双指针
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            //第一数大于0 后面的加起来肯定大于0
            if (nums[i]>0){
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue; //去重
            }
            while (l<r) {
                int sum = nums[l] + nums[i] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l] == nums[l+1]) {
                        l++; // 去重
                    }
                    while (l<r && nums[r] == nums[r-1]) {
                        r--; // 去重
                    }
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }


        return result;
    }
}
