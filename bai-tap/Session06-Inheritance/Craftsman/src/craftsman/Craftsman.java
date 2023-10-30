package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

public class Craftsman {

    public static void main(String[] args) {
        cutShapes();
//        sortShapes();
    }
    
    // Sắp xếp các hình theo diện tích
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        
        Rectangle rectArr[] = new Rectangle[9];
        
        rectArr[0] = r1;
//        rectArr[0].paint();
//        
//        rectArr[0].setOwner("TÍA YÊU!!!");
//        System.out.println("Minh chứng cho hai chàng, một nàng");
//        r1.paint();

        rectArr[1] = new Rectangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOWN", 2.0, 2.0);
        
        // Hình vuông CHƯA PHẢI là hình chữ nhật
//        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);
        
        System.out.println("Before sorting ascending:");
        
        // Toang vì gặp null pointer
//        for (Rectangle x : rectArr) {
//            x.paint(); // rectArr[i].paint()
//        }
        
        for (int i = 0; i < rectArr.length; i++) {
            rectArr[i].paint();
        }
        
        // Thực hiện sắp xếp
        for (int i = 0; i < (rectArr.length - 1); i++) {
            for (int j = i + 1; j < rectArr.length; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle tmp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = tmp;
                }
            }
            
        }
        
        System.out.println("After sorting ascending: ");
        for (int i = 0; i < rectArr.length; i++) {
            rectArr[i].paint();
        }
    }
    
    // Không sử dụng hướng đối tượng,
    // kiểm tra việc cắt các hình của bé Na
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();
        
        Square s1 = new Square("MÁ", "PINK", 3.0);
        s1.paint();
        
        Disk d1 = new  Disk("BÉ NA", "RAINBOW", "<3", 2.0);
        d1.paint();
    }
    
}
