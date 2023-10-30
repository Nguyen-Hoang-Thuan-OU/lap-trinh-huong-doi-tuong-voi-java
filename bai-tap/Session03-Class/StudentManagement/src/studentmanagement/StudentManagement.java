package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

 public static void main(String[] args) {
        saveStudents();
        //saveAStudent();
        //inputAStudent();
    }
    
    // Nhập thông tin từ bàn phím
    public static void inputAStudent() {
        // Các biến cục bộ để nhận dữ liệu nhập vào từ bàn phím
        // sẽ được lưu trữ trong Stack
        // chứ không giống như các biến ở hàm khởi tạo
        String id, name;
        int yob;
        double gpa;
        Scanner myKeyboard = new Scanner(System.in);
        
        System.out.printf("Input id: ");
        id = myKeyboard.nextLine();
        
        // Java cũng bị lạc trôi lệnh giống như C
        // khi nhập chuỗi sau số hoặc sau chuỗi khác
        System.out.printf("Input name: ");
        name = myKeyboard.nextLine();
        
        System.out.printf("Input yob: ");
        yob = myKeyboard.nextInt();
        
        System.out.printf("Input gpa: ");
        gpa = myKeyboard.nextDouble();
        
        // Đã có dữ liệu nhập từ bàn phím,
        // bây giờ tiến hành đổ vào đối tượng
        
        // Các biến chứa dữ liệu (được nhập từ bàn phím)
        // sẽ được tự động truyền vào lớp Student
        // (Giống như nhấn nút lưu khi điền biểu mẫu)
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
    // Gán sẵn giá trị sinh viên
    public static void saveStudents() {
        Student an = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        an.showProfile();
        
        Student binh = new Student("SE662204", "BÌNH LÊ BẤT TỬ", 2004, 0.4);
        
        an.showProfile();
        binh.showProfile();
        
        System.out.println("Check the public/private");
        
        an.name = "EM KHÔNG THÍCH HỌC BÀI";
        an.setName("EM HOK THÍCH HỌC BÀI");
        binh.name = "ĐỔI NGÀNH CŨNG LÀ LỰA CHỌN";
        
        String s = an.name;
        System.out.println("An's name (directly): " + s);
        System.out.println("An's name (directly): " + an.name);
        System.out.println("Bình's name: " + binh.getName());
        
        System.out.println("Check static");
        
        System.out.println("An yob: " + an.yob);
        System.out.println("Bình yob: " + binh.yob);
        
        System.out.println("An name: " + an.name);
        System.out.println("Bình name: " + binh.name);
        System.out.println("Student name: " + Student.name);
    }
}
