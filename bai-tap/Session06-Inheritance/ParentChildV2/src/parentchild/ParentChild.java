package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {

    public static void main(String[] args) {
        playWithParent();
    }
    
    // Kiểm tra con trỏ đến các vùng RAM
    public static void playWithParent() {
        
        // Khai Cha, new() Cha
        Parent p = new Parent("BIỆT THỰ", "1000BTC");
        
        // Khai Con, new() Con
        Child c1 = new Child("NHÀ PHỐ", "1000ETH", "DU THUYỀN");
        c1.showProfile();
        c1.sayHi();
        
        // Khai Cha, new() Con
        Parent c2 = new Child("CĂN HỘ", "DOGECOIN", "MOTOR");
        c2.showProfile();
        // Cha không thể thấy hàm riêng của Con
//        c2.sayHi();

        // Về nguyên tắc,
        // con trỏ của Con sẽ cần một vùng new Con()
        
        // Vì vậy, ta sẽ tiến hành khai báo Con
        // và dùng con trỏ tạm để chuẩn bị lưu toạ độ,
        // sau đó ép kiểu cho Con và đưa vùng RAM
        // (vừa ép kiểu xong) vào cho con trỏ tạm
        Child x = (Child)c2;
        
        // Lúc này,
        // ta hoàn toàn có thể sử dụng con trỏ tạm
        // để thực thi các hàm của riêng Con
        x.sayHi();
    }
    
}
