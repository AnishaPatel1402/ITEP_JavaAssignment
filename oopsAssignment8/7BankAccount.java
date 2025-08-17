// Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
import java.util.ArrayList;
class Bank{
    ArrayList<Account> acc = new ArrayList<Account>();
    public void addAccount(Account a){
        acc.add(a);
    }
    public void removeAccount(Account a){
        acc.remove(a);
    }
    public void displayAllAccounts(){
        for(Account account : acc){
            account.display();
        }
    }

}
class Account{
    private String holderName;
    private int accountNum;
    private double balance;
    public Account(String holderName, int accountNum, double balance){
        this.holderName = holderName;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposite(double amount){
        this.balance += amount;
        System.out.println(amount + " Amount Deposited");
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
        System.out.println(amount + " Amount withdraw");
    }

    public double getBalance(){
        return this.balance;
    }

    public void display(){
        System.out.println("Name = "+ this.holderName);
        System.out.println("Account number = "+ this.accountNum);
        System.out.println("Balance = "+ this.balance);
    }

}
class Test{
    public static void main(String args[]){
        Account a1 = new Account("Anisha", 1234, 5000);
        // a1.display();
        // a1.deposite(5000);
        // a1.display();
        // a1.withdraw(3000);
        // a1.display();

        Account a2 = new Account("Hansa", 4321, 15000);
        Account a3 = new Account("Kashvee", 5676, 6000);
        Account a4 = new Account("Jay", 8989, 2300);

        Bank b = new Bank();
        b.addAccount(a1);
        b.addAccount(a2);
        b.addAccount(a3);
        b.addAccount(a4);
        b.displayAllAccounts();
        b.removeAccount(a4);
        b.displayAllAccounts();
    }

}
