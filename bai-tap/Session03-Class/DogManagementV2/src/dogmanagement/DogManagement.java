package dogmanagement;

// Mượn khuôn tên "Dog" ở trong ngăn tủ (package) "data",
// tương đương với #include <stdio.h>
import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        
        Dog cauVang = new Dog("Cậu Vàng", 1943, 12.0);
        cauVang.bark();
        
        Dog ngaoDa = new Dog("Ngáo Đá", 2021, 1.0);
        ngaoDa.bark();
        
        System.out.println("\nShow all info by using toString() method\n");
        
        String cauVangDetail = cauVang.toString();
        System.out.println("Cậu Vàng details: " + '\n' + cauVangDetail);
        
        
        System.out.println("Ngáo Đá details: " + '\n' + ngaoDa.toString());
        
        // Hiện tượng lạ: không cần gọi phương thức toString()
        //                nhưng vẫn có thể sử dụng
        //                thông qua tên của đối tượng
        System.out.println("Check the toString() method");
        System.out.println("Cậu Vàng details: " + '\n' + cauVang);
        System.out.println("Ngáo Đá details: " + '\n' + ngaoDa);
        
        // In ra tuổi, giao tiếp với đối tượng thông qua việc gọi
        System.out.println("Ngáo Đá age: " + ngaoDa.getAge());
    }
    
}
