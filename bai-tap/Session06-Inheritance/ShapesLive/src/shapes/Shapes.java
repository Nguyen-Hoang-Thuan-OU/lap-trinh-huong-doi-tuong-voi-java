package shapes;

// import hết tất cả các khuôn trong ngăn tủ data
import data.*;

public class Shapes {

    public static void main(String[] args) {
//        sortShapes();
//        playWithAnonymousClass();
        sortShapesWithAnonymous();
    }
    
    // Sắp xếp mảng Shape
    // có chứa bên trong các đối tượng Con cụ thể
    // được tạo ra từ Cha trừu tượng
    public static void sortShapesWithAnonymous() {
        
        // Đối tượng cụ thể đượct tạo ra từ hàm nặc danh
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                return 50;
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("| %-9s | %-10s | %-10s | %-10s |   -  |   -  | %7.2f |\n",
                        "TAKE AWAY", owner, color, borderColor, getArea());
            }
        };
        
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);
        
        // Hình ngẫu nhiên vẫn thuộc mảng Shape
        // nên vẫn được quyền nằm trong mảng Shape để sắp xếp
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, onTheGo};
        
        System.out.println("The list of shapes before sorting ascending by area: ");
        for (Shape x : arr) {
            x.paint();
        }
        
        // Sắp xếp tăng dần theo diện tích
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("The list of shapes after sorting ascending by area: ");
        for (Shape x : arr) {
            x.paint();
        }
    }
    
    // Khuôn nặc danh - Tạo đối tượng
    // mà không biết công thức để tính toán hay phân nhóm,
    // chỉ biết vẫn có đầy đủ các thuộc tính và phương thức
    // giống như trong định nghĩa của lớp Cha trừu tượng
    public static void playWithAnonymousClass() {
        
        // Vẫn là một đối tượng thuộc khuôn Shape,
        // nên có thể tương tác bình đẳng
        // như những đối tượng khác
        
        //Shape vangLai = new NoName(...);
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            
            // Là một hình đặc biệt,
            // không theo một hình dạng cụ thể nào,
            // nên các giá trị Diện tích và Chu vi
            // phải được tính sẵn và gán cứng
            
            @Override
            public double getArea() {
                return 50;
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                // Là Con của Shape,
                // nên vẫn có thể sử dụng các thuộc tính
                System.out.printf("| RANDOM    | %-10s | %-10s | %-10s |   -  |   -  | %7.2f |\n",
                        owner, color, borderColor, getArea());
            }
        };
        
        vangLai.paint();
    }
    
    // Sắp xếp các hình theo diện tích
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);
        
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2};
        
        System.out.println("The list of shapes before sorting ascending by area: ");
        for (Shape x : arr) {
            x.paint();
        }
        
        // Sắp xếp tăng dần theo diện tích
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("The list of shapes after sorting ascending by area: ");
        for (Shape x : arr) {
            x.paint();
        }
    }
}
