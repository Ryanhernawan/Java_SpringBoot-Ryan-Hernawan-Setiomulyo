package Task4_Inheritance_Animals;

public class Carnivor extends Animal{
    public String Nama = "Singa";
    public String Jenis_Makanan = "Daging";
    public String Gigi = "Tajam";

    public void animal(){
        System.out.println("Hi I'm Carnivor, "
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
