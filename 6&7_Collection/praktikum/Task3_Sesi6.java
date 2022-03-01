//package com.alta.Sesi6;

public class Task3_Sesi6 {
    static int[] pair(int[] input, int target){
        for (int i=0; i< input.length; i++){
            for (int j=1; j<input.length; j++){
                if (input[i] + input[j] == target){
                    return new int [] {i, j};
                }
            }
        }

        return new int [] {};
    }

    public static void main(String[] args) {
        // add input & target
        int [] Input ={2,5,9,11,};
        int target = 11;
        // initiation pair function
        int [] result = pair(Input, target);
        //printOut
        System.out.println(result[0] + "," + result[1]);

        }

    }

