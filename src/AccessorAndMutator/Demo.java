package AccessorAndMutator;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object 1
        Cuboid c1 = new Cuboid();

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        c1.setLength(l);

        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();
        c1.setBreadth(b);

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        c1.setHeight(h);

        System.out.println("Length: " + c1.getLength());
        System.out.println("Breadth: " + c1.getBreadth());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Volume is " + c1.volume() + " sq meters");

        System.out.println(c1);

        // Object 2
        Cuboid c2 = new Cuboid();

        System.out.print("Enter Length: ");
        double l1 = sc.nextDouble();
        if (c2.setLength(l1) != true) {
            System.out.println("Invalid Length");
        }

        System.out.print("Enter Breadth: ");
        double b1 = sc.nextDouble();
        if (c2.setBreadth(b1) != true) {
            System.out.println("Invalid Breadth");
        }

        System.out.print("Enter Height: ");
        double h1 = sc.nextDouble();
        if (c2.setHeight(h1) != true) {
            System.out.println("Invalid Height");
        }

        System.out.println("Length: " + c2.getLength());
        System.out.println("Breadth: " + c2.getBreadth());
        System.out.println("Height: " + c2.getHeight());
        System.out.println("Volume is " + c2.volume() + " sq meters");

        System.out.println(c2);
    }
}


