package task2;

public class Account {
    double balance;

    // Constructor without arguments
    public Account(){
        balance=0.0;
    }
    // Constructor with arguments
    public Account(double balance,double initialamount){
        this.balance=balance+initialamount;

    }
    //method to deposit amount to account
    public void deposit(double amount){
        this.balance+=amount;
    }
    //method to withdraw amount
    public void withdraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance-=amount;
        }
    }
    //method to check the balance
    public double getBalance(){
        return this.balance;
    }

    public static void main(String[] args){
        Account a1=new Account(); // initializing a object without arguments
        Account a2=new Account(100,500); // initializing a object with arguments
        a1.deposit(500);
        double balanceViewer1=a1.getBalance();
        System.out.println("Balance in a1:"+balanceViewer1);
        double balanceViewer2=a2.getBalance();
        System.out.println("Balance in a2:"+balanceViewer2);
        a2.withdraw(300);
        double balanceViewer3=a2.getBalance();
        System.out.println("Balance in a2:"+balanceViewer3);


    }
}

//OUTPUT
//Balance in a1:500.0
//Balance in a2:600.0
//Balance in a2:300.0

