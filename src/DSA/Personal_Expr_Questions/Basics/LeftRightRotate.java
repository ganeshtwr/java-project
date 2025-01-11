package DSA.Personal_Expr_Questions.Basics;

public class LeftRightRotate {

    public static void main(String[] args) {

        // Same address will be used
        String s1 = "GeeksforGeeks";
        String s2 = "GeeksforGeeks";
        int r = 2;
        while (r > 0) {
            s1 = s1.substring(1) + s1.charAt(0);
            s2 = s2.charAt(s2.length() - 1) + s2.substring(0, s2.length() - 1);
            r--;
        }
        System.out.println("Left Rotation  : " + s1);
        System.out.println("Right Rotation : " + s2);
    }
}
