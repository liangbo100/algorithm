package liangb.jetbrains.space.algorithm.chapter00;

public class A01位运算_打印二进制 {

    public static void main(String[] args) {
        show2(8);
    }


    public static void show2(int a){
        for (int i = 31; i >= 0 ; i--) {
            System.out.print(((1<<i) & a )== 0 ? "0" : "1" ); ;
        }
    }
}
