package Task4_Inheritance_Animals;

public class Omnivor extends Animal{
    public String Nama = "Ayam";
    public String Jenis_Makanan = "Semua";
    public String Gigi = "Tajam dan Tumpul";

    public void animal(){
        System.out.println("Hi I'm Omnivor, "
                + "My Name is "
                + Nama
                + ", My Food Is "
                + "'"
                + Jenis_Makanan
                + "'"
                + ", I Have "
                + Gigi
                + " teeth");
    }
}
