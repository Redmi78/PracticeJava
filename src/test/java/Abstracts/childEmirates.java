package Abstracts;

public class childEmirates extends parentAirCraft {
    public static void main(String[] args) {
        childEmirates c = new childEmirates();
        c.takeOff();
        c.fly();
        c.land();

    }

    public void land() {
        System.out.println("Emirates is landing at Dubai");
    }
}
