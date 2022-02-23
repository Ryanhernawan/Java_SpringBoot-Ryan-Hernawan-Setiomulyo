package com.alta.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vocal =0;
        int konsonan = 0;
        char huruf;

        System.out.println("Masukan Kalimat : ");
        String kata = input.nextLine();
        for(int i=0; i<kata.length(); i++){
            huruf = Character.toLowerCase(kata.charAt(i));
            if (huruf !=' '){
                if(huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                    vocal++;
                }
                else {
                    konsonan++;
                }
            }


        }
        System.out.println("Jumlah Vocal = " + vocal);
        System.out.println("Jumlah Kosonan = " + konsonan);
        System.out.println("Total Karakter = " + kata.length());

    }
}
