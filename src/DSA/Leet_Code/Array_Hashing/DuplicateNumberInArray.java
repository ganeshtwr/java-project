package DSA.Leet_Code.Array_Hashing;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberInArray {

    public static void main(String[] args){
        int[] nums = new int[]{ 1,2,1,4,5,6,7,8,9,10};
        //int[] nums = new int[]{ 1,2,3,4,5,6,7,8,9,10};
        System.out.println("Is given array contain duplicate : "+containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numberCount.get(nums[i])==null){
                numberCount.put(nums[i], 1);
            }else{
                return true;
            }
        }
        return false;
    }
}
