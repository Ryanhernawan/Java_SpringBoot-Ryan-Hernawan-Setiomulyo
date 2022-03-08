package Task3_Inheritance_Vehicles;

public class Task3 {
    public static void main(String[] args) {
        //Vehicle
        Vehicles parent = new Vehicles();
        parent.parent();
        //bike
        Vehicles bike = new bikes();
        bike.parent();
        //car
        Vehicles car = new Cars();
        car.parent();
        //Privete Bus
        Vehicles bus = new Buses();
        bus.parent();
    }
}
