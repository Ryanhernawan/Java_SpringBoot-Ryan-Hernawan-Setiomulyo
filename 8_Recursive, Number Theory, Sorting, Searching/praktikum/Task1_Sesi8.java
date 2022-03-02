//package com.alta.Sesi8;

public class Task1_Sesi8 {
    public static boolean PrimeNumber(int primenumber){
        if (primenumber < 2){
            return false;
        }
        for (int i=2; i<primenumber; i++){
            if (primenumber % i == 0){
                return false;
            }
        }
        return true;
    }


    public static int PrimeX(int prime){
        int i = 1;
        int count = 1;

        if (prime == 1){
            return 2;
        }
        while (count != prime){
            i = i + 2;
            if (PrimeNumber(i)){
                count++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int PrimeX = 5;
        int result = PrimeX(PrimeX);
        System.out.println(result);
    }
}
