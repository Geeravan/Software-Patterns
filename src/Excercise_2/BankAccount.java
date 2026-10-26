package Excercise_2;

public class BankAccount {
    private float balance;

    public BankAccount(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount){
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void withdraw(float amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds");
            return;
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
            return;
        }
    }

    public float getBalance() {
        return balance;
    }
}
