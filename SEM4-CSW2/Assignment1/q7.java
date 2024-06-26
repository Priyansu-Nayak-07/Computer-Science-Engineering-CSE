package assignment1;
//Account.java
abstract class Account {
 private int accountNumber;
 protected double balance;
 public Account(int accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public int getAccountNumber() {
     return accountNumber;
 }
 public double getBalance() {
     return balance;
 }
}
//SavingsAccount.java
class SavingsAccount extends Account {
 private double interestRate;

 public SavingsAccount(int accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }
 @Override
 public void deposit(double amount) {
     balance += amount;
     calculateInterest();
 }
 @Override
 public void withdraw(double amount) {
     if (balance - amount >= 0) {
         balance -= amount;
         calculateInterest();
     } else {
         System.out.println("Insufficient balance.");
     }}
 private void calculateInterest() {
     balance += balance * interestRate;
 }
}

//CurrentAccount.java
class CurrentAccount extends Account {
 private double overdraftLimit;

 public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
     super(accountNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= -overdraftLimit) {
         balance -= amount;
     } else {
         System.out.println("Exceeds overdraft limit.");
     }
 }
}

//BankingApplication.java (Main class)
public class q7{
 public static void main(String[] args) {

     SavingsAccount savingsAccount = new SavingsAccount(1007121, 1000000, 1);   
     CurrentAccount currentAccount = new CurrentAccount(0710211, 2000000, 20000);
     // Deposit and withdraw from SavingsAccount
     savingsAccount.deposit(70000);
     savingsAccount.withdraw(20000);
     // Deposit and withdraw from CurrentAccount
     currentAccount.deposit(30000);
     currentAccount.withdraw(15000);
     // Display account details
     System.out.println("Savings Account Details:");
     displayAccountDetails(savingsAccount);
     System.out.println("\nCurrent Account Details:");
     displayAccountDetails(currentAccount);
 }
 public static void displayAccountDetails(Account account) {
     System.out.println("Account Number: " + account.getAccountNumber());
     System.out.println("Balance: $" + account.getBalance());
 }
}
