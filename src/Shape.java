class Shape8 {
    public double getArea() {
        return 0.0;
    }

    public double getCircumference() {
        return 0.0;
    }
}

class Circle extends Shape8 {
    private double radius;

    Circle(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return 3.142 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.142 * radius;
    }
}

class Square extends Shape8 {
    private double side;

    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getCircumference() {
        return 4 * side;
    }
}

class Text {
    public static void main(String[] args) {
        Shape8 circle = new Circle(2.25);
        Shape8 square = new Square(5.75);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Circumference of Circle: " + circle.getCircumference());

        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getCircumference());
    }
}