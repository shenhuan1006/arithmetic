package practice_02;

import sun.applet.resources.MsgAppletViewer;

import java.util.*;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-17 19:04
 **/
public class _004_15_三数之和_02 {

    public static void main(String[] args) {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {1, -1, -1,0};
        //int[] nums = {0, 0, 0, 0};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    // https://leetcode-cn.com/problems/3sum/
    /*给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。*/
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int first = 0; first < n; first++) {
            //如果数据一样的就去重
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int third = n - 1;
            int target = -nums[first];

            for (int second = first + 1; second < n; second++) {
                if (second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }

                while (second<third && nums[second]+nums[third]>target){
                    third--;
                }
                if (second==third){
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }

        }

        return ans;

    }
}
