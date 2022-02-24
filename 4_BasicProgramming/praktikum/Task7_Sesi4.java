import java.util.Scanner;

public class Task7_Sesi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Masukan Angka : ");
        int Angka = input.nextInt();

        for (int i=1; i<= Angka; i++){
            for (int j=1; j<= Angka-i; j++){
                System.out.println(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
