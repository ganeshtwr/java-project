package DSA.Personal_Expr_Questions.Basics;

// Test Case 1 { 1, 1, 2, 1 } , Output = 1 (1)
// Test Case 2 { 1, 1, 4, 1, 4, 4 } , Output = 4 (1,4) => Max no will be returned

class MajorityElement {

    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

// Maintain the maxCount/index & update maxCount if count of current
// element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

// if maxCount is greater than n/2 return the corresponding element
        if (maxCount > n / 2)
            System.out.println("Majority Element : " + arr[index]);

        else
            System.out.println("No Majority Element");
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
        findMajority(arr, n);
    }
}
