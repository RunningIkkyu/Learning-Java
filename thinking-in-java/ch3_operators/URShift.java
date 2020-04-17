
public class URShift {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(Integer.toBinaryString(i));
        i <<= 10;
        System.out.println(Integer.toBinaryString(i));
        i >>= 2;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 3;
        System.out.println(Integer.toBinaryString(i));
    }
}
