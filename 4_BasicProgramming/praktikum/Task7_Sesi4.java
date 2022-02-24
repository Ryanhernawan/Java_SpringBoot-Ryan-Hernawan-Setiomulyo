import java.util.Scanner;

public class Task7_Sesi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jum =1;

        System.out.print("Masukan Angka : ");
        int tinggi = input.nextInt();


        for (int i=1; i<=tinggi; i++){
            for (int k=tinggi-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=jum; j++){
                System.out.print("*");
            }
            jum+=2;
            System.out.print("\n");
        }
    }
}
