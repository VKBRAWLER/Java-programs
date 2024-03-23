import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class d03 {
  public static void main(String[] args) {
    int n = 20;
    int[] nums = new int[20];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    for (int i = 0; i < nums.length; i++) {
      nums[i] = random.nextInt(100);
    }
    Arrays.sort(nums);
    int start = 0, end = (int)(Math.sqrt(n));
    while ()
    sc.close();
  }
}
