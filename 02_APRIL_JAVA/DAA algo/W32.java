import java.util.Random;

public class W32 {
  public static void main(String[] args) {
    int n = 20;
    int[] nums = new int[n];
    Random random = new Random();
    // takes random input
    for (int i = 0; i < nums.length; i++) {
      nums[i] = random.nextInt(100);
    }
    // unsorted array
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    // nums = new int[] {-13, 65, -21, 76, 46, 89, 45, 12};
    nums = new int[] {54, 65, 34, 76, 78, 97, 46, 32, 51, 21};
    int com = 0, swap = 0;
    for (int i = 0; i < nums.length; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        com++;
        if (nums[j] < nums[min]) min = j;
      }
      if (nums[i] > nums[min]) {
        swap++;
        int temp = nums[min];
        nums[min] = nums[i];
        nums[i] = temp;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    System.out.println("comparision = " + com + " swap = " + swap);
  }
}