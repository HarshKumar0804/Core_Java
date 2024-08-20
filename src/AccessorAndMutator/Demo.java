package AccessorAndMutator;

public class Demo {
    public static void main(String[] args) {

        // Create an object
        Cuboid c1 = new Cuboid();
        c1.setLength(12.6);
        c1.setBreadth(4.4);
        c1.setHeight(3.3);
        System.out.println("Length: " + c1.getLength());
        System.out.println("Breadth: " + c1.getBreadth());
        System.out.println("Height: " + c1.getHeight());

        System.out.println("Volume is " + c1.volume() + " sq meters");
//
//        // Q.) Implementing toString method
//        System.out.println(c1);

        Cuboid c2 = new Cuboid();
        if (c2.setLength(6.6) != true) {
            System.out.println("Invalid Length");
        }
        if (c2.setBreadth(5.5) != true) {
            System.out.println("Invalid Breadth");
        }
        if (c2.setHeight(2.2) != true) {
            System.out.println("Invalid Height");
        }
        System.out.println("Length: " + c2.getLength());
        System.out.println("Breadth: " + c2.getBreadth());
        System.out.println("Height: " + c2.getHeight());

        System.out.println("Volume is " + c2.volume() + " sq meters");

    }
}


