package liangb.jetbrains.space.algorithm.chapter01;

import java.util.Arrays;

public class A01冒泡排序 {

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,4,2,5,8,11};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
