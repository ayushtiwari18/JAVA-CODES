import java.util.Scanner;

public class ai {
    public static String getUppercase(String str) {
        StringBuilder newStr = new StringBuilder();

        boolean newWord = true; // Track if the current character is the start of a new word

        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                newStr.append(ch);
                newWord = true; // Set the flag for the next word
            } else {
                if (newWord) {
                    newStr.append(Character.toUpperCase(ch));
                    newWord = false; // Turn off the flag
                } else {
                    newStr.append(ch);
                }
            }
        }

        return newStr.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close(); // Close the scanner when done with it

        System.out.println(getUppercase(str));
    }
}
