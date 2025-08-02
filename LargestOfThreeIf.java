public class LargestOfThreeIf {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;
        if (a > b && a > c)
            System.out.println("Largest is: " + a);
        else if (b > c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }
}
