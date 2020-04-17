import java.util.*;

public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random();
        float f[] = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for (float i : f) {
            System.out.println(i);
        }
    }
}
