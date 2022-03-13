package Task5_Tebak_Kandang;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class main {
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_YELLOW = "\u001B[33m";

    public static final String TEXT_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // First Step
        System.out.println("---------------------------------");
        System.out.println( TEXT_BLUE +"           Tebak Kandang         " + TEXT_RESET);
        System.out.println("---------------------------------");
        System.out.println("1. Jumlah Kandang");
        System.out.println("99. Exit");
        System.out.print("Masukan Pilihan Anda : ");
        int option = scanner.nextInt();
        if (option == 1){
            System.out.println("---------------------------------");
            System.out.print("Masukan Jumlah Kandang : ");
            int JumlahKandang = scanner.nextInt();
            for (int i=1; i<= JumlahKandang; i++){
                System.out.println("|||");
                System.out.println("|" + i + "|");
                System.out.println("|||");
            }
            System.out.println("");
            System.out.println("Pilih Kandang yang ingin dibuka");
            int ChooseAnother = scanner.nextInt();
            System.out.println("PILIHAN");
            System.out.println(TEXT_BLUE + "K" + TEXT_RESET + ":" + "Kambing");
            System.out.println(TEXT_RED + "Z" + TEXT_RESET + ":" + "Zebra");
            System.out.println(TEXT_YELLOW + "B" + TEXT_RESET + ":" + "Bebek");
            System.out.println("Masukan Tebakan: ");
            int PilihTebakan = scanner.nextInt();



        }
        else if (option == 99){
            return;
        }
    }

}
