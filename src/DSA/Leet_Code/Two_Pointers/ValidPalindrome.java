package DSA.Leet_Code.Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

    public static void main(String[] args) {
//        String sentence = "A man, a plan, a canal: Panama";
        String sentence = "Marge, let's \\\"[went].\\\" I await {news} telegram.";
        System.out.println("Is Palindrome : " + longestConsecutiveSequence(sentence));
    }

    public static boolean longestConsecutiveSequence(String sentence) {
        List<String> sentenceList = new ArrayList<>();

        // Remove special char and space only but not small caps letters and numbers then convert caps to lower case
        for (char character : sentence.toCharArray()) {
            if (character >= 65 && character <= 90) {
                character = (char) (character + 32);
            }
            if ((character >= 97 && character <= 122) || (character >= 48 && character <= 57)) {
                sentenceList.add(character + "");
            }
        }

        // Collect them into a list and then reverse it and then compare it with original String
        StringBuilder originalCleanSentence = new StringBuilder();
        for (String s : sentenceList) {
            originalCleanSentence.append(new StringBuilder(s));
        }
        System.out.println("originalCleanSentence : " + originalCleanSentence);

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = sentenceList.size() - 1; i >= 0; i--) {
            reversedSentence.append(new StringBuilder(sentenceList.get(i)));
        }
        System.out.println("reversedSentence : " + reversedSentence);
        return originalCleanSentence.toString().equals(reversedSentence.toString());
    }
}
