package liangb.jetbrains.space.algorithm.chapter02;


import java.util.Scanner;

public class A05二分查找_次方根 {


    public static void main(String[] args) {
//        System.out.println(nThRoot(3.0,64));
//        System.out.println((0.1e-6)/3);
        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();
        double M = input.nextDouble();
        double v = nThRoot(M,N);
        System.out.println(String.format("%.7f", v));
    }

    public static double nThRoot(double M, double N) {
        double l = 1, r = N, eps = 1e-8 , result = -1;
        double mid = r;
        while ((l+eps) < r){
            result = pow(mid, M);
            if (N <= result)
                r = mid;
            else if (N > result)
                l = mid;
            mid = (l + r) / 2;
        }
        return mid;
    }

    /**
     * 求M次方根号N  (整数版本)
     * @param M 根指数
     * @param N 被开方数
     * @return
     */
    public static int nThRoot(int M, int N) {

        int l = 1, r = N;
        int mid = r;
        while (l < r){
            int result = pow(mid, M);
            if (N == result)
                return mid;
            else if (N < result)
                r = mid;
            else if (N > result)
                l = mid;

            mid = (l + r) / 2;
        }

        return -1;
    }

    /**
     * 求次幂
     * @param a 底数
     * @param n  幂数
     * @return 指数值
     */
    public static int pow(int a ,int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public static double pow(double a ,double n){
        double result = 1;
        for (double i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
