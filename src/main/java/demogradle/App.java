// ./gradlew tasks
// ./gradlew test
// ./gradlew run

package demogradle;

public class App {
    public String getGretting() {
        return "Hello, World!";
        // return null;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGretting());
    }
}
