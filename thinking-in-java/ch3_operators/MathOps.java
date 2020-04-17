import java.util.*;


public class MathOps{
    public static void main(String[] args) {
        Random rand =  new Random();
        int j = rand.nextInt(100);
        int k = rand.nextInt(10);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("j + k = " + (j+k));
        System.out.println("j % k = " + (j%k));
        System.out.println("j / k = " + (j/k));
        System.out.println("j - k = " + (j-k));
        System.out.println("j=j-- : " + (j--));
    }
}
