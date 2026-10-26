package Excercise_2;
import Excercise_2.BankAccount;
public class WithDrawalCommand implements Command {

    private BankAccount account;
    private float amount;
    private boolean executed = false;

    public WithDrawalCommand(BankAccount account, float amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (executed) {
            throw new IllegalStateException("Command wurde bereits ausgeführt");
        }
        account.withdraw(amount);   // wirft Exception, falls zu wenig Guthaben
        executed = true;            // wird nur erreicht, wenn withdraw geklappt hat
    }

    @Override
    public void undo() {
        if (!executed) {
            throw new IllegalStateException("Command wurde noch nicht ausgeführt");
        }
        account.deposit(amount);
        executed = false;
    }
}