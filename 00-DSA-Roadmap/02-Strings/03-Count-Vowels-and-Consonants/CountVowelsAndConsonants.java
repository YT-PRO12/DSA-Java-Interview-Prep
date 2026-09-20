public class CountVowelsAndConsonants {

    public static void countVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowels++;

                } else {

                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println("String: " + str);

        countVowelsAndConsonants(str);
    }
}
