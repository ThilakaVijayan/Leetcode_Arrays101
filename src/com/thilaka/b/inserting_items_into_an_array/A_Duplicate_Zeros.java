package com.thilaka.b.inserting_items_into_an_array;

import java.util.Arrays;

public class A_Duplicate_Zeros {
    public int[] duplicateZeros(int[] arr) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-2;j>=i;j--){
                    arr[j+1] = arr[j];
                }
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        A_Duplicate_Zeros a = new A_Duplicate_Zeros();
        //System.out.println(Arrays.toString(a.duplicateZeros(new int[]{1,0,2,3,0,4,5,0})));
        System.out.println(Arrays.toString(a.attempt_2(new int[]{1,0,2,3,0,4,5,0})));
    }

    /**
     * This solution is not right for this exercise. It clearly states not to create a new array.
     */
    public int[] attempt_2(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0,j=0;j<arr.length;i++,j++){
            if(arr[i] == 0){
                newArr[j]=arr[i];
                newArr[++j]=arr[i];
            }else{
                newArr[j] = arr[i];
            }
        }
        arr = newArr;
        return arr;
    }
}
