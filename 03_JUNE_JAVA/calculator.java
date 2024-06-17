import java.util.Scanner;

class MyCalculator {
  // Method to calculate n raised to the power of p
  public long power(int n, int p) throws Exception {
    if (n < 0 || p < 0) {
      throw new Exception("n and p should be non-negative");
    } else if (n == 0 && p == 0) {
      throw new Exception("n and p should not be zero");
    } else {
      return (long) Math.pow(n, p);
    }
  }
}

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MyCalculator myCalculator = new MyCalculator();
    int numberOfPairs = sc.nextInt(); // Assuming the first input is the number of pairs
    for (int i = 0; i < numberOfPairs; i++) {
      int n = sc.nextInt(); // Read the next integer
      int p = sc.nextInt(); // Read the next integer
      try {
        System.out.println(myCalculator.power(n, p));
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    sc.close();
  }
}
