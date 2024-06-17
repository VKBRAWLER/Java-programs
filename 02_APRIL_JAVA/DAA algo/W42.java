import java.util.Random;

public class W42 {
  public static Random random = new Random();
  public static int comparisions = 0;
  public static int swaps = 0;
  public static void swap(int[] nums, int i, int j) {
    swaps++;
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;    
  }
  public static void quickSort(int[] nums, int l, int r) {
    if (l >= r) return;
    int piv_inx = random.nextInt(r-l) + l;
    swap(nums, piv_inx, r);
    swaps--;
    int piv = nums[r];
    int i = l;
    for (int j = l; j < r; j++) {
      if (nums[j] <= piv) {
        comparisions++;
        if (i != j) swap(nums, i, j);
        i++;
      }
    }
    swap(nums, i, r);
    quickSort(nums, l, i-1);
    quickSort(nums, i+1, r);
  }
  public static void main(String[] args) {
    int n = 20;
    int[] nums = new int[n];
    // takes random input
    for (int i = 0; i < nums.length; i++) {
      nums[i] = random.nextInt(100);
    }
    nums = new int[] {23, 65, 21, 76, 46, 89, 45, 32};
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    quickSort(nums, 0, nums.length-1);
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    System.out.println("swaps: " + swaps);
    System.out.println("comparisions: " + comparisions);
  }
}
