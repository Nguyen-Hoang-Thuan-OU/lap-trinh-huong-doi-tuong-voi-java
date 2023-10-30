package data;

// Khuôn Con "Tam giác vuông"
// kế thừa từ khuôn Cha "Tam giác"
public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }
    
    @Override
    public void paint() {
        System.out.printf("| R-TRIANGLE| %-15s | %-10s | %4.1f | %4.1f |   -  | %7.2f |\n",
                owner, color, a, b, getArea());
    }
}
