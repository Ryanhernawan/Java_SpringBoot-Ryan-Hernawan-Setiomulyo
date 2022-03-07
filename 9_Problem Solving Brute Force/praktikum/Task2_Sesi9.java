//package com.alta.Sesi9_BruteForce;

import java.util.List;
import java.util.Map;

public class Task2_Sesi9 {
    public static List<Integer> MoneyChange(int money){
        var coins = List.of(10000, 5000, 2000,1000, 500, 200, 100, 50, 20, 10, 1 );
        List<Integer> result = List.of();
        for (var coin : coins){
            while (money >= coin){
                result.add(money);
                money -= coin;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(MoneyChange(534));

    }
}
