import java.util.Scanner;

public class q02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Menu:");
    System.out.println("1. Term Deposit");
    System.out.println("2. Recurring Deposit");
    System.out.print("Enter your choice (1 or 2): ");
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        System.out.print("Enter Principal amount: ");
        double principal1 = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate1 = scanner.nextDouble();
        System.out.print("Enter Time period in years: ");
        double years1 = scanner.nextDouble();
        double maturityAmount1 = principal1 * Math.pow((1 + rate1 / 100), years1);
        System.out.println("Maturity Amount for Term Deposit: " + maturityAmount1);
        break;
      case 2:
        System.out.print("Enter Monthly Installment: ");
        double installment = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate2 = scanner.nextDouble();
        System.out.print("Enter Time period in months: ");
        double months = scanner.nextDouble();
        double maturityAmount2 = installment * months + installment * months * (months
            + 1) / 2 * rate2 / 100 * 1 / 12;
        System.out.println("Maturity Amount for Recurring Deposit: " + maturityAmount2);
        break;
      default:
        System.out.println("Invalid choice! Please choose either 1 or 2.");
    }
    scanner.close();
  }
}
