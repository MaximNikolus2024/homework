package lesson23.classwork.example02;

public class BankAccount {
    protected int id;
    protected String iban;
    protected Human owner;
    protected double amount;

    public BankAccount(int id, String iBan, Human owner) {
        this.id = id;
        this.iban = iBan;
        this.owner = owner;
        amount = 0;
    }
    public void withdraw(double amount){
        if(this.amount >= amount){
            this.amount -= amount;
        }
    }
    public void deposit(double amount){
        this.amount += amount;
    }


    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public double getAmount() {
        return amount;
    }
}
