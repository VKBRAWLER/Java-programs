import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class d02 {
  public static void main(String[] args) {
    int n = 20;
    int[] nums = new int[20];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    for (int i = 0; i < nums.length; i++) {
      nums[i] = random.nextInt(100);
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.print("Enter the search key: ");
    int key = sc.nextInt();
    int low = 0, high = n-1, index = -1;
    while (low <= high) {
      int mid = (high+low)/2;
      if (nums[mid] == key) { index = mid; break; }
      else if (nums[mid] > key) high = mid-1;
      else if (nums[mid] < key) low = mid+1;
    }
    if (index == -1) System.out.println("Element not found");
    else System.err.println("Element found");
    sc.close();
  }  
}
