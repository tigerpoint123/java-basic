package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.deposit(10000);
        account1.withdraw(9000);
        account1.withdraw(2000);

        System.out.println("잔고 : " + account1.balance);

    }
}
