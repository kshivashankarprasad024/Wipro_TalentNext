public class CharType {
    public static void main(String[] args) {
        char ch = '9';
        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Special character");
        }
    }
}
