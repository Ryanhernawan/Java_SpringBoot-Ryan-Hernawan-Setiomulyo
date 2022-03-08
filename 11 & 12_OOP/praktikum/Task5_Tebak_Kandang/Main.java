package Task5_Tebak_Kandang;

import java.util.Scanner;

public class Main {
    public static final String TEXT_BLUE = "\u001B[34m";
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
        int choose = scanner.nextInt();
        if (choose == 1){
            System.out.println("---------------------------------");
            System.out.print("Masukan Jumlah Kandang : ");
            int Jumlah_Kandang = scanner.nextInt();
        }
        else {
            return;
        }

    }
}
