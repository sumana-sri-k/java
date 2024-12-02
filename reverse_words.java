import java.util.*;
import java.util.Scanner;

class Main {

    static String reverseWords(String str) {
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
        Collections.reverse(words);
        return String.join(".", words);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(reverseWords(str));
    }
}
