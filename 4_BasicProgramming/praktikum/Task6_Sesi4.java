import java.util.Scanner;

public class Task6_Sesi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;

        System.out.print("X : ");
        int BilanganX = input.nextInt();
        System.out.print("N : ");
        int BilanganN = input.nextInt();

        total = (int) Math.pow(BilanganX,BilanganN);
        System.out.print("Hasil : " + total);
    }
}
