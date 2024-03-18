import java.util.Scanner;

public class q04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.print("Enter the int: ");
    int num = sc.nextInt();
    int new_num = num;
    int d = 1;
    if (num == 0) new_num = 1;
    else
    while (num > 0) {
      if (num%10 == 0) new_num += d;
      d *= 10; num /= 10;
    };
    System.err.println("Output: " + new_num);
    sc.close();
  }  
}
