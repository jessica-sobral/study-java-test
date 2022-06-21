package demogradle;

public class App {
    public String getGretting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGretting());
    }
}
