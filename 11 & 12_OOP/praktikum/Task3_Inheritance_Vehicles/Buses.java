package Task3_Inheritance_Vehicles;

public class Buses extends Vehicles {
    private String name = "Trans Jakarta";
    private String name2 = "School Bus";
    private String Engine = "With Engine";
    private int Wheel_Count = 4;
    private String Type_Bus = "Public Bus";
    private String Type_Bus2 = "Private Engine";

    public void parent(){
        System.out.println("Hi I'm "
                + "[" + Type_Bus
                + "] "
                + "My Name is "
                + name
                + "My Engine Status is "
                + "'"
                + Engine
                + "'"
                + "I Have "
                + Wheel_Count
                + " Wheels(s)");
        System.out.println("Hi I'm "
                + "[" + Type_Bus2
                + "] "
                + "My Name is "
                + name2
                + "My Engine Status is "
                + "'"
                + Engine
                + "'"
                + " I Have "
                + Wheel_Count
                + " Wheels(s)");
    }
}
