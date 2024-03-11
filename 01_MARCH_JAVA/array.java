import java.util.Arrays;

public class array {
  public static void main(String[] args) {
    int[] marks = new int[3];
    marks[0] = 22;
    marks[1] = 2;
    marks[2] = 234;
    System.out.println(marks[0]);
    Arrays.sort(marks);
    System.out.println(marks[0]);
  }
}
