package practice_02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-17 10:22
 **/
public class _000_1_两数之和_2 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }

    /*
    URL：https://leetcode-cn.com/problems/two-sum/
    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    示例:
    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
*/
    public static int[] twoSum(int[] nums, int target) {
        // 1.暴露破解 ：时间：O(n*n)

        // 2.使用散列表，时间：O(n)
            // 1.先将差值存起来
            // 2.遍历，遇到相同说明加起来是等于 target
        HashMap<Integer, Integer> hashtable = new HashMap();
        hashtable.put(target - nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            Integer index = hashtable.get(nums[i]);
            if (index != null) {
                int[] result = {index, i};
                return result;
            } else {
                hashtable.put(target - nums[i], i);
            }
        }
        return null;
    }
}
