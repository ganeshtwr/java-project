package DSA.Leet_Code.Array_Hashing;

import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Top K Frequent : " + productExceptSelf(nums));
    }

    public static  List<Integer> productExceptSelf(int[] nums) {
        if (nums.length == 1) {
            return Arrays.asList(nums[0]);
        }




        return Arrays.asList(nums[0]);
    }
}
