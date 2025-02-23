package staticThings;

public class Test {

    //static variable -> activates during run time..
    static int counter=0;
    //non static variable
    int instanceNumber=0;
   //default constructer
    Test(){
        counter++;
        instanceNumber++;
    }
    //static method
    static void displayCounter()
    {
        System.out.println(counter);
    }
    //non static method
     void instaceNumber()
    {
        System.out.println(instanceNumber);
    }
    public static void main(String args[]){
        Test t = new Test();
        //accessing static members
displayCounter();
        t.instaceNumber();
//access non static members created a object implicit callling contsructor

//t.instaceNumber();
        Test t1 = new Test();
        displayCounter();
        t1.instaceNumber();
}
}
