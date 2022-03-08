package Task4_Inheritance_Animals;

public class Herbivor extends Animal{
    public String Nama = "Kambing";
    public String Jenis_Makanan = "Tumbuhan";
    public String Gigi = "Tumpul";

    public void animal(){
        System.out.println("Hi I'm Herbivor, "
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
