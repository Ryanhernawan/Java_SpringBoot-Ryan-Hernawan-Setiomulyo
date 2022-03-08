package Task4_Inheritance_Animals;

public class Task4 {
    public static void main(String[] args) {
        //Parent
        Animal parent = new Animal();
        parent.animal();
        //Herbivor
        Animal herbivor = new Herbivor();
        herbivor.animal();
        //Carnivor
        Animal carnivor = new Carnivor();
        carnivor.animal();
        //Omnivor
        Animal omnivor = new Omnivor();
        omnivor.animal();
    }
}
