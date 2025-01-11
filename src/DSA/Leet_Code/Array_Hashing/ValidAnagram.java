package DSA.Leet_Code.Array_Hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram {

    public static void main(String[] args) {
        String source = "Anagram";
        String target = "Nagaram";
        System.out.println("isAnagram : " + isAnagram(source, target));
        System.out.println("isAnagramUsingList  : " + isAnagramUsingList(source, target));
        System.out.println("isAnagramUsingListOptimized : " + isAnagramUsingListOptimized(source, target));
    }

    public static boolean isAnagramUsingList(String source, String target) {
        // If length does not match simply not anagram
        if (source.length() != target.length()) {
            return false;
        }
        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();
        for (int i = 0; i < source.length(); i++) {
            s.add(source.toLowerCase().charAt(i) + "");
            t.add(target.toLowerCase().charAt(i) + "");
        }
        s = s.stream().sorted().collect(Collectors.toList());
        t = t.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted source :  " + s);
        System.out.println("sorted target :  " + t);
        for (int i = 0; i < s.size(); i++) {
            if (!s.get(i).equals(t.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramUsingListOptimized(String source, String target) {
        if (source.length() != target.length()) {
            return false;
        }
        source = source.toLowerCase();
        target = target.toLowerCase();
        List<String> s = source.chars().mapToObj(String::valueOf).sorted().collect(Collectors.toList());
        List<String> t = target.chars().mapToObj(String::valueOf).sorted().collect(Collectors.toList());
        System.out.println("sorted source :  " + s);
        System.out.println("sorted target :  " + t);
        for (int i = 0; i < s.size(); i++) {
            if (!s.get(i).equals(t.get(i)))
                return false;
        }
        return true;
    }

    public static boolean isAnagram(String source, String target) {
        // If length does not match simply not anagram
        if (source.length() != target.length()) {
            return false;
        }
        System.out.println("char size  " + source.toCharArray().length);
        char[] s = source.toLowerCase().toCharArray();
        char[] t = target.toLowerCase().toCharArray();
        for (int i = 0; i < s.length; i++) {

        }

        return false;
    }

}
