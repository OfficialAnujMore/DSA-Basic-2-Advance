package Recurssion;

public class $2Palindrome {

    private Boolean result(String str) {
        int strLen = str.length();
        if (strLen == 0 || strLen == 1)
            return true;

        if (str.charAt(0) != str.charAt(strLen - 1))
            return false;

        return result(str.substring(1, strLen - 1));
    }

    public static void main(String[] args) {
        $2Palindrome obj = new $2Palindrome();
        String str = "kayak";
        System.out.format("Result of %s is %b", str, obj.result(str));
    }

}
