import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VowelCounterApp {
  public static void main(String[] args) {
    // Create the frame
    JFrame frame = new JFrame("Vowel Counter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1920, 1080);
    frame.setLayout(new GridLayout(3, 1));
    // Create the panel for input
    JPanel inputPanel = new JPanel(new BorderLayout());
    JLabel inputLabel = new JLabel("Enter a string:");
    JTextField inputField = new JTextField();
    inputPanel.add(inputLabel, BorderLayout.WEST);
    inputPanel.add(inputField, BorderLayout.CENTER);
    // Create the panel for result
    JPanel resultPanel = new JPanel(new BorderLayout());
    JLabel resultLabel = new JLabel("Result:");
    JTextField resultField = new JTextField();
    resultField.setEditable(false);
    resultPanel.add(resultLabel, BorderLayout.WEST);
    resultPanel.add(resultField, BorderLayout.CENTER);
    // Create the panel for buttons
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    // Create the buttons
    JButton countVowelButton = new JButton("CountVowel");
    JButton resetButton = new JButton("Reset");
    JButton exitButton = new JButton("Exit");
    // Add action listeners to the buttons
    countVowelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String inputText = inputField.getText();
        int vowelCount = countVowels(inputText);
        resultField.setText(String.valueOf(vowelCount));
      }
    });
    resetButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inputField.setText("");
        resultField.setText("");
      }
    });
    exitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    // Add buttons to the panel
    buttonPanel.add(countVowelButton);
    buttonPanel.add(resetButton);
    buttonPanel.add(exitButton);
    // Add components to the frame
    frame.add(inputPanel);
    frame.add(resultPanel);
    frame.add(buttonPanel);
    // Make the frame visible
    frame.setVisible(true);
  }
  
  private static int countVowels(String input) {
    int count = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < input.length(); i++) {
      if (vowels.indexOf(input.charAt(i)) != -1) {
        count++;
      }
    }
    return count;
  }
}