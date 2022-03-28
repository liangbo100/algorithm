package liangb.jetbrains.space.algorithm.chapter00;

import java.util.Arrays;

public class B05数组_移动零 {

/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。


示例 1:
输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]

示例 2:
输入: nums = [0]
输出: [0]
提示:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

 */
    public static void moveZeroes(int[] nums) {
        /*
         *  i ： 数组元素的下标
         *  j :  0元素的下标， 没遍历一个0 ， j将会 + 1
         */
        for (int i = 0 ,  j = 0; i < nums.length ; i++) {
            if (nums[i] != 0){

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j ++ ;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1,0,0,5,9,0,9};
        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}
