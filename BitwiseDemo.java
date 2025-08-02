public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("AND: " + (a & b)); // 1
        System.out.println("OR: " + (a | b)); // 7
        System.out.println("XOR: " + (a ^ b)); // 6
        System.out.println("Left Shift: " + (a << 1)); // 10
        System.out.println("Right Shift: " + (a >> 1)); // 2
    }
}
