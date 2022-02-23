package com.alta.praktikum;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int b;
        int count = 0;


        System.out.print("Masukan Bilangan : ");
        int bilangan = input.nextInt();

        for (int i=1; i<=bilangan; i++){

            if (bilangan % i == 0){
                count = count + 1;
            }
        }
        if (count == 2){
            System.out.println("Bilangan Prima");
        }
        else{
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
