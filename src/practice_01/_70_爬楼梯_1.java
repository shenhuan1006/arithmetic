package practice_01; /**
 * @program: arithmetic
 * @description:
 * @author: shenhuan
 * @create: 2019-12-18 14:06
 **/


import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _70_爬楼梯_1 {

    private Map<Integer,Integer> map = new HashMap();
    // 递归的方式
    public  int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        Integer n1 = map.get(n - 1);
        Integer n2 = map.get(n - 2);
        if (n1  == null){
            n1 = climbStairs(n - 1);
            map.put(n - 1, n1);
        }
        if (n2  == null){
            n2 = climbStairs(n - 2);
            map.put(n - 2, n2);
        }


        return n1 + n2;
    }

    // 非递归的方式
    public  int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int n1 = 1;
        int n2 = 2;
        int sum = 0;
        for (int i = 3; i <= n ; i++) {
            sum  = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}
