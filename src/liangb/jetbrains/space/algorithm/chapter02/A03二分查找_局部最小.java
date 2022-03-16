package liangb.jetbrains.space.algorithm.chapter02;

public class A03二分查找_局部最小 {

    public static void main(String[] args) {
        int[] arr = {7,1,3,4,2,6,9,8};
        System.out.println(arr[localMinimum(arr)] );
    }

    /**
     * 找出一个数组中的一个局部最小值。且已知相邻两个数组的值不一样
     * @param arr 数组（可以无序）
     * @return  数组局部最小值的下标
     */
    public static int localMinimum(int[] arr) {
        int len = arr.length;
        if (len == 0){
            return -1;
        }
        if (len == 1)
            return 0;

        //先判断两个端点
        if (arr[0] < arr[1]) {
            return 0;
        }
        if (arr[len - 1] < arr[len-2]){
            return len - 1;
        }

        int low = 0 , high = len - 1;
        while (low < high){
            int mid = (low + high)/2;
            if (arr[mid] < arr[mid-1]  && arr[mid] < arr[mid+1])
                return mid;
            else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1])
                high = mid ;
            else if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1])
                low = mid;
        }
        return -1;
    }
}
