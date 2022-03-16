package liangb.jetbrains.space.algorithm.chapter01;

import java.util.Arrays;

public class A04对数器 {

    public static void main(String[] args) {
        int testTimes = 10000;//测试次数
        int maxSize = 20;//最大测试容量
        int maxNum = 20;//最大测试数据
        boolean flag = true;
        for (int i = 0; i < testTimes; i++) {
            int[] randomArray = generateRandomArray(maxSize, maxNum);
            int[] copyArray = copyArray(randomArray);
            A03插入排序.insertSort(randomArray);
            correctSort(copyArray);

            if(!isEquals(randomArray, copyArray)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Success:恭喜你！没毛病！" : "Error：抱歉，有错误" );//没错就恭喜，有错就报错
        int[] newArr = generateRandomArray(maxSize, maxNum);
        printArray(newArr);//没排序的数组打印出来
        A03插入排序.insertSort(newArr);//排序后
        printArray(newArr);//再次打印，程序员自己看看有没有毛病
    }


    public static void printArray(int []arr){
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    /**
     * 正确的排序方法
     * @param arr 数组
     */
    public static void correctSort(int[] arr){
        Arrays.sort(arr);
    }

    /**
     * 复制一个数组
     * @param arr  要复制的数组
     * @return  返回新的数组
     */
    public static int[] copyArray(int[] arr){
        if (arr == null) {
            return null;
        }
        int[] newArray = new int[arr.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        return newArray;
    }

    /**
     * 生成一个随机大小，最大数随机数组
     * @param maxSize 最大测试数组容量
     * @param maxNum 最大测试数组元素的数据
     * @return 生成的随机数组
     */
    public static int[] generateRandomArray(int maxSize, int maxNum){
        int []arr = new int[ (int)((maxSize+1) * Math.random()) ];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(maxNum+1)) - (int)(Math.random()*maxNum);
        }
        return arr;
    }

    /**
     * 比较两个数组是否相等
     * @param arr1 数组1
     * @param arr2 数组2
     * @return 布尔结果
     */
    public static boolean isEquals(int []arr1, int []arr2){
        if (arr1.length!=arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
