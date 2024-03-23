
public class q09 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.deleteCharAt(i);
                i--; // Adjust the index because we just removed a character
            }
        }

        System.out.println(sb.toString());
    }
}
