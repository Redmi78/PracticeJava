package classvsobjects;

public class Person {
    int age;
    String name;

    Person(int age,String name)
    {
        this.age =age;
        this.name=name;
    }
    void displayDetails()
    {
        System.out.println("age" +age);
        System.out.println("name" +name);
    }
}
