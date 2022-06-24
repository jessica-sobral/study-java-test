package demogradle;

public class Square {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.setSide(side);
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public void setSide(double side) {
        if(side > 0)
            this.side = side;
        else
            throw new IllegalArgumentException("The side of the square must be greater than zero.");
    }

    public double getSide() {
        return side;
    }
}
