package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {

    public static void main(String[] args) {
        playWithParent();
    }
    
    public static void playWithParent() {
        
        // Khai Cha, new() Cha
        Parent p = new Parent("BIỆT THỰ", "1000BTC");
        p.showProfile();
        
        // Khai Con, new() Con
        Child c1 = new Child("NHÀ PHỐ", "1000ETH");
        c1.showProfile();
        c1.sayHi();
        
        // Khai Cha, new() Con
        Parent c2 = new Child("CĂN HỘ", "DOGECOIN");
        c2.showProfile();
        // Cha không thể thấy hàm riêng của Con
//        c2.sayHi();
    }
    
}
