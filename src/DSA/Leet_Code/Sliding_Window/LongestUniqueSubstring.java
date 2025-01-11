package DSA.Leet_Code.Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
//        String string = "abcabcbb";
        String string = "fbojelwjgercer";
        System.out.println("Longest Unique Substring : " + lengthOfLongestSubstringUpdated(string));
    }

    public static int lengthOfLongestSubstringUpdated(String string) {
        // Best case scenarios output
        if (string.length() == 1) {
            return 1;
        }
        int count = 0;
        int counter = 0;
        List<String> uniqueList = new ArrayList<>();
        for (char character : string.toCharArray()) {
            if (uniqueList.contains(String.valueOf(character))) {
                int index = uniqueList.indexOf(String.valueOf(character));
                for (int i = 0; i <= index; i++) {
                    uniqueList.remove(0);
                }
                if (counter >= count) {
                    count = counter;
                }
                uniqueList.add(String.valueOf(character));
                counter = uniqueList.size();
            } else {
                uniqueList.add(String.valueOf(character));
                counter++;
            }
        }
        System.out.println("subStringWithLength : " + Math.max(counter, count));
        return Math.max(counter, count);
    }

}

