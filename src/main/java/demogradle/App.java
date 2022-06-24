// ./gradlew tasks
// ./gradlew test
// ./gradlew run

package demogradle;

public class App {
    public String getGretting() {
        return "Hello, World!\n";
        // return null;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGretting());

//        Square q1 = new Square(5);
//        System.out.println("Square 1\nSide: " + q1.getSide());
//        System.out.println("Area: " + q1.calculateArea());
//        System.out.println("Perimeter: " + q1.calculatePerimeter());

//        Square q2 = new Square(10);
//        System.out.println("\nSquare 2\nSide: " + q2.getSide());
//        System.out.println("Area: " + q2.calculateArea());
//        System.out.println("Perimeter: " + q2.calculatePerimeter());

        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("\nRectangle 1\nBase: " + r1.getBase());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());

        Rectangle r2 = new Rectangle(15, 20);
        System.out.println("\nRectangle 2\nBase: " + r2.getBase());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Area: " + r2.calculateArea());
        System.out.println("Perimeter: " + r2.calculatePerimeter());
    }
}
