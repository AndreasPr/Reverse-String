/**
 * Created on 24/Jan/2021 to Reverse-String
 */
public class ReverseString {


    static void reverseStringInput(String str){
        StringBuilder newString = new StringBuilder();
        for(int i = str.length()- 1; i >= 0; --i){
            newString.append(str.charAt(i));
        }
        System.out.println(newString);
    }

    public static void main(String args[]){
        String str = "Andreas";
//        char[] convertStringToArray = str.toCharArray();
        reverseStringInput(str);
    }
}
