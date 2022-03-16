package liangb.jetbrains.space.algorithm.chapter02;


import java.util.Arrays;

import static liangb.jetbrains.space.algorithm.chapter01.A04对数器.*;

public class A01二分查找 {

    public static void main(String[] args) {

        int testTimes = 1000;
        int maxSize = 10;//最大测试容量
        int maxNum = 50;//最大测试数据
        for (int i = 0; i < testTimes; i++) {
            int[] randomArray = generateRandomArray(maxSize, maxNum);
            Arrays.sort(randomArray);
            printArray(randomArray);

            System.out.println("查找5数字所在的位置 = " +  binarySearch(randomArray, 5));

        }
    }


    /**
     * 二分查找
     * @param arr  有序数组
     * @param target 要查找的数据
     */
    public static int binarySearch(int[] arr, int target) {
        if (arr.length>0) {
            int left = 0, right = arr.length - 1, m;

            while (left <= right) {
                m = (left + right) / 2;
                if (arr[m] == target)
                    return m;
                else if (arr[m] > target)
                    right = m - 1;
                else
                    left = m + 1;
            }
        }
        return -1;
    }
}
