package practice_02;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-17 13:28
 **/
public class _001_11_盛最多水的容器_02 {


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(height);
        System.out.println(i);
    }

    //url: https://leetcode-cn.com/problems/container-with-most-water/
    public static int maxArea(int[] height) {
        //参数校验
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int leftValue = height[left];
            int rightValue = height[right];
            int area = 0;
            if (leftValue>rightValue){
                area = (right-left)*rightValue;
                right = right -1;
            } else {
                area = (right-left)*leftValue;
                left = left + 1;
            }
            if (area>maxArea){
                maxArea = area;
            }

        }

        return maxArea;
    }
}
