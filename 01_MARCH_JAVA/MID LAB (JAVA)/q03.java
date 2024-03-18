import java.util.Scanner;


public class q03 {
  public static boolean friendly(int num1, int num2) {
    int sum1 = 1, sum2 = 1;
    for (int i = 2; i <= num1/2; i++) {
      if (num1%i == 0) sum1 += i;
    }
    for (int i = 2; i <= num2/2; i++) {
      if (num2%i == 0) sum2 += i;
    }
    sum1 = num1/sum1;
    sum2 = num2/sum2;
    return (sum1 == sum2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("Enter first Integer: ");
    int num1 = sc.nextInt();
    System.err.print("Enter second Integer: ");
    int num2 = sc.nextInt();
    if (num1 == num2 || friendly(num1, num2)) System.err.println("It's a friendly pair");
    else System.err.println("It's NOT a friendly pair");
    sc.close();
  }
}