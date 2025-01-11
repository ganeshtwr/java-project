package DSA.Leet_Code.Sliding_Window;

public class ContainsPermutation {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println("S2 contains Permutation of S1 : " + checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1 == null || s1.isEmpty()) {
            return true;
        }

        
        return false;
    }
}
