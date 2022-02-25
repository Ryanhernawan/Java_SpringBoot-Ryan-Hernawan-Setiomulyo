import java.util.Scanner;

public class Task4_Sesi5 {
    public  static int find(int[] arr, int size){
        int result = arr[0];
        for (int i=1; i<size; i++){
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int[]arr = new int[angka];

        int count = find();
        System.out.println(count);

    }
}