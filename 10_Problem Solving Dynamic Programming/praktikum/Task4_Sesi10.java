//package com.alta.Sesi10_DynamicProg;
//  Roman Numerals

public class Task4_Sesi10 {
//    public static int ConvertRomawi(int input){
//
//    }

    public static void main(String[] args) {
        int input = 4;
        String [] romawi = {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I" };
        int [] angka = {1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1};
        String strromawi = "";

        if (input > 0 && input < 4000){
            for (int i=0; i<13; i++){
                while (input >= angka[i]){
                    input = input - angka[i];
                    strromawi = strromawi + romawi[i];
                }
            }
            System.out.println(strromawi);
        }
        else {
            System.out.println("error");
        }
    }
}
