package interFaces2;

public interface interBooks {
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



