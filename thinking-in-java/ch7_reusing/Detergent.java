// Inheritance syntax & properties.


class Cleanser {
    private String s = "Cleanser";

    public void append(String t) {
        s += t;
    }

    public void first() {
        append(" first");
    }

    public void second() {
        append(" second");
    }

    public String toString() {
        return s;
    }
}


public class Detergent extends Cleanser {
    public void second() {
        append(" 222222");
        super.second();
    }
    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.first();
        detergent.second();
        System.out.println(detergent);
    }
}



