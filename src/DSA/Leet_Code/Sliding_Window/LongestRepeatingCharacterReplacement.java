package DSA.Leet_Code.Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
//        String string = "ABAB";
        String string = "AABABBA";
        int k = 1;
        getUniqueCombination(string, k);
        System.out.println("Longest Repeating Character Replacement : " + characterReplacement(string, k));
    }

    private static void getUniqueCombination(String string, int k) {
        List<List<String>> uniqueString = new ArrayList<>();
        List<String> finalString = new ArrayList<>();
        List<String> originalString = new ArrayList<>();
        for (char character : string.toCharArray()) {
            originalString.add(character + "");
            finalString.add(character + "");
        }

        List<Integer> indexesOfA = new ArrayList<>();
        while (originalString.indexOf("A") != -1) {
            int index = originalString.indexOf("A");
            indexesOfA.add(index);
            originalString.remove(index);
            originalString.add(index, "B");
        }
        System.out.println("indexesOfA : " + indexesOfA);

        if (k == 1) {
            for(Integer index : indexesOfA){
                List<String> prepString = new ArrayList<>();
                prepString.addAll(finalString);
                prepString.remove(index);
                prepString.add(index, "B");
                uniqueString.add(prepString);
            }
        }

        System.out.println("uniqueString : " + uniqueString);


    }

    public static int characterReplacement(String string, int k) {
        // Best case scenarios output
        if (string.length() == 1) {
            return 1;
        }
        while (k >= 1) {
            string = string.replaceFirst("A", "B");
            k--;
        }

        int count = 0;
        int counter = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            if (String.valueOf(string.charAt(i)).equals(String.valueOf(string.charAt(i + 1)))) {
                counter++;
            } else {
                if (counter > count) {
                    count = counter;
                    counter = 1;
                }
            }
        }
        return Math.max(counter, count);
    }
}

