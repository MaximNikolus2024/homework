package lesson23.classwork.example02;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Maxim","Burgsteinfurt", 19);
        CreditBankAccount account = new CreditBankAccount(1209,"DE23435547668", maxim, 1000);
        account.deposit(1500);
        System.out.println("Amount " +account.getAmount());
        account.takeLoan(500);
        System.out.println("Amount " + account.getAmount());
        System.out.println("Current Debt: " + account.getCurrentDebt());
        account.takeLoan(1000);
        System.out.println("Amount " + account.getAmount());
        System.out.println("Current Debt: " + account.getCurrentDebt());
    }
}
