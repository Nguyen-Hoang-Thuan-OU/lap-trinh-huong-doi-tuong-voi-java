package data;

// Thuỷ tổ của các loại hình học
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    
    // Mỗi dạng hình học khác nhau
    // sẽ phải tự cụ thể hoá những thuộc tính này
    //protected double a, b, c, radius;

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    // Yêu cầu phải có dữ liệu từ trước
    // nếu muốn tính được chu vi và diện tích
    
//    public double getArea() {
//        return 0;
//    }
//    
//    public double getPrimeter() {
//        return 0;
//    }
    
    // Tư duy về hình học nói rằng
    // hình học phải có đường nét và bề mặt,
    // nên chắc chắn sẽ tính được chu vi và diện tích
    // (dù có phải sử dụng đến tích phân),
    // còn kết quả cụ thể chưa cần quan tâm vội
    //  -> Hình học chắc chắn sẽ có chu vi và diện tích
    
    // Hình học là một khái niệm chung chung,
    // nhưng vẫn có tồn tại,
    // nên chu vi và diện tích của hình học
    // cũng chỉ nằm ở mức ý tưởng
    //  -> Các hàm trừu tượng để nói về khái niệm cần đo đạc,
    //     còn kết quả sẽ do nơi nắm giữ thông tin xử lý
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // Kéo theo đó, việc vẽ / hiển thị mỗi hình
    // cũng sẽ khác nhau,
    // nên chỉ cần thông báo ở mức ý tưởng
    public abstract void paint();
 }
