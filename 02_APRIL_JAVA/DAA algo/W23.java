import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class W23 {
    public static void main(String[] args) {
    int n = 10;
    int[] nums = new int[n];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    // takes random input
    for (int i = 0; i < nums.length; i++) {
      nums[i] = random.nextInt(100);
    }
    // sorts the array
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    System.out.print("Enter the difference: ");
    int K = sc.nextInt();
    int count = 0;
    for (int i = n-1; i > 0; i--) {
      for (int j = i-1; j >= 0; j--) {
        if ((nums[i] - nums[j]) < K) continue;
        if ((nums[i] - nums[j]) == K) count++;
        break;
      }
    }
    System.err.println(count);
    sc.close();
  }
}
