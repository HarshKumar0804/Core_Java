package AccessorAndMutator;

public class Cuboid {
    // Private Data Members
    private double length;
    private double breadth;
    private  double height;

    // Accessor and Getter Methods
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    // Mutator and Setter Methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method calling
    public double volume() {
        return length * breadth * height;
    }

    public String toString(){
        String s = "".format("Length: %.2f\nBreadth: %.2f\nHeight: %.2f\nVolume: %.2f", this.getLength(), this.getBreadth(), this.getHeight(), this.volume());
        return s;
    }
}
