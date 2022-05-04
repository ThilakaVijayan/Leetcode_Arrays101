package com.thilaka.d.searching.items.in.an.array;

public class B_Valid_Mountain_Array {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        boolean peakreached = false;
        boolean increasing = false;
        for(int i=1;i<arr.length;i++){
            if(!peakreached){
                if(arr[i-1]<arr[i]){
                    increasing = true;
                    continue;
                }else if(arr[i-1]== arr[i]){
                    return false;
                }else{
                    peakreached=true;
                }
            }else{
                if(arr[i-1]>arr[i]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return increasing && peakreached;
    }

    public static void main(String[] args) {
        B_Valid_Mountain_Array b = new B_Valid_Mountain_Array();
        System.out.println(b.validMountainArray(new int[]{0,3,2,1}));
    }
}
