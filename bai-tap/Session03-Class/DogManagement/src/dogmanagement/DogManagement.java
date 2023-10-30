package dogmanagement;

// Mượn khuôn (class) tên "Dog" ở trong ngăn tủ (package) "data",
// tương đương với #include <stdio.h>
// (mượn những thư viện được viết sẵn trong ngăn tủ "stdio")
import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        
        // SinhVien hoangThuan {
        //                      name: Nguyễn Hoàng Thuận,
        //                      yob: 2000,
        //                      GPA: 2.3
        //                     }
        
        // Scanner myKeyboard = new Scanner(System.in);
        
        Dog cauVang = new Dog("Cậu Vàng", 1943, 12.0);
        cauVang.bark();
        
        Dog ngaoDa = new Dog("Ngáo Đá", 2022, 1.0);
        ngaoDa.bark();
        
        // Kiểm tra xem, sau khi đổ vào khuôn
        // thì vật liệu sau có đè mất vật liệu trước?
        // Vì tại một thời điểm,
        // một biến chỉ lưu được một giá trị
        System.out.println("Cậu Vàng barks again!");
        cauVang.bark();
        
        // Ăn nhiều thì lên cân
        cauVang.updateWeight(15.0);
        System.out.println("After online learning, Cậu Vàng's weight: ");
        cauVang.bark();
        
        // Sợ Ngáo Đá cũng lên cân
        ngaoDa.bark();
        
        // In ra năm sinh thông qua hàm
        int cauVangYob = cauVang.getYob();
        System.out.println("Cậu Vàng's yob: " + cauVangYob);
        System.out.println("Ngáo Đá's yob: " + ngaoDa.getYob());
    }
    
}
