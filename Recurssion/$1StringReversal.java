package Recurssion;

public class $1StringReversal {

    private String result(String str) {
        if (str == "") {
            return str;
        }

        return result(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "This is an apple";
        $1StringReversal obj = new $1StringReversal();
        System.out.println("Reverersal string is :- " + obj.result(str));

    }

}
