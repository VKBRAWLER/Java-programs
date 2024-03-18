import java.util.Scanner;

public class q01 {
  public static void main(String[] args) {
    String name, course;
    int urn, sem;
    Scanner sc = new Scanner(System.in);
    System.err.print("Enter your name: ");
    name = sc.nextLine();
    System.err.print("Enter your Semester : ");
    sem = sc.nextInt();
    sc.nextLine(); // Consume the remaining newline character in the input buffer
    System.err.print("Enter your University Roll no. : ");
    urn = sc.nextInt();
    sc.nextLine(); // Consume the remaining newline character in the input buffer
    System.err.print("Enter your Course. : ");
    course = sc.nextLine();
    System.err.println("Name: " + name);
    System.err.println("Course: " + course);
    System.err.println("URno.: " + urn);
    System.err.println("Semester: " + sem);
    sc.close();
  }
}
