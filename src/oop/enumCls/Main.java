package oop.enumCls;

public class Main {
    Level level;

    Main(Level level) {
        this.level = level;
    }

    public static void main(String[] args) {
        Main enum1 = new Main(Level.PREMIUM);
        System.out.println(enum1.level.getDescription());
    }
}
