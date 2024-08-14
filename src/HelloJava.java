public class HelloJava {
    public static void main(String[] args) {

        System.out.println("Welcome Back to OOPS through Java!");

        // Creating Object of Square
        Square sq = new Square();
        // sq.side = 12.5;
        sq.setSide(12.5);
        double a = sq.area();
        System.out.println("The area of the square is: " + a + " sq meters");
        double b = sq.perimeter();
        System.out.println("The perimeter of the square is: " + b + " meters");

        // Creating Object of Rectangle
        Rectangle rect = new Rectangle();
        rect.setLength(2.5);
        rect.setBreadth(1.5);
        double area = rect.area();
        System.out.println("The area of the rectangle is: " + area + " sq meters");
        double peri = rect.perimeter();
        System.out.println("The perimeter of the rectangle is: " + peri + " meters");
    }
}
