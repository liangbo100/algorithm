package liangb.jetbrains.space.algorithm.chapter00;

public class B01阶乘 {


    /**
     * 求 阶乘相加 ：  1! + 2! + 3! + ... + n!
     * @param n 阶乘
     * @return 阶乘和
     */
    public static long factorial(long n){

        int result = 1 , sum = 0;

        for (int i = 1; i <= n; i++) {
            result = i*result;
            sum += result;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
