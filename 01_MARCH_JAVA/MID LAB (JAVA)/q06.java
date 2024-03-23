import java.util.Random;

public class q06 {
  public static void main(String[] args) {
    int n = 10;
    int[] arr = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = random.nextInt(2*n+1) - 10;
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(arr[i] + " ");
    } System.err.println();
    int j = n-1;
    for (int i = 0; i < n && j > i; i++) {
      while (arr[j] >= 0 && j > i) j--;
      if (arr[i] >= 0 && j > i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
