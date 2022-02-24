import java.util.Scanner;

public class Task4_Sesi3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Bilangan;
        int mod = 0;

        System.out.print("Masukan Bilangan : ");
        Bilangan = input.nextInt();
        for (int i=1; i<=Bilangan; i++){
            if (Bilangan % i == 0){
                mod = mod + 1;
            }
        }
        if (mod == 2){
            System.out.println("Bilangan Prima");
        }
        else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
