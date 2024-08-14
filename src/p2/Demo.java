// Package Level Modularization
package p2;
import  p1.Cuboid;

public class Demo {
    public static void main(String[] args) {
        Cuboid.length = 6.6;
        Cuboid.breadth = 4.4;
        Cuboid.height = 3.3;
        System.out.println("Volume is: " + Cuboid.volume());
    }
}
