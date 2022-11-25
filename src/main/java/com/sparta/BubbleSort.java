package com.sparta;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        int i, j, temp = 0;
        for (i = 0; i < arr.length-1; i++) {
            for (j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
