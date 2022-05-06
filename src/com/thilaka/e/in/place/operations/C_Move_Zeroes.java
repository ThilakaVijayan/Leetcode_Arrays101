package com.thilaka.e.in.place.operations;

import java.util.Arrays;

public class C_Move_Zeroes {
    public int[] moveZeroes(int[] nums) {

        int length = nums.length;
        int rightPointer = nums[length -1]==0? length -2: length -1;
        for(int i = length -2; i>=0; i--){
            if(nums[i]==0){
                for(int j=i;j<rightPointer;j++){
                    nums[j]=nums[j+1];
                }
                nums[rightPointer]=0;
                rightPointer--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        C_Move_Zeroes c = new C_Move_Zeroes();
        System.out.println(Arrays.toString(c.moveZeroes(new int[]{0,1,0,3,12})));

    }

    public int[] winning_sol(int[] nums){
        int j = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }

        for(int i=j;i<nums.length;i++){
            nums[i] = 0;
        }
        return nums;
    }
}
