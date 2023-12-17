public class $5VowelsAndConsonants {

    private static void result(String str) {

        final char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
        int vowel = 0, consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean isVowel = false;
            for (char c : vowels) {
                if (c == str.charAt(i)) {
                    vowel++;
                    break;
                }
            }
            if (!isVowel) {
                consonant++;
            }
        }
        System.out
                .println("In string " + str + " there are vowels and consonants as follows " + vowel + " & " + consonant
                        + "\n");

    }

    public static void main(String[] args) {

        final String[] data = { "Anuj", "Ron", "Ice Age", "predAtor", "Dmart HoMeS" };

        for (String string : data) {
            result(string);

        }
    }

}
