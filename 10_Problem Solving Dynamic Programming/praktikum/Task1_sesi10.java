//package com.alta.Sesi10_DynamicProg;

// top down
public class Task1_sesi10 {
    public static int fibo(int input){
        if (input <= 1){
            return input;
        }
        else {
            return fibo(input -1) + fibo(input -2);
        }
    }

    public static void main(String[] args) {
        int input = 9;
        int result = fibo(input);
        System.out.println(result);
    }
}
