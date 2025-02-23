package InheritanceJava;

class A{
    int a=10;
    void display()
    {
        System.out.println("class A doesn't have access to class B");
        System.out.println(a);
    }
}
class B extends A{
    int b=20;
    void print()
    {
        System.out.println("class B have access to class A");
        System.out.println(b);
    }
}
public class InheritanceDemo {
    public static void main(String args[]){
        A test = new A();
        System.out.println(test.a);
        B test1= new B();
        test1.display();
        test1.print();
    }
}
