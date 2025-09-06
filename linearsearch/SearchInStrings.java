import java.util.Arrays;

public class SearchInStrings {

    public static void main(String[] args) {

        // Declaring a String variable named 'name' and assigning it the text "Ramesh"
        // A String is an object in Java that holds a sequence of characters. Strings are immutable.
        String name = "Ramesh";

        // Declaring a char (character) variable named 'target' and assigning it 'u'
        // 'char' is a 16-bit primitive type in Java that stores a single UTF-16 code unit.
        char target = 'u';

        // This line is commented out with '//', so it won’t run.
        // If uncommented, it would print whether 'target' is found in 'name' using the search() method.
        // System.out.println(search(name, target));

        // Printing the contents of the String as an array of characters.
        // name.toCharArray() converts the String to a char[] (array of characters).
        // Arrays.toString(...) converts that char[] into a human-readable string like "[R, a, m, e, s, h]".
        System.out.println(Arrays.toString(name.toCharArray()));
    }


    // Method: search2
    // This method searches for a character in a string using a for-each loop.
    // It's 'static' so it belongs to the class and can be called without creating an object.
    // It returns a boolean: true if the character is found, false otherwise.
    static boolean search2(String str, char target) {
        // Check if the string is empty (length is 0). If yes, return false immediately.
        // NOTE: If 'str' is null, this will throw a NullPointerException. 
        if (str.length() == 0) {
            return false;
        }

        // Enhanced for loop (for-each): iterate through every character in the char array
        // str.toCharArray() creates a new array of all characters in the String.
        for (char ch : str.toCharArray()) {
            // If the current character equals the target, return true.
            if (ch == target) {
                return true;
            }
        }

        // If loop completes with no match, return false.
        return false;
    }

    // Method: search
    // This method searches for a character in a string using a traditional for loop and charAt().
    static boolean search(String str, char target) {
        // If the string has no characters, return false immediately.
        if (str.length() == 0) {
            return false;
        }

        // Standard for loop:
        // Initialize i = 0, run while i < str.length(), increment i each time.
        for (int i = 0; i < str.length(); i++) {
            // str.charAt(i) gets the character at index i in the String.
            // If this matches target, return true.
            if (target == str.charAt(i)) {
                return true;
            }
        }

        // If the target was not found after scanning all characters, return false.
        return false;
    }
}
