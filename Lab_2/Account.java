package cisc181.Lab_2;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

public class Account {
    private String customerName;
    private double balance;
    private double interest;
    private double balLimit;

    /*
    initializes an account with user input values
     */
    public Account(String customerName, double balance, double interest){
        this.customerName = customerName;
        this.balance = balance;
        this.interest = interest;
        this.balLimit = 0;
    }

    /*
    initializes an account with a credit limit
     */
    public Account(String customerName, double balance, double interest, double balLimit){
        this.customerName = customerName;
        this.balance = balance;
        this.interest = interest;
        this.balLimit = balLimit;
    }

    /*
    returns the account's users name
     */
    public String getName(){
        return customerName;
    }

    /*
    returns the balance of the account
     */
    public double getBalance(){
        return balance;
    }

    /*
    returns the interest rate on the account
     */
    public double getInterestRate(){
        return interest;
    }

    /*
    adds a user input balance into the balance of an account
     */
    public void deposit(double money){
        balance += money;
    }

    /*
    removes a user input amomunt of money from an account's balance
     */
    public boolean withdraw(double money){
        if((balance - money) < balLimit)
            return false;
        else {
            balance -= money;
            return true;
        }
    }

    /*
    adds the interest to the balance
     */
    public void addMonthlyInterest(){
        balance += balance * interest;
    }

    /*
    takes a different account and tries to pay off as much as that
    account's debt as possible
     */
    public void payOffBalance(Account debtee){
        if(debtee.balance < 0){
            if (balance > debtee.balance) {
                if((debtee.balance * -1) < balance){
                    withdraw(debtee.balance * -1);
                    debtee.deposit(debtee.balance * -1);
                }
                else{
                    double temp = balance;
                    withdraw(temp);
                    debtee.deposit(temp);
                }
            }
        }
    }
}
