/*
 * Input: originalString = "GeeksGeeks", 
 * stringToBeInserted = "For", 
 * index = 4
 * Output: "GeeksForGeeks"
 * 
 * The time complexity of this code is O(n), where n is the length of the originalString. This is because the code uses the substring method twice, which takes O(n) time in total.
 * The space complexity of this code is O(n), where n is the length of the originalString. This is because the code creates a new string by concatenating the originalString, stringToBeInserted, and the two substrings. The space required for the new string is proportional to the length of the originalString.
 */

package Strings;

public class $1StringInsertion {

    private static String result(String originalString, String stringToBeInserted, int index) {
        return originalString.substring(0, index + 1) + stringToBeInserted + originalString.substring(index);

    }

    public static void main(String[] args) {
        String originalString = "GeeksGeeks", stringToBeInserted = "For";
        int index = 4;
        System.out.println(result(originalString, stringToBeInserted, index));
    }

}
