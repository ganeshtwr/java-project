package DSA.Personal_Expr_Questions.Basics;

public class ConvertJavaVariableToCVariable {

    public static void main(String[] args) {

    // Test Case 1 "this_is_a_variable"
    // Test Case 2 "modify_variableName"

        String str = "this_is_a_variable";
        String str2 = "modify_variableName";
        String output = javaVariable(str);
        System.out.println("C to Java Output : "+output);
        System.out.println();
        System.out.println("Java to C Output : "+cVariable(str, output));
    }

    private static String cVariable(String org, String str) {
        System.out.println("Input : "+str);
        char[] arr = str.toCharArray();
        String result = "";
        for(int i=0; i<arr.length; i++){
            if(Character.isUpperCase(arr[i]) && org.charAt(i)=='_'){
                result = result+"_"+arr[i];
                result = result.toLowerCase();
            }else{
                result = result+arr[i];
            }
        }
        return result;
    }

    private static String javaVariable(String str) {
        System.out.println("Input : "+str);
        char[] arr = str.toCharArray();
        String result = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='_'){
                i++;
                result = result+Character.toUpperCase(arr[i]);
            }else{
                result = result+arr[i];
            }
        }
        return result;
    }
}