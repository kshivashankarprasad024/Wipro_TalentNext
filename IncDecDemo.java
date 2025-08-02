public class IncDecDemo {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Post Increment: " + (a++)); // 5
        System.out.println("After Post Increment: " + a); // 6
        System.out.println("Pre Increment: " + (++a)); // 7
        System.out.println("Post Decrement: " + (a--)); // 7
        System.out.println("After Post Decrement: " + a); // 6
        System.out.println("Pre Decrement: " + (--a)); // 5
    }
}
