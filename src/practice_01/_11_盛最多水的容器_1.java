package practice_01;

/**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-17 13:28
 **/
public class _11_盛最多水的容器_1 {


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(height);
        System.out.println(i);
    }

    //url: https://leetcode-cn.com/problems/container-with-most-water/
    public static int maxArea(int[] height) {
        // 1.暴露求解 O(n*n)
        // 2. 两边往中间收 时间复杂度O(n) 空间O(1)
        //    最先求出最远距离，面积，比较矮的一侧向中间移动
        int left = 0 ;
        int right = height.length - 1;
        int max =0;
        while (left<right){
            int h = height[left];
            int w = right - left;
            if (height[left] > height[right]){
                h = height[right];
                right = right - 1;
            }else {
                left = left + 1;
            }
            int area = h * w;
            if (max < area){
                max = area;
            }

        }

        return max;
    }
}
