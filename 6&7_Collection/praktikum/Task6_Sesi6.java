//package com.alta.Sesi6;

public class Task6_Sesi6 {
    public static int FindMax(int [] array, int k){
        int max = 0;
        for (int i=0; i< array.length-1; i++){
            int sum = 0;
            for (int j=i; j<i+k; j++){
                sum = sum + array[j];
            }
           if (sum > max){
               max = sum;
           }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] array = {2,3,4,1,5};
        int k = 2;
        int result = FindMax(array, k);
        System.out.println(result);
    }
}
