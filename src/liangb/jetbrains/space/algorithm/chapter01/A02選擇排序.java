package liangb.jetbrains.space.algorithm.chapter01;

import java.util.Arrays;

public class A02選擇排序 {


    public static void choiceSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,4,2,5,8,11};
        choiceSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
