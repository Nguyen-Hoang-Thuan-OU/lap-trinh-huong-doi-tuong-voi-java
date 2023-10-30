package main;

import data.Student;

public class Stage {
    
    public static void main(String[] args) {
        Student ahihi = checkObjectV8();
        ahihi.setName("Ơ KÌA");
        ahihi.showProfile();
        
        checkObjectV8().showProfile();
//        checkObjectV7();
    }
    
    // Hàm trả về một đối tượng (toạ độ của một đối tượng),
    // chứ không phải trả về một giá trị đơn giản
    public static Student checkObjectV8() {
        
        // Biến con trỏ nằm trong Stack
        Student s1;
        
        // Vùng new nằm trong Heap
        s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        
        // Sử dụng return để ném toạ độ vùng new ra bên ngoài hàm
        return s1;
    }
    
    // Khai báo biến trước, rồi sau đó mới gán giá trị
    // (bí mật sẽ được bất mí sau)
    public static void checkObjectV7() {
        
        // Khai báo biến con trỏ x, nhưng chưa trỏ đến ai
        Student s1;
        s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        s1.showProfile();
    }
    
    // Câu chuyện về những người anh hùng vô danh,
    // chưa kịp biết quý danh thì đã đi mất
    // (Anonymous Object)
    public static void checkObjectV6() {
        Student s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        s1.showProfile();
        
        s1.setName("KHÓ HIỂU QUÁ");
        s1.showProfile();
        
        new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8).showProfile();
        
    }
    
    // Câu chuyện hai chàng và một nàng
    // (hai con trỏ cùng nhớ về cùng một địa chỉ)
    //  -> Cùng một giá trị nhưng có nhiều biến trỏ đến
    public static void checkObjectV5() {
        Student s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        Student s2 = s1;
        // Cả s1 và s2 đều lưu cùng một toạ độ

	s1.showProfile();
	s2.showProfile();
        
        s1.setName("Ú OÀ");
        System.out.println("After 'a little violent'");
	s2.showProfile();
	s1.showProfile();
    }
    
    // Quyết tâm không thể để toạ độ quý giá bị mất
    // bằng cách sao lưu lại toạ độ của đối tượng
    public static void checkObjectV4() {
        Student s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        
        // Sao lưu lại toạ độ cũ trước khi thay đổi toạ độ mới,
        // giúp cho vùng "s1" không bị bộ thu gom rác hốt đi mất
        
        // Lúc này, tuy x cũng là biến đối tượng,
        // nhưng thay vì tự new để có giá trị (địa chỉ)
        // thì x lại đi sử dụng ké đồ có sẵn của s1
        Student x = s1;
        
        // s1 bỏ AN theo BÌNH, còn x thì vẫn là AN của ngày hôm qua
        s1 = new Student("SE662204", "BÌNH LÊ BẤT TỬ", 2004, 0.4);
        
        s1.setName("CÓ LÒNG TIN");
        s1.showProfile();
        
        // AN NGUYỄN LỘC PHÁT trở lại
        x.showProfile();
    }
    
    // Kiểm tra xem liệu có thể xảy ra hiện tượng
    // mất dấu toạ độ vùng new hay không
    public static void checkObjectV3() {
        Student s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        
        // Mất toạ độ vùng RAM "LỘC PHÁT"
        // do "có mới nới cũ"
        s1 = new Student("SE662204", "BÌNH LÊ BẤT TỬ", 2004, 0.4);
        
        s1.showProfile();
        
        // Câu lệnh dọn rác phía hậu trường
        System.gc();
    }
    
    // Kiểm tra xem khi new trùng thông tin
    // thì đây cùng là 1 hay là 2 vùng RAM khác nhau
    public static void checkObjectV2() {
        // Thông tin có thể bị trùng nhau,
        // nhưng vẫn là hai đối tượng độc lập
        // (với hai vùng RAM độc lập)
        Student s1 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        Student s2 = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        
        s1.showProfile();
        s2.showProfile();
        
        s1.setName("AI RỒI CŨNG KHÁC");
        
        s1.showProfile();
        s2.showProfile();
        
        // Gọi thầm toString();
        System.out.println("Check duplication if any?");
        System.out.println(s1);
        System.out.println(s2);
    }
    
    // Hàm main() cũ nhưng đã được đổi tên
    public static void checkObjectV1() {
        Student an = new Student("SE686868", "AN NGUYỄN LỘC PHÁT", 1998, 6.8);
        Student binh = new Student("SE662204", "BÌNH LÊ BẤT TỬ", 2004, 0.4);
        an.showProfile();
        
        an = new Student("SE666789", "ĐẠI GIA", 2000, 9.9);
        an.showProfile();
        
        System.gc();
        
        new Student("SE666789", "ĐẠI GIA", 2000, 9.9).showProfile();
    }
    
}
