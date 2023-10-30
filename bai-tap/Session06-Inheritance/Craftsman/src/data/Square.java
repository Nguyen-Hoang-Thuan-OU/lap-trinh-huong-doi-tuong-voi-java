package data;

public class Square {
    private String owner;
    private String color;
    private double edge; // Hai cạnh kề bằng nhau

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" + "owner=" + owner + ", color=" + color + ", edge=" + edge + '}';
    }
    
    // Hàm loại 4,
    // chỉ trả về kết quả chứ không in ra
    public double getArea() {
//        return edge * edge;
        return Math.pow(edge, 2);
    }
    
    // Sao chép và dán
    public void paint() {
        System.out.printf("| SQUARE    | %-15s | %-10s | %4.1f |   -  | %7.2f |\n",
                owner, color, edge, getArea());
    }
}
