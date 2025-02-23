package Keywords;

public class thisImplictCalling {
    void thisImplictCalling()
    {
System.out.println("first this implicit calling");
    }
    void thisImplictCalling2()
    {
        thisImplictCalling();
        System.out.println("second this implicit calling");
    }
    public static void main(String[] args) {
        thisImplictCalling test= new thisImplictCalling();
        test.thisImplictCalling2();

    }
}
