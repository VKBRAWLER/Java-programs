import java.util.ArrayList;
public class app {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.addAll(2, arr);
    System.out.println(arr);
  }
}
