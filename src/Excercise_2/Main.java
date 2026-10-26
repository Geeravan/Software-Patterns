package Excercise_2;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);
        Invoker invoker = new Invoker();

        invoker.run(new DepositCommand(account, 50));
        System.out.println(account.getBalance());   // 150

        invoker.run(new WithDrawalCommand(account, 30));
        System.out.println(account.getBalance());   // 120

        invoker.undo();
        System.out.println(account.getBalance());   // 150

        invoker.undo();
        System.out.println(account.getBalance());   // 100

        // Fehlerfall: zu viel abheben
        try {
            invoker.run(new WithDrawalCommand(account, 500));
        } catch (IllegalStateException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        System.out.println(account.getBalance());   // 100 (unverändert)

        // Mehrfachausführung
        Command d = new DepositCommand(account, 10);
        d.execute();
        try {
            d.execute();
        } catch (IllegalStateException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
        System.out.println(account.getBalance());   // 110
    }
}