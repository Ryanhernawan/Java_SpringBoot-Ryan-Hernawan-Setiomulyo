//package com.alta.Sesi8;

import java.util.Arrays;

public class Task5_Sesi8 {
    public static void Dulplicate(String[] input){
        Arrays.sort(input);
        for (int i=0; i<input.length-1; i++){
            int count =1;
            for (int j=1; j<input.length; j++){
                if (input[i] == input[j]){
                    count++;
                }
                else{
                    break;
                }
                if (count > 1){
                    System.out.println(input[i] + "-> " + count);
                    i = i + (count-1);
                }
            }
        }

    }
    public static void main(String[] args) {
        String [] input = {"js","js","golang","ruby", "ruby", "js", "js" };
        Dulplicate(input);
    }
}
