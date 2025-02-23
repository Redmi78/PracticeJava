package Keywords;

class Car
{
    int speed =100;
    Car()
    {
        System.out.println("parent class constructor");
    }
    void accerlate()
    {
        System.out.println("Accelerate method in the parent class");
    }
}

class BMW extends Car{

    int speed = 150;
    BMW()
    {
       super();
        System.out.println("BMW default constructor called");
    }
    void displaySpeed()
    {
       // System.out.println(speed);//child class variable
        System.out.println(super.speed); //parent class variable
        //Access immediate parent class variable
    }

    void accerlate()
    {
      // System.out.println("Accelerate method in the child class");
        super.accerlate();
        //immediate parent class method
    }
}
public class SuperKeyWord {
    public static void main(String[] args) {
        BMW bmw = new BMW();
       // bmw.displaySpeed();

       // bmw.accerlate();
    }

    }
