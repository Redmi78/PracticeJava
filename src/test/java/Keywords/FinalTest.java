package Keywords;

class Test{
 final int a =1000;
 final void display()
 {
     System.out.println("Parent display method");
 }
}
class Child extends Test{
   /* void display()
    {
        System.out.println("child display method");
    }*/
}
public class FinalTest {
    public static void main(String args[]){
      //  Test test = new Test();
       // System.out.println(test.a);

      //  System.out.println(test.a=2000); complie time error
Child child = new Child();
child.display();


    }
}
