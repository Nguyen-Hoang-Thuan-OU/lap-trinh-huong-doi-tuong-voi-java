package data;

// Là khái niệm chung cho mọi loại hình học
public abstract class Shape {
    
    // Những đặc điểm chung nhất,
    // sử dụng cho tất cả các loại hình học
    protected String owner;
    protected String color;
    protected String borderColor;

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
    
    // Hình học chắc chắn sẽ có Diện tích và Chu vi,
    // còn tính bằng công thức nào
    // thì còn phụ thuộc vào từng hình
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // Tuỳ loại hình học khác nhau
    // mà cách hiển thị cũng sẽ khác nhau
    public abstract void paint();
}
