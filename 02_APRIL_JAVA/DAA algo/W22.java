import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class W22 {
  public static void main(String[] args) {
    int n = 7;
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
    int k = 2;
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    while (k < n) {
      for (int i = 0; i < k-2; i++) {
        for (int j = i+1; j < k-1; j++) {
          if ((nums[i]+nums[j] < nums[k])) continue;
          else {
            if (nums[i]+nums[j] == nums[k]) list.add(new ArrayList<>(Arrays.asList(i, j, k)));
            break;
          }
        }
      }
      k++;
    }
    if (list.size() > 0) for (ArrayList<Integer> i: list) { System.out.println(i.get(0)+", "+i.get(1)+", "+i.get(2)); }
    else System.out.println("No sequence found");
    sc.close();
  }
}
