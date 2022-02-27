//package com.alta.Sesi_5;

import java.util.Scanner;

public class Task2_Sesi5 {
    public static int count(int numberX, int numberN){
        int result = 1;
        for (int i=1; i<=numberN; i++){
            result = result * numberX;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberX;
        int numberN;

        System.out.print("X : ");
        numberX = input.nextInt();
        System.out.print("N : ");
        numberN = input.nextInt();

        System.out.println(count(numberX,numberN));
    }
}
