import java.util.Scanner;

public class Task5_Sesi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat;

        System.out.print("Masukan Kalimat : ");
        kalimat = input.next();

        String org_kalimat = kalimat;
        String reverse="";

        int leng= kalimat.length();
        for (int i=leng-1; i>=0; i--){
            reverse = reverse+kalimat.charAt(i);
        }
        if(org_kalimat.equals(reverse)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Bukan Palindrom");
        }
    }
}
