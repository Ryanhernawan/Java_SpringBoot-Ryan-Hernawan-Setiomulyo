import java.util.Scanner;

public class Task2_Sesi5 {
    public static int pow(int BilanganX, int BilanganN){
        int count = 1;
        for (int i=0; i<BilanganN; i++){
            count *= BilanganX;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;

        System.out.print("X : ");
        int BilanganX = input.nextInt();

        System.out.print("N : ");
        int BilanganN = input.nextInt();

        total =pow(BilanganX,BilanganN);
        System.out.print("Hasil : " + total);

    }
}
