package DSA.Personal_Expr_Questions.Basics;

public class FrequencyByAlphabeticalOrder {
    public static void main(String[] args) {

        int MAX = 26;
        String s = "geeksforgeeks";
        int n = s.length();

        // To store the frequency of the characters
        int freq[] = new int[MAX];

        // Update the frequency array
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // Print the frequency in Alphabetical order
        for (int i = 0; i < MAX; i++) {
            if (freq[i] != 0)
                System.out.print((char) (i + 'a') + "" + freq[i]);
        }
    }
}
