package data;

public class RightTriangle extends Triangle {

    public RightTriangle(double sideA, double sideB) {
        super(sideA, sideB, Math.sqrt(sideA * sideA + sideB * sideB));
    }
    
//    public double findHypotenuse() {
//        double sideC;
//        sideC = (Math.pow(sideA, 2) + Math.pow(sideB, 2));
//        return sideC;
//    }

    @Override
    public void showInfo() {
        System.out.printf("| RIGHT TRIANGLE | %4.1f | %4.1f |   -  | %6.3f |\n",
                sideA, sideB, getArea());
    }
}
