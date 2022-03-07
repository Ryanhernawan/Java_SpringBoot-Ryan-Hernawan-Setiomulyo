//package com.alta.Sesi9_BruteForce;

public class Task1_Sesi9 {
    public static String SimpleEq(int a, int b, int c){
        for (int x=1; x<=a; x++){
            for (int y= x+1; y<=a; y++){
                var z = a - (x + y);
                if (x * y * z == b && ((x*x) + (y*y) + (z*z) == c)){
                    var temp = x + " " + y + " " + z;
                    return temp;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(SimpleEq(6, 6, 14));
    }
}
