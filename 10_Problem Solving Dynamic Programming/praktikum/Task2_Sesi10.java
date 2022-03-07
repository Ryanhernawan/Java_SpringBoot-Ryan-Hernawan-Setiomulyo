//package com.alta.Sesi10_DynamicProg;

import java.util.Arrays;

// bottom-up
public class Task2_Sesi10 {
    public static int fibo(int input){
//        int [] map = new int[2];
//        map[0] = 0;
//        map[1] = 1;
//        for (int i=2; i<=input; i++){
//            map[i] = map[i-1] + map[i-2];
//        }
//        return map[input];

        if (input == 0 || input == 1){
            return input;
        }
        int curr = 1;
        int prev = 0;
        int newFibo;

        for (int i=2; i<=input; i++){
            newFibo = prev + curr;
            prev = curr;
            curr = newFibo;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}
