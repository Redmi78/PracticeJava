package JavaInterViewPrograms;

public class LeapYear {
    public static void main(String args[]){
        int leapyear=1900;
        if(leapyear%4==0 && leapyear%100!=0 ||leapyear%400==0)
        {
            System.out.println("its a leap year");
        }
        else {
            System.out.println("Its not a leap year");
        }

    }
}
