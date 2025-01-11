package DSA.Leet_Code.Array_Hashing;

import java.util.*;
import java.util.stream.Collectors;

public class ValidAnagramGroup {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Valid anagram group : " + groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] anagramArray) {
        if (anagramArray.length == 1) {
            return Arrays.asList(Arrays.asList(anagramArray[0]));
        }
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String anagram : anagramArray) {
            List<String> currentAnagram = anagram.chars().mapToObj(String::valueOf).sorted().collect(Collectors.toList());
            String sortedAnagram = String.join("", currentAnagram);
            List<String> newOrExistingItem = anagramMap.get(sortedAnagram) != null ? anagramMap.get(sortedAnagram) : new ArrayList<>();
            newOrExistingItem.add(anagram);
            anagramMap.put(sortedAnagram, newOrExistingItem);
        }
        System.out.println("anagramMap : " + anagramMap);
        return anagramMap.values().stream().collect(Collectors.toList());
    }
}
