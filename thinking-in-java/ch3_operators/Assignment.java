import java.util.*;

class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + 
                           ", t2.level: " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + 
                           ", t2.level: " + t2.level);
        t1.level = 28;
        System.out.println("3: t1.level: " + t1.level + 
                           ", t2.level: " + t2.level);
    }
}

// 1: t1.level: 9, t2.level: 47
// 2: t1.level: 47, t2.level: 47
// 3: t1.level: 28, t2.level: 28

