import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeCounter {
  public static void main(String[] args) {
    String filename = "myfile.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line;
      int palindromeCount = 0;
      while ((line = br.readLine()) != null) {
        String[] words = line.split("\\s+");
        for (String word : words) {
          if (isPalindrome(word)) {
            palindromeCount++;
          }
        }
      }
      System.out.println("Number of palindromes in the file: " + palindromeCount);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }

  // Method to check if a string is a palindrome
  private static boolean isPalindrome(String str) {
    str = str.toLowerCase();
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}