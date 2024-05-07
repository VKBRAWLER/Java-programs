import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class W21 {
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
    int low = 0, high = n-1, loc = -1, count = 0;
    while (low <= high) {
      int mid = (high+low)/2;
      if (key > nums[mid]) low = mid+1;
      else if (key < nums[mid]) high = mid-1;
      else if (nums[mid] == key) { loc = mid; break; }
    }
    if (loc == -1) System.out.println("Key not present");
    else {
      for (int i = loc+1; i < n; i++) {
        if (nums[i] == key) count++;
        else break;
      }
      while (loc >= 0) {
        if (nums[loc] == key) count++;
        else break;
        loc--;
      } 
      System.out.println("Key count is " + count);
      sc.close();
    }
  }
}