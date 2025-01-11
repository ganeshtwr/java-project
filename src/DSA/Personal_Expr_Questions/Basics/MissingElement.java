package DSA.Personal_Expr_Questions.Basics;

public class MissingElement {

    public static void main(String[] args) {

        // Sorted the array
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length;

        // n(n+1)/2 where n is the max no in the array
        int sum = (arr[n - 1]) * ((arr[n - 1]) + 1) / 2;    // =>    6 (6+1)/2
        System.out.println(sum);
        for (int number : arr) {
            sum = sum - number;
        }

        System.out.println("Missing No : " + sum);
    }
}
