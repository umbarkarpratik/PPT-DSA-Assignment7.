package PrePlacementTraning.AssingnmentString;

public class Que4 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }

        // Remove trailing whitespace
        result.setLength(result.length() - 1);

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}

