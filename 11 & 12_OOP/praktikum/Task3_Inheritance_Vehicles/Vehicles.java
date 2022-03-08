package Task3_Inheritance_Vehicles;

public class Vehicles  {
    private String name;
    private String Engine;

    public void parent(){
        name = "Pedal Bike";
        Engine = "No Engine";
        System.out.println("Hi I'm Parent of All Vehicles "
                + "My Name is "
                + name
                + "My Engine Status is "
                + "'"
                + Engine
                + "'");
    }


}
