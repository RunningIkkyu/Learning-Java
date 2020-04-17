class WaterSource {

    private String s;

    WaterSource() {
        System.out.println("Constructor of WaterSource");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private WaterSource source = new WaterSource();
    private int i;
    public String toString() {
        return "i = " + i + " source = " + source;
    }
    public static void main(String[] args) {
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);
    }
}
