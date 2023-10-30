package data;

public class Triangle {

    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + '}';
    }

    public double getArea() {
        double p;
        p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public void showInfo() {
        System.out.printf("| TRIANGLE       | %4.1f | %4.1f | %4.1f | %6.3f |\n",
                sideA, sideB, sideC, getArea());
    }
}
