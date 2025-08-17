package project0813;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345", "A", 10000);
        BankAccount acc2 = new BankAccount("67891", "B", 5000);

        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.transferTo(acc2, 4000);

        acc1.getmoney();
        acc2.getmoney();
    }
}
