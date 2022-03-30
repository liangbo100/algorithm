package liangb.jetbrains.space.algorithm.chapter00;

import java.util.Scanner;

public class B06数组_阶乘计算 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[1024000];
        int len = 1;  //数组有效数字的长度
        arr[0] = 1;
        for (int i = 2; i <= n; i++) {
            int result = 0;
            for (int j = 0; j < len; j++) {
                result += i*arr[j];
                if (result>=10){
                    arr[j] = result % 10;
                    result = result / 10;
                    if (j== (len -1))
                        len ++;
                }else {
                    arr[j] = result;
                    result = 0;
                }
            }
        }

        for (int i = len - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }

}
