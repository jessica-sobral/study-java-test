package demogradle;

public class Rectangle {
    private double base;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double base) {
        this.setBase(base);
    }

    public Rectangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    public double calculateArea() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + height);
    }

    public void setBase(double base) {
        if(base > 0)
            this.base = base;
        else
            throw new IllegalArgumentException("The base of the triangle must be greater than zero.");
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("The height of the triangle must be greater than zero.");
    }

    public double getHeight() {
        return height;
    }
}
