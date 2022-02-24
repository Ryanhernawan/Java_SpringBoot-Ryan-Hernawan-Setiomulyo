import java.util.Scanner;

public class Task3_Sesi3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Bilangan;
        System.out.print("Input Bilangan : ");
        Bilangan = input.nextInt();

        for (int i=1; i<=Bilangan; i++){
            if (Bilangan % i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
