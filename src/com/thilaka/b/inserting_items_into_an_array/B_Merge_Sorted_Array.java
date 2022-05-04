package com.thilaka.b.inserting_items_into_an_array;

import java.util.Arrays;

public class B_Merge_Sorted_Array {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        m--;n--;
        int index = nums1.length-1;
        while(index>=0){
            if(m<0){
                nums1[index]=nums2[n--];
            }else if(n<0){
                nums1[index]=nums1[m--];
            }else{
                if(nums1[m] > nums2[n]){
                    nums1[index]= nums1[m--];
                }else{
                    nums1[index]=nums2[n--];
                }
            }
            index--;
        }

        return nums1;
    }

    public static void main(String[] args) {
        B_Merge_Sorted_Array b = new B_Merge_Sorted_Array();
        System.out.println(Arrays.toString(b.merge(new int[]{5,6,0,0}, 2, new int[]{2,3},2)));
    }

}
