package com.thilaka.e.in.place.operations;

import java.util.Arrays;

public class A_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        int highestNum = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = highestNum;
            if (temp > highestNum) {
                highestNum = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        A_Replace_Elements_with_Greatest_Element_on_Right_Side a = new A_Replace_Elements_with_Greatest_Element_on_Right_Side();
        System.out.println(Arrays.toString(a.replaceElements(new int[]{17,18,5,4,6,1})));
    }

}
