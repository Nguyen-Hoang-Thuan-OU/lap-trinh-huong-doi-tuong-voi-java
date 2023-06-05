package data;

public class Dog {
    private String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void bark() {
        System.out.printf("| Bark bark bark | %-10s | %4d | %4.1f |\n",
                            name, yob, weight);
    }

    @Override
    public String toString() {
//        return "Dog{"
//                + "name=" + name
//                + ", yob=" + yob
//                + ", weight=" + weight
//                + '}';

        // Thay đổi cách hiển thị thông tin
        // của phương thức toString()
//        String tmpMsg = String.format("| Bark bark bark | %-10s | %4d | %4.1f |",
//                                        name, yob, weight);
//        return tmpMsg;

        return String.format("| Bark bark bark | %-10s | %4d | %4.1f |",
                                name, yob, weight);
    }
    
    // Ai có nhiều thông tin thì nên để người ấy xử lý
    public int getAge() {
        // Gán cứng giá trị,
        // mỗi năm đều phải quay lại đây để cập nhật lại
        return 2022 - yob;        
    }
}
