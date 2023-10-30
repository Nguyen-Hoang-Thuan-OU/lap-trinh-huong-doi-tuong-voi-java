package studentprofile;

import java.util.Scanner;


// Thử nghiệm: không sử dụng kỹ thuật lập trình hướng đối tượng
//             (không có class, không new để tạo mới đối tượng)
//             mà chỉ tập trung vào việc nhập dữ liệu từ bàn phím
//             và kiểm tra các vấn đề khi nhập

public class StudentProfile {

    public static void main(String[] args) {
        inputAProfile();
    }
    
    // Hàm nhập vào thông tin sinh viên: tên, năm sinh, địa chỉ
    // và sau đó in ra kết quả
    public static void inputAProfile() {
        String name, address;
        int yob;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
        //yob = sc.nextInt();
        // Để lại rác cho câu lệnh đến sau
        // (dấu cách - space hoặc dấu xuống hàng - enter)
        
        // Tà đạo
        //sc.nextLine();
        
        // Chánh đạo
        //String tmpNum = sc.nextLine();
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("");
        System.out.println("Here is your profile:");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("----------END OF PROFILE----------");
    }
}
