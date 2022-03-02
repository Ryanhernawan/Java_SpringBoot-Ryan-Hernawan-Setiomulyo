//package com.alta.Sesi8;

import java.util.Arrays;

public class Task4_Sesi8 {
    public static int Maximum_buy( int money, int [] ProductPrice ){
        int count = 0;
        int sum = 0;

        Arrays.sort(ProductPrice);

        for (int i=0; i< ProductPrice.length; i++){
            if (sum + ProductPrice[i] <= money){
                sum = sum + ProductPrice[i];
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int money = 30000;
        int [] ProductPrice = {15000, 10000, 12000, 5000, 3000};
        int result = Maximum_buy(money, ProductPrice);

        System.out.println(result);

    }
}
