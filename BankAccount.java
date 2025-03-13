//NAME : Doris Nduta
//REG NO : CT101/G/21006/23
//DATE : 14/03/2025
//ASSIGNMENT: 4 

// BankAccount class demonstrating encapsulation
public class BankAccount {
  // Private balance variable to prevent direct modification
  private double balance;

  // Constructor to initialize balance
  public BankAccount(double initialBalance) {
      if (initialBalance >= 0) {
          this.balance = initialBalance;
      } else {
          System.out.println("Initial balance cannot be negative.");
      }
  }

  // Public method to deposit money
  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposited: " + amount);
      } else {
          System.out.println("Deposit amount must be positive.");
      }
  }

  // Public method to withdraw money with validation
  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
          System.out.println("Withdrawn: " + amount);
      } else {
          System.out.println("Invalid withdrawal amount or insufficient balance.");
      }
  }

  // Public method to check balance (getter method)
  public double getBalance() {
      return balance;
  }

  public static void main(String[] args) {
      // Demonstration of encapsulation
      BankAccount account = new BankAccount(500); // Initial balance
      account.deposit(200);
      account.withdraw(100);
      System.out.println("Final Balance: " + account.getBalance());
  }
}
/*encapsulation protects financial data, ensures valid transactions and enhances 
system security and maintanability, making it critical principle in the real-world
banking system*/ 