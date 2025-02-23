package Keywords;

public class ConstructorChaining {


    ConstructorChaining()
    {
        this("Javatpoint");
        System.out.println("Default constructor called.");
    }
    //parameterized constructor
    ConstructorChaining(String str)
    {
        System.out.println("Parameterized constructor called");
    }
    //main method
    public static void main(String args[])
    {
//initializes the instance of example class
        ConstructorChaining cc = new ConstructorChaining();
    }
    }
