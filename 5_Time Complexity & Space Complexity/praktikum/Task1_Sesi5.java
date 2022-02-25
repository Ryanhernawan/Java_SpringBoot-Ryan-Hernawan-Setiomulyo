import java.util.Scanner;

public class Task1_Sesi5 {
    public  static boolean PrimeNumber(int bilangan){
       for (int i= 2; i<=bilangan/2; i++){
           if (bilangan % i == 0){
               break;
           }
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.println("Masukan Bilangan : ");
        bilangan  = input.nextInt();
        if (PrimeNumber(bilangan)){
            System.out.println("Bilangan Prima");
        }
        else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
