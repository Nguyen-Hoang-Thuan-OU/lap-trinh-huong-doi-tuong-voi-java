package data;

// Nếu chủ động làm khuôn Con riêng kế thừa từ Cha
// để sử dụng chung cho các hình
// không thể phân nhóm và không có hình dạng
// thì sẽ làm mất đi tính độc lập của mỗi hình
public class NoName extends Shape {

    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
        // Chỉ cần đảm bảo rằng diện tích là một con số,
        // còn việc tính toán hay đo dạc để ra được con số
        // chưa cần phải quan tâm vội
        return 50;
    }

    @Override
    public double getPerimeter() {
        return 40;
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
