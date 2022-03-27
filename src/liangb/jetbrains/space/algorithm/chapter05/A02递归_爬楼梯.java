package liangb.jetbrains.space.algorithm.chapter05;


public class A02递归_爬楼梯 {

    public static void main(String[] args) {

        System.out.println(climbStairs2(5));

    }

    /**
     * 普通递归， 时间和空间复杂度较高， 可以用散列表存储数据
     * @param k 楼梯数
     * @return
     */
    public  static int climbStairs(int k) {
        if (k == 1)
            return 1;
        if (k == 2)
            return 2;
        return climbStairs(k-1) + climbStairs(k-2);
    }

    public  static int climbStairs2(int k) {
        if (k == 1) {
            return 1;
        }
        if (k == 2) {
            return 2;
        }
        int result = 0;
        for (int n = 3 , last = 2 ,last_last = 1; n <= k ; n++){
            result = last + last_last;
            last_last = last;
            last = result;
        }

        return result;
    }
}
