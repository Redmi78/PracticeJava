package MethodOverriding;
//Hireracal Inheritance

class Bank { //parent
    double interestRate() {
        return 5.5;
    }
}

class JPM extends Bank { //child 1
    double interestRate()//overriding
    {
        return 8.5;
    }
}

class HDFC extends Bank {//child 2

    double interestRate()//overriding
    {
        return 7.5;
    }
}

public class TestOverRide {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.interestRate());

        JPM jpm = new JPM();
        System.out.println(jpm.interestRate());

        HDFC hdfc = new HDFC();
        System.out.println(hdfc.interestRate());
    }
}
