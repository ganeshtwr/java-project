package DSA.Personal_Expr_Questions.Basics;

public class EvenOddSortElement {

    public static void main(String[] args) {

        int[] a = {12, 17, 70, 15, 22, 65, 21, 90};
        int[] result = new int[a.length];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result[counter] = a[i];
                counter++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                result[counter] = a[i];
                counter++;
            }
        }

        for (int ob : result) {
            System.out.print(ob + ", ");
        }

    }
}
