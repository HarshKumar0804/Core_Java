// Method Level Modularization
public class Sample {
    static double length;
    static double breadth;
    static double height;

    public static double volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        length = 6.6;
        breadth = 4.4;
        height = 3.3;

        System.out.println("Volume: " + volume());
    }
}
