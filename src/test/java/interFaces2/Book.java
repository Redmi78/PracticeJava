package interFaces2;
interface testing {
    int pages = 24;//final static variables
    String name = "subba"; //final static

    void method1();//abstract method

    default void method2() {
        System.out.println("test");
    }

    static void method3() {
        System.out.println("testing");
    }
}
public class Book implements testing{

    public void method1() {
        System.out.println("abstract method implementation");
    }
        public static void main(String args[]) {
            Book b = new Book();
            b.method1();
            b.method2();
//b.method3() ; we can't access
            testing.method3();
           
        }



}

