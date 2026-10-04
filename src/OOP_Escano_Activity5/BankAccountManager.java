package OOP_Escano_Activity5;

class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;
    private static int totalAccounts = 0;

    BankAccount(String ownerName, String accNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accNumber;
        if (initialBalance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
        totalAccounts++;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount acc1; BankAccount acc2; BankAccount acc3;

        acc1 = new BankAccount("Sziel", "AC086734", 500.5);
        acc2 = new BankAccount("Rhein", "AC986421", 150.0);
        acc3 = new BankAccount("Korey", "AC335872", 1000.9);

        System.out.println("====== ACCOUNTS SUMMARY ======");
        System.out.println("Name: " + acc1.getOwnerName() + "\nAccount Number: " + acc1.getAccountNumber()
                + "\nBalance: " + "$" + acc1.getBalance());
        System.out.println();
        System.out.println("Name: " + acc2.getOwnerName() + "\nAccount Number: " + acc2.getAccountNumber()
                + "\nBalance: " + "$" + acc2.getBalance());
        System.out.println();
        System.out.println("Name: " + acc3.getOwnerName() + "\nAccount Number: " + acc3.getAccountNumber()
                + "\nBalance: " + "$" + acc3.getBalance());
        System.out.println();

        System.out.println("Depositing $250.0 into Mr. Rhein's Account..");
        acc2.deposit(250.0);
        System.out.println("Deposit Successful! Mr. Rhein's New Balance: $" + acc2.getBalance());
        System.out.println();

        System.out.println("Withdrawing $500.0 from Ms. Sziel's Account..");
        if (acc1.withdraw(500.0)) {
            System.out.println("Withdrawal Successful! Ms. Sziel's New Balance: $" + acc1.getBalance());
        } else {
            System.out.println("Withdrawal Failed! Insufficient Funds.");
        }
        System.out.println();

        System.out.println("Withdrawing $1500.0 from Mrs. Korey's Account..");
        if (acc3.withdraw(1500.0)) {
            System.out.println("Withdrawal Successful! Mrs. Korey's New Balance: $" + acc3.getBalance());
        } else {
            System.out.println("Withdrawal Failed! Insufficient Funds.");
        }
        System.out.println();

        System.out.print("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}
