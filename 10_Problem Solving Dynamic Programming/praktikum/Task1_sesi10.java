//package com.alta.Sesi10_DynamicProg;

import java.util.HashMap;
import java.util.Map;

// top down
public class Task1_sesi10 {
    public static Map<Integer, Integer> map = new HashMap<>();
    public static int Nfibo =0;


    public static int fibo(int input) {
        if (input < 2) {
            return input;
        }
        if (map.get(input) != null) {
            Nfibo = map.get(input);
        } else {
            Nfibo = fibo(input - 1) + fibo(input - 2);
            map.put(input, Nfibo);
        }
        return Nfibo;
    }

    public static void main(String[] args) {
       int input = 9;
       int result = fibo(input);
        System.out.println(result);

    }
}
