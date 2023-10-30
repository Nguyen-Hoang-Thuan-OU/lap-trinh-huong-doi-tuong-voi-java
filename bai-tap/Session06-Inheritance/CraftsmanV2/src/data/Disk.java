package data;

public class Disk {
    public static final double PI = 3.14;
    
    private String owner;
    private String color;
    private String smile; // Biểu tượng cảm xúc
    private double radius;

    public Disk(String owner, String color, String smile, double radius) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = radius;
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

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", smile=" + smile + ", radius=" + radius + '}';
    }
    
    // Hàm loại 4,
    // chỉ trả về kết quả chứ không in ra
    public double getArea() {
//        return 3.14 * radius * radius;
//        return Math.PI * Math.pow(radius, 2); // Chính xác hơn
        return Disk.PI * Math.pow(radius, 2);
    }
    
    // Sao chép và dán
    public void paint() {
        System.out.printf("| DISK      | %-15s | %-10s | %4.1f | %4s | %7.2f |\n",
                owner, color, radius, smile, getArea());
    }
}
