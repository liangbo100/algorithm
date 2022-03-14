package liangb.jetbrains.space.algorithm.chapter01;

import java.util.Arrays;

public class A03插入排序 {

    public static void insertSort(int arr[]){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,4,2,5,8,11};
        insertSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
