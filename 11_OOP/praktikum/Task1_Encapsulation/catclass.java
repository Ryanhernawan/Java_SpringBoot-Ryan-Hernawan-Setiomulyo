package Task1_Encapsulation;

public class catclass {
    private String warna;
    private String jumlahkaki;


    public catclass(String warna, String jumlahkaki){
        this.warna = warna;
        this.jumlahkaki = jumlahkaki;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getJumlahkaki(){
        return jumlahkaki;
    }
    public void setJumlahkaki(String jumlahkaki){
        this.jumlahkaki = jumlahkaki;
    }

}
