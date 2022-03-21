package liangb.jetbrains.space.algorithm.chapter02;

import java.util.Scanner;

public class A04二分查找_分巧克力 {



    /*

     */

    public static void main(String[] args) {

        test2();
    }

    //二分法
    public static void test2(){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        int[] h = new int[N];
        int[] w = new int[N];

        int maxLen = 0;
        int sumArea = 0;
        int result = 1;
        for (int i = 0; i < N; i++) { //输入每块巧克力的宽和高
            h[i] = input.nextInt();
            w[i] = input.nextInt();

            maxLen = Math.max(maxLen, Math.max(h[i], w[i]));
            sumArea += h[i] * w[i];
        }

        int l = 1, r = maxLen;
        while (l <= r){
            int mid = (l+r)/2;
            int chocolates = 0;
            for (int i = 0; i < N; i++) {
                chocolates += (h[i]/mid)*(w[i]/mid);
                //如果切的巧克力的个数大于等于同学人数
                if (chocolates>=K) {
                    result = mid;
                    l = mid + 1;
                    break;
                }
            }

            if (chocolates < K)
                r = mid - 1;
        }
        System.out.println(result);

    }


    //暴力求解
    public static void test1() {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // 共有多少块巧克力
        int K = input.nextInt(); //  多少位小朋友

        int[] h = new int[N];
        int[] w = new int[N];

        int maxLen = 0;//切巧克力最大可能边长
        int sumArea = 0;//所有巧克力的总面积
        int result = 1;// 最终巧克力边长
        for (int i = 0; i < N; i++) { //输入每块巧克力的宽和高
            h[i] = input.nextInt();
            w[i] = input.nextInt();

            maxLen = Math.max(maxLen, Math.max(h[i], w[i]));
            sumArea += h[i] * w[i];
        }

        for (int len = 1; len <= maxLen; len++) {
            int chocolates = 0 ;//记录当前边长的巧克力可以切多少个

            if (len*len*K <= sumArea){
                for (int i = 0; i < N; i++) {
                    chocolates += getCount(h[i],w[i],len);

                    //如果切的巧克力个数大于等于同学人数
                    if (chocolates >= K){
                        result = len;
                        break;
                    }
                }

                if (chocolates < K)
                    break;
            }else
                break;

        }

        System.out.println(result);

    }

    public static int getCount(int h, int w, int len){
        int maxB = Math.max(h, w);//最长边
        int minB = Math.min(h,w);//最短边

        if (len <= minB)
            return (maxB/len)*(minB/len);
        else
            return 0;
    }
}
