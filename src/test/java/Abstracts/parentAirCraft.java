package Abstracts;

public abstract class parentAirCraft {
    final int a=10;
    public void takeOff()
    {
        System.out.println("AirCraft is taking off");
    }
    public void fly()
    {

        System.out.println("AirCraft is flying");
    }
    public abstract void land();
}
