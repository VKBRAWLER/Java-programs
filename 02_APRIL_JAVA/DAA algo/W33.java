import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class W33 {
  public static void mergeSort(int[] nums, int l, int r) {
    int mid = (r+l)/2;
    if (r-l > 1) {
      mergeSort(nums, l, mid);
      mergeSort(nums, mid+1, r);
    }
    mergeArray(nums, l, mid, r);
  }
  public static void mergeArray (int[] nums, int l, int mid, int r) {
    int[] left = new int [mid-l+1];
    int[] right = new int [r-mid];
    for (int i = 0, j = l; i < left.length; i++, j++) { left[i] = nums[j]; }
    for (int i = 0, j = mid+1; i < right.length; i++, j++) { right[i] = nums[j]; }
    int i = l, j = 0, k = 0;
    while (j < left.length && k < right.length) {
      if (left[j] < right[k]) { nums[i] = left[j]; j++; }
      else { nums[i] = right[k]; k++; }
      i++;
    }
    while (j < left.length) {
      nums[i] = left[j];
      j++; i++;
    }
    while (k < right.length) {
      nums[i] = right[k];
      k++; i++;
    }
  }
  public static void main(String[] args) {
    int n = 20;
    int[] nums = new int[n];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    // takes random input
    for (int i = 0; i < nums.length; i++) {
      nums[i] = random.nextInt(100);
    }
    // nums = new int[] {6,5,4,3,2,1};
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    mergeSort(nums,0,nums.length-1);
    boolean found = false;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i-1]) { found = true; break; }
    }
    if (found) System.out.println("YES");
    else System.out.println("NO");
  }
}
