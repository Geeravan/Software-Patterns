package Excercise_2;
import Excercise_2.BankAccount;
public class DepositCommand implements Command{

    private BankAccount account;
    private float amount;
    private boolean executed = false;

    public DepositCommand(BankAccount account, float amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (executed) {
            throw new IllegalStateException("Command wurde bereits ausgeführt");
        }
        account.deposit(amount);
        executed = true;
    }

    @Override
    public void undo() {
        if (!executed) {
            throw new IllegalStateException("Command wurde noch nicht ausgeführt");
        }
        account.withdraw(amount);
        executed = false;
    }
}