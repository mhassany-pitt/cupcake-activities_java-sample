public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public int deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount);
        }
        return this.balance;
    }

    public int withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
        return this.balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bob", 200);
        account.deposit(100);
        account.withdraw(50);
        System.out.println("Balance: " + account.getBalance());
    }
}
