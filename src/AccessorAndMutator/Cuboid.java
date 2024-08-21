package AccessorAndMutator;

public class Cuboid {
    // Private Data Members
    private double length;
    private double breadth;
    private  double height;

//    // Accessor and Getter Methods
//    public double getLength() {
//        return length;
//    }
//
//    public double getBreadth() {
//        return breadth;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    // Mutator and Setter Methods
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setBreadth(double breadth) {
//        this.breadth = breadth;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    // Method calling
//    public double volume() {
//        return length * breadth * height;
//    }
//
//    public String toString(){
//        String s = "".format("Length: %.2f\nBreadth: %.2f\nHeight: %.2f\nVolume: %.2f", this.getLength(), this.getBreadth(), this.getHeight(), this.volume());
//        return s;
//    }

    // Customize accessor and mutator
    public String getLength() {
        return length + " meters";
    }
    public String getBreadth() {
        return breadth + " meters";
    }
    public String getHeight() {
        return height + " meters";
    }

    public boolean setLength(double length) {
        if(length >= 1.0) {
            this.length = length;
            return true;
        }
        return false;
    }
    public boolean setBreadth(double breadth) {
        if(breadth >= 1.0) {
            this.breadth = breadth;
            return true;
        }
        return false;
    }
    public boolean setHeight(double height) {
        if(height >= 1.0) {
            this.height = height;
            return true;
        }
        return false;
    }
    public double volume() {
        return length * breadth * height;
    }

    public String toString(){
        String s = "".format("Length: %s\nBreadth: %s\nHeight: %s\nVolume: %s", this.getLength(), this.getBreadth(), this.getHeight(), this.volume());
        return s;
    }
}
