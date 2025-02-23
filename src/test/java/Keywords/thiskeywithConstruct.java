package Keywords;

public class thiskeywithConstruct {
    thiskeywithConstruct()
    {
        System.out.println("defaultConstructor");
    }

    thiskeywithConstruct(String accoutName)
    {
        System.out.println("parameterConstructer");
    }

    thiskeywithConstruct(String accoutName,int x)
    {
        this();
        System.out.println(accoutName+" "+ x);
    }
    public static void main(String[] args) {
        thiskeywithConstruct test= new thiskeywithConstruct("subba",10);

    }
}
