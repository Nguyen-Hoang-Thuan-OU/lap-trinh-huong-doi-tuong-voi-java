package craftsman;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class Craftsman {

    public static void main(String[] args) {
//        playWithShapes();
        sortShapes();
    }

    // Sắp xếp các hình theo thứ tự diện tích tăng dần
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", " <3", 6.0);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", " :*", 7.0);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3.0, 4.0, 5.0);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6.0, 8.0, 10.0);

        // Đa hình - Nhiều hàm được Override
//        r1.paint(); // Khai Con = new Con(), chạy Con | RECTANGLE
//        r2.paint(); // Khai Cha = new Con(), chạy Con - Qua mặt Shape | RECTANGLE
//
//        s1.paint(); // Khai Con = new Con(), chạy Con | SQUARE
//        s2.paint(); // Khai Cha = new Con(), chạy Con - Qua mặt Rectangle | SQUARE
//        s3.paint(); // Khai ÔngTổ = new Cháu(), chay Cháu - Qua mặt Rectangle và Shape | SQUARE
//
//        d1.paint(); // Khai Con = new Con(), chạy Con | DISK
//        d2.paint(); // Khai Cha = new Con(), chạy Con - Qua mặt Shape | DISK
//
//        t1.paint(); // Khai Con = new Con(), chạy Con | TRIANGLE
//        t2.paint(); // Khai Cha = new Con(), chạy Con - Qua mặt Shape | TRIANGLE

        // Sắp xếp tăng dần theo diện tích
//        Shape box[] = new Shape[9];
//        
//        box[0] = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
//        box[1] = new Disk("", "", "", "", 3.0);
//        box[2] = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3.0, 4.0, 5.0);
//        box[3] = r1;
//        box[4] = r1;
//        box[5] = box[0];

//        Shape box[] = new Shape[] {
//            new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0),
//            new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0),
//
//            new Square("MÁ", "PINK", "MAGENTA", 7.0),
//            new Square("MÁ", "PINK", "MAGENTA", 8.0),
//            new Square("MÁ", "PINK", "MAGENTA", 9.0),
//
//            new Disk("BÉ NA", "RAINBOW", "BORDEAUX", " <3", 6.0),
//            new Disk("BÉ NA", "RAINBOW", "BORDEAUX", " <3", 7.0),
//
//            new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3.0, 4.0, 5.0),
//            new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6.0, 8.0, 10.0)
//        };
        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};

        System.out.println("The list of shapes before sorting ascending by area");
        for (Shape x : box) {
            x.paint(); // Hàm paint() của Shape
        }

        for (int i = 0; i < (box.length - 1); i++) {
            for (int j = i + 1; j < box.length; j++) {
                
                // Đa hình - nhiều hàm getArea()
                //           được Con thực thi
                if (box[i].getArea() > box[j].getArea()) {
                    Shape temp = box[i];
                    box[i] = box[j];
                    box[j] = temp;
                }
            }
        }

        System.out.println("\nThe list of shapes after sorting ascending by area");
        for (Shape x : box) {
            x.paint();
        }
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);

        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", " <3", 6.0);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", " <3", 7.0);

        r1.paint();
        r2.paint();

        d1.paint();
        d2.paint();
    }
}
