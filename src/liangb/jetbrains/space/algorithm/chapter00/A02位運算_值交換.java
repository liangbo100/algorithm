package liangb.jetbrains.space.algorithm.chapter00;

public class A02位運算_值交換 {



    public static void main(String[] args) {
        /*
         * 兩個變量三次異或實現值交換
         */
        int a = 3, b =4;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ",b = " + b);
    }

}
