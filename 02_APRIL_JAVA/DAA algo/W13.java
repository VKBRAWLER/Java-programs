import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class W13 {
  public static void LinearSearch (int[] nums, int start, int end, int key) {
    int loc = -1;
    for (int i = start; i <= end; i++) {
      if (nums[i] == key) loc = i;
      if (nums[i] > key) break;
    }
    if (loc == -1) System.err.println("Element NOT found");
    else System.err.println("Element found");
  }
  public static void main(String[] args) {
    int n = 20;
    int[] nums = new int[20];
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
    System.out.print("Enter the search key: ");
    int key = sc.nextInt();
    int power = 0;
    int value = 0;
    while (value < n) {
      if (key <= nums[value]) break;
      power++;
      value = (int) Math.pow(2, power);
    }
    if (value < n) LinearSearch(nums, (int) (value/2), value, key);
    else if (key <= nums[n-1]) LinearSearch(nums, (int) (Math.pow(2, power-1)), n-1, key);
    else System.err.println("Element NOT found");
    sc.close();
  }
}