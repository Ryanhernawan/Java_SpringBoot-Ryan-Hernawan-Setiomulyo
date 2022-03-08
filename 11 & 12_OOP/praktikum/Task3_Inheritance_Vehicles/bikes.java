package Task3_Inheritance_Vehicles;

public class bikes extends Vehicles {
    private String name;
    private String name2;
    private String Engine;
    private String Engine2;
    private int Wheel_Count;

    public void parent(){
        name = "Pedal Bike";
        name2 = "Motor Bike";
        Engine = "No Engine";
        Engine2 = "With Engine";
        Wheel_Count = 2;
        System.out.println("Hi I'm Bike "
                + "My Name is "
                + name
                + "My Engine Status is "
                + "'"
                + Engine
                + "'"
                + "I Have "
                + Wheel_Count
                + " Wheels(s)");
        System.out.println("Hi I'm Bike "
                + "My Name is "
                + name2
                + "My Engine Status is "
                + "'"
                + Engine2
                + "'"
                + "I Have "
                + Wheel_Count
                + " Wheels(s)");






    }
}
