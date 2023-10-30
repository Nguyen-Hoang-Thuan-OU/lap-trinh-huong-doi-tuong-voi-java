package data;

public class Rectangle extends Shape {
    // Sử dụng protected để Con (hình vuông) kế thừa tiếp
    protected double a; // Width
    protected double b; // Length

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + ", b=" + b + ", o = " + owner + '}';
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
    
    @Override
    public void paint() {
        System.out.printf("| RECTANGLE | %-10s | %-10s | %-10s | %4.1f | %4.1f | %7.2f |\n",
                owner, color, borderColor, a, b, getArea());
    }
}
