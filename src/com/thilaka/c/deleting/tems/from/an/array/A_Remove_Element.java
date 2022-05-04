package com.thilaka.c.deleting.tems.from.an.array;

import java.util.Arrays;

public class A_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int currIndex=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != val){
                nums[currIndex++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return currIndex;
    }

    public static void main(String[] args) {
        A_Remove_Element a = new A_Remove_Element();
        System.out.println(a.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
