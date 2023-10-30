package thuan.util;

import java.util.Scanner;

// Class này sẽ cung cấp công cụ / thư viện (utility / library)
// sử dụng chung để những nơi khác có thể thoái mái đến lấy,
// class này cũng sẽ không có định lưu lại riêng cho nó thứ gì
//      -> Sử dụng hoàn toàn là static

public class MyToys {
    
    // public để cho phép lấy và thay đổi giá trị
    // mà không cần getter & setter
    // static để đảm bảo chỉ có một vùng RAM duy nhất được tạo ra
    // để sử dụng chung, không cần phải tạo mới đối tượng
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENT = 500;
    
    // Hàm nhập bị lặp lại nhiều lần,
    // đưa lên thành biến toàn cục
    // nhưng chỉ cho sử dụng trong nội bộ
    private static Scanner sc = new Scanner(System.in);
    
    // Thiết kế hàm có giá trị trả về,
    // vì nó không cần nhớ riêng dữ liệu
    public static int getAnInteger(String inputMsg) {
        int n;
        
        do {
            try {
                System.out.printf(inputMsg);
                //n = sc.nextLine();
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please input an integer!");
            }
        } while (true);
    }
    
    //  Thiết kế hàm nhập số nguyên từ bàn phím:
    //  - Chiều dài, rộng của HCN
    //  - Bán hình hình tròn
    //  - 3 cạnh của tam giác
    //  - Điểm thi của các môn
    //  - Cột điểm của các môn
    //  - Nhập lựa chọn
    //      -> Nhập số
    //         (Dễ bị các lỗi khi nhập: ngoài biên, trôi lệnh, ba gai.)
    //          => Viết hàm đã chặn hết các lỗi, sau đó chỉ trả về giá trị
    public static int getAnInteger() {
        // Biến nhận dữ liệu được nhập từ bàn phím
        int n;
        
        // Nhập sai, yêu cầu nhập lại
        do {
            try {
                System.out.print("Please input an integer: ");
                //n = sc.nextLine();
                n = Integer.parseInt(sc.nextLine());
                return n; // return bên trong thay vì ở cuối hàm
            } catch (Exception e) {
                System.out.println("Please input an integer!");
            }
        } while (true); // Lặp vô tận - điều kiện còn đúng là còn lặp
    }
}
