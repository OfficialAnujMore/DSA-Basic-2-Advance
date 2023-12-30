public class $9Anagrams {
    private static boolean result(String s1, String s2) {
        boolean output = false;

        if (s1.length() != s2.length()) {
            return output;
        }
        int i = 0, j = 0, n = s1.length();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i == n - 1) {
                        output = true;
                    }
                    break;
                }
                if (j == n - 1 && !output) {
                    return output;
                }

            }

        }
        return output;
    }

    public static void main(String[] args) {
        String s1 = "CAT", s2 = "TAC";
        System.err.println(result(s1, s2));
    }

}
