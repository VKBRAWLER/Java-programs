import java.util.Random;

public class W31 {
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
    // nums = new int[] {-23, 65, -31, 76, 46, 89, 45, 32};
    // nums = new int[] {54, 65, 34, 76, 78, 97, 46, 32, 51, 21};
    int com = 0, sft = 0;
    for (int i = 1; i < nums.length; i++) {
      for (int j = i-1; j >= 0; j--) {
        com++;
        if (nums[j+1] >= nums[j]) break;
        sft++;
        int temp = nums[j];
        nums[j] = nums[j+1];
        nums[j+1] = temp;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      System.err.print(nums[i] + " ");
    }
    System.out.println();
    System.out.println("comparision = " + com + " shift = " + sft);
  }
}
