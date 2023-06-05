package data;

// Khuôn để chứa các mô tả chi tiết về đối tượng,
// nhóm các đối tượng chia sẻ chung nhiều đặc điểm
public class Dog {
    // Vì đây là khuôn, mà khuôn phải kín,
    // nên code phải được viết hoàn toàn trong class,
    // nếu viết bên ngoài thì xem như vật liệu đổ ra ngoài
    
    // Tạo sẵn biểu mẫu và chừa chỗ để điền thông tin
    private String name;
    private int yob;
    private double weight;
    
    // Vì khuôn kín nên phải có phểu để đổ nguyên liệu vào
    // và lấp đầy các chi tiết mà bên trong đã được chừa chỗ sẵn
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    
    public void bark() {
//        System.out.println("bark bark bark... my name is: " + name);
//        System.out.println("bark bark bark... my yob is: " + yob);

        System.out.printf("| Bark bark bark | %-10s | %4d | %4.1f |\n",
                            name, yob, weight);
    }
    
    // Hàm để gọi lại nhiều lần trên từng đối tượng riêng biệt,
    // cho phép chính sửa thông tin của đối tượng
    // so với những thông tin được cho ban đầu
    public void updateWeight(double newWeight) {
        weight = newWeight;
    }
    
    // Hàm cho phép lấy riêng năm sinh
    public int getYob() {
        return yob;
    }    
}
