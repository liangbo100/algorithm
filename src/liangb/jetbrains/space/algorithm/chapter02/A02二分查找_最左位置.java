package liangb.jetbrains.space.algorithm.chapter02;

import java.util.Arrays;

import static liangb.jetbrains.space.algorithm.chapter01.A04对数器.generateRandomArray;

public class A02二分查找_最左位置 {

    public static void main(String[] args) {
        int testTimes = 10000;//测试次数
        int maxSize = 10;//最大测试容量
        int maxNum = 10;//最大测试数据
        boolean flag = true;
        for (int i = 0; i < testTimes; i++) {
            int[] randomArray = generateRandomArray(maxSize, maxNum);
            Arrays.sort(randomArray);
            if ( !isEquals(randomArray, 1)){
                flag = false;
            }
        }
        System.out.println(flag ? "欧克，没问题":"纳尼， 错了！");
    }


    /**
     * 二分查找目标数最左的位置
     *
     * eg: {1,1,1,2,2,2,3,5,5} 。 查找2的最左位置
     * @param arr 已排序的数组
     * @param t  要查找的数
     * @return  返回最左的下标
     */
    public static int binaryMostLeftSearch(int []arr, int t){
        int index = -1;
        if (arr.length == 0 || arr == null)
            return index;
        int l = 0, r = arr.length-1, c;
        while (l <= r){
            c = (l + r) / 2;
            if (t > arr[c])
                l = c + 1;
            else if (t < arr[c])
                r = c - 1;
            else if (t == arr[c]){
                index = c;
                r = c - 1;
            }
        }
        return index;
    }


    /**
     * 对数器
     */
    public static int searchIndex(int []arr, int t){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t)
                return i;
        }
        return -1;
    }

    public static boolean isEquals(int []arr1, int t){
        System.out.println(Arrays.toString(arr1));
        int i1 = binaryMostLeftSearch(arr1, t);
        System.out.println("搜索的"+t+"的下标是"+i1);
        int i2 = searchIndex(arr1, t);
        System.out.println("对数器搜索的"+t+"的下标是"+i2);
        return i1 == i2;
    }

}
