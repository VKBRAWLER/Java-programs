import java.util.Scanner;
class Bank {
  static int nextAccountNumber = 1001; // Class variable to generate unique account numbers

  String depositorName;
  String depositorAddress;
  int accountNumber;
  double balance;

  // Constructor
  public Bank(String depositorName, String depositorAddress, double balance) {
      this.depositorName = depositorName;
      this.depositorAddress = depositorAddress;
      this.accountNumber = nextAccountNumber++;
      this.balance = balance;
  }

  // Method to display depositor information and balance
  public void displayInfo() {
      System.out.println("Depositor Name: " + depositorName);
      System.out.println("Depositor Address: " + depositorAddress);
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Balance: " + balance);
  }

  // Method to deposit an amount
  public void deposit(double amount) {
      balance += amount;
  }

  // Method to withdraw an amount
  public void withdraw(double amount) {
      if (balance >= amount) {
          balance -= amount;
      } else {
          System.out.println("Insufficient balance!");
      }
  }

  // Method to change depositor address
  public void changeAddress(String newAddress) {
      depositorAddress = newAddress;
  }
}
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of depositors:");
        int numDepositors = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        Bank[] banks = new Bank[numDepositors];

        for (int i = 0; i < numDepositors; i++) {
            System.out.println("Enter name, address and initial balance for depositor " + (i + 1));
            String name = scanner.nextLine();
            String address = scanner.nextLine();
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
            banks[i] = new Bank(name, address, balance);
        }

        // Print the information of first depositor
        banks[0].displayInfo();

        // Add some amount to the account of first depositor
        banks[0].deposit(500);
        banks[0].displayInfo();

        // Remove some amount from the account of first depositor
        banks[0].withdraw(200);
        banks[0].displayInfo();

        // Change the address of first depositor
        banks[0].changeAddress("New Address");
        banks[0].displayInfo();
        scanner.close();
        // Repeat these processes for other bank accounts as needed
    }
}
