package com.thilaka.c.deleting.tems.from.an.array;

import java.util.Arrays;

public class B_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int currPosition = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
                nums[currPosition++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return currPosition;
    }

    public static void main(String[] args) {
        B_Remove_Duplicates_from_Sorted_Array b = new B_Remove_Duplicates_from_Sorted_Array();
        System.out.println(b.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
