package craftsman;

import data.Disk;
import data.Rectangle;
import data.RightTriangle;
import data.Square;
import data.Triangle;

public class Craftsman {

    public static void main(String[] args) {
//        cutShapes();
//        sortShapes();
//        playWithChildSquare();
        playWithTriangle();
    }
    
    // Làm thêm về kế thừa - Hình tam giác
    public static void playWithTriangle() {
        
        // Khai báo khuôn Cha, sử dụng khuôn Cha
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint();
        
        // Khai báo khuôn Con, new() khuôn Cha -> SAI
//        RightTriangle rt1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        
        // Khai báo khuôn Con, sử dụng khuôn Con
        RightTriangle rt1 = new RightTriangle("MÁ", "PINK", 6, 8);
        rt1.paint();
        
        // Khai báo khuôn Cha, new() khuôn Con -> ĐÚNG
        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6, 8);
        rt2.paint(); // Danh nghĩa của Cha, nhưng Con sẽ xử lý
    }
    
    // Thử nghiệm về kế thừa - Hình chữ nhật
    public static void playWithChildSquare() {
        
        // Hình vuông là hình vuông
        // và cũng ngầm là hình chữ nhật
        Square s1 = new Square("TÍA", "PINK", 5.0);
        s1.paint(); // In ra hình chữ nhật
                    // do đang sử dụng ké của Cha
        
        // Hình chữ nhật là hình chữ nhật
        Rectangle r1 = new Rectangle("MÁ", "PINK", 7.0, 8.0);
        r1.paint();
        
        // Hình vuông là một hình chữ nhật đặc biệt
        Rectangle s2 = new Square("BÉ NA", "RAINBOW", 10.0);
        s2.paint(); // Hàm của Cha,
                    // nhưng con sẽ được gọi
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
        
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);
        
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
