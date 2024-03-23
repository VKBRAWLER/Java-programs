import java.util.Random;

public class d04 {
  static void mergeArray (int[] nums, int l, int mid, int r) {
    int n1 = mid - l + 1;
    int n2 = r - mid;
    int [] a1 = new int[n1];
    int [] a2 = new int[n2];
    for (int i = 0; i < n1; i++) {
      a1[i] = nums[l+i];
    }
    for (int i = 0; i < n2; i++) {
      a2[i] = nums[mid+1+i];
    }
    int i = 0;
    int j = 0;
    int k = l;
    while (i < n1 && k < n2) {
      if (a1[i] < a2[j]) {
        nums[k] = a1[i];
        k++; i++;
      }
      else {
        nums[k] = a2[j];
        k++; j++;
      }
    }
    while (i < n1) {
      nums[k] = a1[i];
      k++; i++;
    }
    while (j < n2) {
      nums[k] = a2[j];
      k++; j++;
    }
  }
  static void mergeSort (int[] nums, int l, int r) {
    if (l<r) {
      int mid = (l+r)/2;
      mergeSort(nums, l, mid);
      mergeSort(nums, mid+1, r);
      mergeArray(nums,l,mid,r);
    }
  }
  public static void main(String[] args) {
    Random random = new Random();
    int n = 20;
    int [] nums = new int[n];
    for (int i = 0; i < n; i++) { nums[i] = random.nextInt(100); }
    int l = 0, r = n-1;
    for (int i = 0; i < n; i++) { System.out.print(nums[i] + " "); } System.out.println();
    mergeSort(nums, l, r);
    for (int i = 0; i < n; i++) { System.out.print(nums[i] + " "); } System.out.println();
  }
}
