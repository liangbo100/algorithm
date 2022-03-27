package liangb.jetbrains.space.algorithm.chapter05;

import java.util.HashMap;
import java.util.Map;

public class A03递归_斐波那契 {



/*    private static Map<Integer,Integer> map = new HashMap<>();
    public static int fib(int n) {

        if (n == 0) {
            map.put(0,0);
            return 0;
        }
        if (n == 1) {
            map.put(1,1);
            return 1;
        }
        if (map.get(n) != null)
            return map.get(n);
        else {
                int result = fib(n - 1) + fib(n - 2);
                map.put(n, result);
                return result;

        }

    }*/

    public static int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-1) +fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(45));
    }

}
