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

        System.out.println("SQUARES");

        Square q1 = new Square();
        q1.setSide(5);
        System.out.println(q1.getSide());

        Square q2 = new Square(10);
        System.out.println(q2.getSide());
    }
}
