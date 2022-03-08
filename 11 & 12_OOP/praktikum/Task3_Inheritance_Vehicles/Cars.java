package Task3_Inheritance_Vehicles;

public class Cars extends Vehicles{
    private String name;
    private String Engine;
    private int Wheel;
    private String Engine_Type;
    private String name2;
    private String Engine_Type2;

    public void parent(){
        name = "Sport Cars";
        name2 = "Pickups Cars";
        Engine = "With Engine";
        Wheel = 4;
        Engine_Type = "V8";
        Engine_Type2 = "Solar";
        System.out.println("Hi I'm Car "
                + "My Name is "
                + name
                + "My Engine Status is "
                + "'"
                + Engine
                + "'"
                + "I Have "
                + Wheel
                + " Wheels(s)"
                + "My Engine Type = "
                + Engine_Type);
        System.out.println("Hi I'm Car "
                + "My Name is "
                + name2
                + "My Engine Status is "
                + "'"
                + Engine
                + "'"
                + "I Have "
                + Wheel
                + " Wheels(s)"
                + "My Engine Type = "
                + Engine_Type2);

    }



}
