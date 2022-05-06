package com.thilaka.e.in.place.operations;

import java.util.Arrays;

public class D_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {
        int rightPointer = nums.length-1;
        for(int i=0;i<=rightPointer;i++){
            if(nums[i]%2!=0){
                int temp = nums[rightPointer];
                nums[rightPointer] = nums[i];
                nums[i] = temp;
                i--;
                rightPointer--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        D_Sort_Array_By_Parity d = new D_Sort_Array_By_Parity();
        System.out.println(Arrays.toString(d.sortArrayByParity(new int[]{3,1,2,4})));

    }
}
