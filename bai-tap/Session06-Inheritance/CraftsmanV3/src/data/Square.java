package data;

// Hình vuông là một dạng đặc biệt của hình chữ nhật,
// có thể được nằm trong mảng các hình chữ nhật
//  -> Hình vuông là một phiên bản mới của hình chữ nhật
//  => Khuôn hình chữ nhật cũng sẽ là khuôn của hình vuông
public class Square extends Rectangle {

    // Hình chữ nhật đã có sẵn các thuộc tính,
    // nên hình vuông không cần thiết kế lại
    // (mặc định sẽ được thừa hưởng),
    // chỉ cần thiết kế lại phễu tương ứng với hình vuông
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("| SQUARE    | %-15s | %-10s | %4.1f |   -  | %7.2f |\n",
                owner, color, width, getArea());
    }
}
