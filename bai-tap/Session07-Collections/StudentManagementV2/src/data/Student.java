package data;



// Trừu tượng: chỉ quan tâm đến mã số, tên, năm sinh,
//                              chuyên ngành, điểm trung bình

// Đóng gói: sử dụng khuôn + đặc điểm + hành vi
//           để che giấu đi thông tin của đối tượng
//           và chỉ hiển thị ra khi cần thiết
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
//    }
    
    public void showProfile() {
        System.out.printf("| %-8s | %-25s| %4d | %4.1f |\n",
                id, name, yob, gpa);
    }
}
