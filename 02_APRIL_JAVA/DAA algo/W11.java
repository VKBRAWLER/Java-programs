import java.util.Scanner;

public class W11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.print("Enter the element to be searched: ");
    int num = sc.nextInt();
    int count = 1, loc = -1;
    for (int i = 0; i < n; i++) {
      if (nums[i] == num) { loc = i; break; }
      count++;
    }
    if (loc == -1) System.out.println("NOT Present " + count);
    else System.out.println("Present " + count);
    
    sc.close();
  }  
}
