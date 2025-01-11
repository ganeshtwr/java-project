package DSA.Leet_Code.Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSumZero {

    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets Sum Zero : " + threeSum(numbers));
    }

    public static List<List<Integer>> threeSum(int[] numbers) {
        // Use Map instead of list to filter out the duplicate list of element
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        result.add(Arrays.asList(numbers[i], numbers[j], numbers[k]));
                    }
                }
            }
        }
        return result;
    }
}
