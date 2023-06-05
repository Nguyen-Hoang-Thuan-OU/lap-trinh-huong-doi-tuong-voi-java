package data;

// Sẽ tiện lợi hơn
// khi hình vuông được kế thừa từ hình chữ nhật
// thay vì kế thừa từ hình học
public class Square extends Rectangle {
    
    // Hoàn toàn giống với hình chữ nhật,
    // không có điểm gì khác biệt kể cả cạnh góc vuông,
    // vì đây dù sao vẫn là chiều dài và chiều rộng

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("| %-9s | %-10s | %-10s | %-10s | %4.1f |   -  | %7.2f |\n",
                "SQUARE", owner, color, borderColor, a, getArea());
    }
}
