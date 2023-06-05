package data;

// Hình vuông là một hình chữ nhật,
// mà hình chữ nhật lại kế thừa từ hình học
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("| SQUARE    | %-10s | %-10s | %-10s | %4.1f |       | %7.2f |\n",
                owner, color, borderColor, a, getArea());
    }
    
    // Hàm khác biệt hoàn toàn so với Cha và Ông
    public void sayHi() {
        System.out.println("Nephew here!!!");
    }
}
