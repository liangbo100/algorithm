package liangb.jetbrains.space.algorithm.chapter00;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B03数组_两数之和 {



    /*
    时间复杂度为O(n*n )
     */
    public static int[] twoSum(int[] nums, int target) {

        int []result = new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if ( target == (nums[i] + nums[j])) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }

        return null;
    }


    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer ,Integer> map = new HashMap<>();

        int []result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i] ;
            Integer value = map.get(search);
            if (value == null)
                map.put(nums[i],i);
            else {
                if (value<i){
                    result[0] = value;
                    result[1] = i;
                }else {
                    result[0] = i;
                    result[1] = value;
                }
                return result;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int []arr ={3,2,4};
        System.out.println(Arrays.toString(twoSum2(arr,6)) );

    }
}
