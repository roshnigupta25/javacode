package inheritance;

//Define the BankAccount interface with deposit and withdraw methods
interface BankAccount {
 void deposit(double amount);   // Method to deposit money into the account
 void withdraw(double amount);  // Method to withdraw money from the account
}

//Implementing the BankAccount interface in the CheckingAccount class
class CheckingAccount implements BankAccount {
 private double balance;  // Variable to store the account balance
 
 // Constructor to initialize the account balance
 public CheckingAccount(double initialBalance) {
     this.balance = initialBalance;
 }
 
 // Implementation of the deposit method
 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }
 
 // Implementation of the withdraw method
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
     } else if (amount > balance) {
         System.out.println("Insufficient funds. Current Balance: $" + balance);
     } else {
         System.out.println("Withdrawal amount must be positive.");
     }
 }
 
 // Method to get the current balance (optional)
 public double getBalance() {
     return balance;
 }
}

//Main class to test the CheckingAccount implementation
public class BankApplication {
 public static void main(String[] args) {
     // Create an instance of CheckingAccount with an initial balance
     CheckingAccount account = new CheckingAccount(1000.00);
     
     // Call the deposit method
     account.deposit(500.00);  // Deposits $500
     
     // Call the withdraw method
     account.withdraw(200.00); // Withdraws $200
     
     // Attempt to withdraw more than the balance
     account.withdraw(1500.00); // Tries to withdraw $1500, should display insufficient funds
 }
}
