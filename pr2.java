//21CE024_Aneri
import java.util.*;
class account 
{
    private int id;
    private double balance;  //balance for account
    private  double annualInterestRate=7;  //store the cuurent interest rate
    private java.util.Date dateCreated; //stores account created date.
    public account()  
    {
    	dateCreated = new java.util.Date();
    }
    account(int id, double balance) 
    {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    //generate mutator(getter and setter) method
    public int getId() 
    {
        return this.id;
    }
    public double getBalance() 
    {
        return this.balance;
    }
    public  double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }
    public void setId(int newId) 
    {
        id = newId;
    }
    public void setBalance(double newBalance) 
    {
        balance = newBalance;
    }
    public  void setAnnualInterestRate(double newAnnualInterestRate) 
    {
        annualInterestRate = newAnnualInterestRate;
    }
    public double getMonthlyInterestRate() 
    {
        return (annualInterestRate / 100) / 12;
    }
    public double getMonthlyInterest() 
    {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) 
    {
        balance = balance - amount;
    }
    public void deposit(double amount) 
    {
        balance = balance + amount;
    }
    public java.util.Date getDateCreated() 
    {
        return dateCreated;
    }
    public void getAccountdetailes() 
    {
        System.out.println("id : " + getId());
        System.out.println("Balance : " + getBalance());
        System.out.println("annualInterestRate : " + getAnnualInterestRate());
        System.out.println("Monthly interest is : " + getMonthlyInterest());
        System.out.println("This account was created at :  " + getDateCreated());
    }
}
class pr2
{
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your id:");
        int id=ob.nextInt();
        System.out.println("Enter your balance:");
        double balance=ob.nextDouble();
        System.out.println("Enter your interest:");
        double interest=ob.nextDouble();
        System.out.println("Enter widraw amount:");
        double widrawamount=ob.nextDouble();
        System.out.println("Enter deposit amount:");
        double depositamount=ob.nextDouble();
        account a = new account(id, balance);
        a.setAnnualInterestRate(interest);
        a.withdraw(widrawamount);
        a.deposit(depositamount);
        a.getAccountdetailes();
    }
}

