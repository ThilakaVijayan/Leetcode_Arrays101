package com.thilaka.d.searching.items.in.an.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A_Check_If_N_and_Its_Double_Exist {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i] == 2*arr[j]){
                    System.out.println(i+"="+j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        A_Check_If_N_and_Its_Double_Exist a = new A_Check_If_N_and_Its_Double_Exist();
        System.out.println(a.checkIfExist(new int[]{10,2,5,3}));
        System.out.println(a.sol2(new int[]{10,2,5,3}));
    }

    public boolean sol2(int[] arr){
        HashSet set = new HashSet();
        for (int i=0;i<arr.length;i++){
            if(set.contains(arr[i]*2) || arr[i] %2 ==0 && set.contains(arr[i]/2)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

}
