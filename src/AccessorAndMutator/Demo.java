package AccessorAndMutator;

public class Demo {
    public static void main(String[] args) {

        // Create an object
        Cuboid c1 = new Cuboid();
        c1.setLength(12.6);
        c1.setBreadth(4.4);
        c1.setHeight(3.3);
        System.out.println(c1.getLength());
        System.out.println(c1.getBreadth());
        System.out.println(c1.getHeight());

        System.out.println("Volume is " + c1.volume());

        // Q.) Implementing toString method
        System.out.println(c1);

    }
}


