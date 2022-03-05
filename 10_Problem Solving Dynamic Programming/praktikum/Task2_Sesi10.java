//package com.alta.Sesi10_DynamicProg;

import java.util.Arrays;

// bottom-up
public class Task2_Sesi10 {
    public static int fibo(int input){
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
        int input = 8;
        System.out.println(fibo(input));
    }
}
