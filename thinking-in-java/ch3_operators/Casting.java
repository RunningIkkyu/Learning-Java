public class Casting {
    public static void main(String[] args) {
        int i = 20;
        long lng = (long)i;
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;
        System.out.println(i);
    }
}
