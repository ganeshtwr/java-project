package DSA.Leet_Code.Two_Pointers;

public class TwoSumIndexReturn {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two Sum Index Return : " + twoSumOptimized(numbers, target));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + numbers[i + 1] == target) {
                System.out.println(" i+1 : " + (i + 1) + ", i+2 : " + (i + 2));
                return new int[]{i + 1, i + 2};
            }
        }
        return new int[]{};
    }

    public static int[] twoSumOptimized(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(" i : " + (i + 1) + ", j : " + (j + 1));
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}
