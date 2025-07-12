package Encapsulation;

public class BankAccount2 {
    public static void main(String[] args) {
BankAccount bankAccount = new BankAccount();
bankAccount.setAccountName("reddy");
bankAccount.setAccountNumber(55899);
bankAccount.setBalance(5588889);

System.out.println(bankAccount.getAccountName());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());

    }
}

