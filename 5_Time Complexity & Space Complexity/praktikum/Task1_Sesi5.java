//package com.alta.Sesi_5;

import java.util.Scanner;

public class Task1_Sesi5 {
    public static  boolean PrimeNumber(int count){
//        boolean result = true;
        if (count < 2){
            return false;
        }
        for (int i=2; i<count; i++){
            if (count % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Masukan Bilangan : ");
        number = input.nextInt();
        if (PrimeNumber(number)){
            System.out.println("Bilangan Prima");
        }
        else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
