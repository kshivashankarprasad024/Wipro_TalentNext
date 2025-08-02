public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 's';
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) {
            System.out.println("Not a letter");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
