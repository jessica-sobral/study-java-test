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

//        Square s1 = new Square(5);
//        System.out.println("Square 1\nSide: " + s1.getSide());
//        System.out.println("Area: " + s1.calculateArea());
//        System.out.println("Perimeter: " + s1.calculatePerimeter());

//        Square s2 = new Square(10);
//        System.out.println("\nSquare 2\nSide: " + s2.getSide());
//        System.out.println("Area: " + s2.calculateArea());
//        System.out.println("Perimeter: " + s2.calculatePerimeter());

//        Rectangle r1 = new Rectangle(5, 10);
//        System.out.println("\nRectangle 1\nBase: " + r1.getBase());
//        System.out.println("Height: " + r1.getHeight());
//        System.out.println("Area: " + r1.calculateArea());
//        System.out.println("Perimeter: " + r1.calculatePerimeter());

//        Rectangle r2 = new Rectangle(15, 20);
//        System.out.println("\nRectangle 2\nBase: " + r2.getBase());
//        System.out.println("Height: " + r2.getHeight());
//        System.out.println("Area: " + r2.calculateArea());
//        System.out.println("Perimeter: " + r2.calculatePerimeter());

//        Account a1 = new Account(1, 150.00);
//        a1.deposit(35.50);
//        System.out.println("\nAccount 1\nId: " + a1.getId());
//        System.out.println("Balance: " + a1.getBalance());
//        System.out.println("Limit: " + a1.getLimit());

//        Account a2 = new Account(2, 150.00);
//        a2.deposit(50.00);
//        System.out.println("\nAccount 2\nId: " + a2.getId());
//        System.out.println("Balance: " + a2.getBalance());
//        System.out.println("Limit: " + a2.getLimit());
    }
}
