import java.util.Scanner;

public class Task1_Sesi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vocal =0;
        int konsonan = 0;
        int karakter = 0;
        char huruf;

        System.out.println("Masukan Kalimat : ");
        String kata = input.nextLine();
        for (int j=0; j<kata.length(); j++){
            if (kata.charAt(j) !=' '){
                karakter++;
            }
        }
        for(int i=0; i<kata.length(); i++){
            huruf = Character.toLowerCase(kata.charAt(i));
            if (huruf !=' '){
                if(huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o'){
                    vocal++;
                }
                else {
                    konsonan++;
                }
            }
        }


        System.out.println("Jumlah Vocal = " + vocal);
        System.out.println("Jumlah Kosonan = " + konsonan);
        System.out.println("Total Karakter = " + karakter);


    }
}
