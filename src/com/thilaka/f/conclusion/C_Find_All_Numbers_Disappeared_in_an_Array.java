package com.thilaka.f.conclusion;

import java.util.ArrayList;
import java.util.List;

public class C_Find_All_Numbers_Disappeared_in_an_Array {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        int n = nums.length;
        int[] ref = new int[n];
        for(int i=0;i<n;i++){
            ref[i] = i+1;
        }

        for(int i=0;i<n;i++){
            ref[nums[i]-1]=0;
        }
        for(int i=0;i<n;i++){
            if(ref[i]!=0){
                output.add(ref[i]);
            }
        }
        return output;

    }

    public static void main(String[] args) {
        C_Find_All_Numbers_Disappeared_in_an_Array c = new C_Find_All_Numbers_Disappeared_in_an_Array();
        System.out.println(c.winning_Sol(new int[]{4,3,2,7,8,2,3,1}));
    }

    public List<Integer> winning_Sol(int[] nums){
        for(int i=0;i<nums.length;i++){
            int j = Math.abs(nums[i]) -1;
            nums[j] = Math.abs(nums[j]) * -1;
        }
        List<Integer> output = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                output.add(i+1);
            }
        }
        return output;
    }
}
