package DSA.Leet_Code.Array_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        int[] nums = {0, 3, 7, 2, 8, 4, 6, 0, 1, 0, 0, 0};
//        int[] nums = {9, 1, -3, 2, 4, 8, 3, -1, 6, -2, -4, 7};
        System.out.println("Longest Consecutive Sequence : " + longestConsecutiveSequence(nums));
    }

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> sortedSet = new HashSet<>();
        for (int num : nums) {
            sortedSet.add(num);
        }
        List<Integer> sortedList = new ArrayList<>(sortedSet);
        sortedList = sortedList.stream().sorted().collect(Collectors.toList());

        if (sortedList.isEmpty() || sortedList.size() == 1) {
            return sortedList.size();
        }

        int count = 0;
        int counter = 1;
        for (int i = 0; i < sortedList.size() - 1; i++) {
            if (sortedList.get(i) + 1 == sortedList.get(i + 1)) {
                counter++;
            } else {
                if (counter > count) {
                    count = counter;
                }
                counter = 1;
            }
        }
        return Math.max(counter, count);
    }
}
