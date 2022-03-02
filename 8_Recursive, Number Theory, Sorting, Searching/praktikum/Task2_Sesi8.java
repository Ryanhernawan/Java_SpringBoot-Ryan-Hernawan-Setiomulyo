//package com.alta.Sesi8;

public class Task2_Sesi8 {
    public static int fibonacci(int NummberFibo){
        if (NummberFibo == 0 || NummberFibo == 1){
            return NummberFibo;
        }
        else {
            return fibonacci(NummberFibo -1 ) + fibonacci(NummberFibo -2);
        }
    }

    public static void main(String[] args) {
        int NummberFibo = 8;
        int result = fibonacci(NummberFibo);
        System.out.println(result);
    }
}
