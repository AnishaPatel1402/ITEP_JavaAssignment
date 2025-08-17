import java.util.Scanner;
class BankAccount{
    private int accNum;
    private String holderName;
    private double balance;

    //setter
    public void setData(int accNum, String holderName, double balance){
        this.accNum = accNum;
        this.holderName = holderName;
        this.balance = balance;
    }

    //display;
    public void display(){
        System.out.println("Account Number = "+ this.accNum);
        System.out.println("Account Holder Name = "+ this.holderName);
        System.out.println("Balance = "+ this.balance);
    }
}

class Test{
    public static void main(String args[]){
       BankAccount ba = new BankAccount();
       ba.setData(12345, "Kashwee Jaat", 2500);
       ba.display();
    }
}