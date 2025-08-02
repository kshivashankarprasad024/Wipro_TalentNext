public class ToggleCase {
    public static void main(String[] args) {
        char ch = 'a';
        if (Character.isUpperCase(ch))
            ch = Character.toLowerCase(ch);
        else if (Character.isLowerCase(ch))
            ch = Character.toUpperCase(ch);

        System.out.println("Toggled character: " + ch);
    }
}
