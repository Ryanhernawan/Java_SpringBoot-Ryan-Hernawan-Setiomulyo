import java.util.Scanner;

public class Task8_Sesi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String table = "";
        System.out.print("Masukan angka : ");
        int Angka = input.nextInt();

        for(int i=1; i<=Angka; i++){
            for (int j=1; j<=Angka; j++){
                if (i * j < 10){
                    table += " " + i * j;
                }
                else {
                    table += " " + i * j;
                }
            }
            table += "\n";
        }
        System.out.println(table);

    }
}
