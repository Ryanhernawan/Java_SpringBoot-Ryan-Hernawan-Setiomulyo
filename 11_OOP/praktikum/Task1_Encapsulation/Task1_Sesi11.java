package Task1_Encapsulation;//package com.alta.Sesi11_OOP.Task1_Encapsulation;

public class Task1_Sesi11 {
    public static void main(String[] args) {
        // CREATING CAT CLASS
        catclass cat = new catclass("Hitam", "4");
        System.out.println("Saya Kucing dengan detail, " + "Warna Bulu : "
                + cat.getWarna()
                + " "
                + "dengan jumlah kaki : "
                + cat.getJumlahkaki());

        //CREATING FISH CLASS
        fishclass fish = new fishclass();
        fish.setJenis("Paus");
        fish.setMakanan("Plankton");
        System.out.println("Saya Ikan dengan detail, " + "Jenis: "
                + fish.getJenis()
                + " "
                + "Makananan :"
                + fish.getMakanan());

        //CREATING FLOWER CLASS
        Flowerclass flower = new Flowerclass();
        flower.setJenis("Bangkai");
        flower.setColor("Merah");
        flower.setNumOfPetal("12");
        System.out.println("Saya Bunga dengan Detail, " + "Jenis : "
                + flower.getJenis()
                + ", "
                + "Color : "
                + flower.getColor()
                + ", "
                + "Num Of Petal : "
                + flower.getNumOfPetal());

        //CREATING CAR CLASS
        Carclass car = new Carclass();
        car.setType("Sedan");
        car.setColor("Merah");
        car.setNumOfTire("4");
        System.out.println("Saya Mobil dengan detail, " + "Type : "
                + car.getType()
                + ", "
                + "Color : "
                + car.getColor()
                + ", "
                + "Num Of Tire : "
                + car.getNumOfTire());
    }
}
