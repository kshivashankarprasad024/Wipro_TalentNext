public class SwapTemp {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
