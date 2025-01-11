package DSA.Leet_Code.Array_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println("Top K Frequent : " + topKFrequent(nums, k));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            return new int[]{nums[0]};
        }
        Map<Integer, Integer> numCounterMap = new HashMap<>();
        for (int num : nums) {
            numCounterMap.merge(num, 1, Integer::sum);
        }
        List<Integer> result = numCounterMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).
                limit(k).map(Map.Entry::getKey).collect(Collectors.toList());
        return result.stream().mapToInt(i->i).toArray();
    }

    public static  List<Integer> topKFrequentWithList(int[] nums, int k) {
        if (nums.length == 1) {
            return Arrays.asList(nums[0]);
        }
        Map<Integer, Integer> numCounterMap = new HashMap<>();
        for (int num : nums) {

            // Will get counter for all the different number

            // Using collection method :
            numCounterMap.merge(num, 1, Integer::sum);

            // Using manually
//            if (numCounterMap.get(num) == null) {
//                numCounterMap.put(num, 1);
//            } else {
//                numCounterMap.put(num, numCounterMap.get(num) + 1);
//            }

        }
        List<Integer> result = numCounterMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).
                limit(k).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("result : "+result);
        return result;
    }
}
