package liangb.jetbrains.space.algorithm.chapter00;

public class B02随机数 {


    /**
     * 随机数出现的概率
     * @param target 欲获取的随机数
     * @return 返回该随机数出现的概率
     */
    public static double probability(int target){
        int testTimes = 10000000;
        int K = 9;
        int counts[] = new int[9];
        for (int i = 0; i < testTimes; i++) {
            int ans = (int) (Math.random()* K);//[0,K-1]
            counts[ans] ++ ;
        }

        for (int i = 0; i < K; i++) {
            System.out.println(i + "这个数，出现了" + counts[i] + "次");
        }

        return (double) counts[target] / (double) testTimes ;
    }


    public static double xToXPower2(){
        return Math.max(Math.random(), Math.random());
    }

    public static void probability_power2(){
        int count = 0;

        double x = 0.17;
        int testTimes = 10000000;
        for (int i = 0; i < testTimes; i++) {
            if (xToXPower2() < x) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);
        System.out.println((double) 1 - Math.pow((double) 1 - x, 2));


    }


    public static void main(String[] args) {

        System.out.println(probability(4));


        System.out.println("============================");
        probability_power2();
    }
}
