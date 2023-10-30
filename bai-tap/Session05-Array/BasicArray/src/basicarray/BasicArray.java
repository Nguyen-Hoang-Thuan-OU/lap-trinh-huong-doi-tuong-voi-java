package basicarray;

public class BasicArray {

    public static void main(String[] args) {
//        playWithPrimitiveArrayV1();
//        playWithPrimitiveArrayV2();
//        playWithPrimitiveArrayV3();
//        playWithAnObject();
//        playWithObjectArray();
//        sortPrimitiveArray();
//        sortStudentAray();
//        sortStudentArayV2();
        sortStudentArayV3();
    }

    // Sắp xếp mảng sinh viên theo điểm trung bình
    // ĐÚNG - Thêm điều kiện sắp xếp
    public static void sortStudentArayV3() {
        Student arr[] = new Student[2];

        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);

        System.out.println("Before sorting ascending by gpa: ");
        for (Student x : arr) {
            x.showProfile();
        }
        
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        System.out.println("After sorting ascending by gpa: ");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    // Minh hoạ về biến trung gian
    // bằng mảng đơn giản - Thêm điều kiện sắp xếp
    public static void sortPrimitiveArrayV2() {
        int a = 9, b = 5;

        // In theo tứ tự tăng dần
        // (nhưng phải in ra trước và b sau)
        System.out.println("a: " + a + " | b: " + b);

        // Lẽ ra, a phải mang giá trị 5,
        //        b phải mang giá trị 9
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println("Ascending a: " + a + " | b: " + b);
    }

    // Sắp xếp mảng sinh viên theo điểm trung bình
    // ĐÚNG - Đơn giản
    public static void sortStudentArayV2() {
        Student arr[] = new Student[2];

        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);

        System.out.println("Before sorting ascending by gpa: ");
        for (Student x : arr) {
            //System.out.println(x);
            x.showProfile();
        }

        // In mảng tăng dần theo điểm trung bình
        Student temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("After sorting ascending by gpa: ");
        for (Student x : arr) {
            //System.out.println(x);
            x.showProfile();
        }
    }

    // Sắp xếp mảng sinh viên theo điểm trung bình
    // SAI
    public static void sortStudentAray() {
        Student arr[] = new Student[2];

        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);

        System.out.println("Before sorting ascending by gpa: ");

        // Sử dụng for truyền thống
        for (int i = 0; i < 2; i++) {
//            arr[i].showProfile();
            System.out.println(arr[i]);
        }

        // Sử dụng foreach
//        for (Student x : arr) {
//            //System.out.println(x);
//            x.showProfile();
//        }
        // In mảng tăng dần theo điểm trung bình
        // Phong cách sai
        arr[0] = arr[1];
        arr[1] = arr[0];

        System.out.println("After sorting ascending by gpa: ");

        // Sử dụng for truyền thống
        for (int i = 0; i < 2; i++) {
//            arr[i].showProfile();
            System.out.println(arr[i]);
        }
    }

    // Minh hoạ về biến trung gian
    // bằng mảng đơn giản
    public static void sortPrimitiveArray() {
        int a = 9, b = 5;

        // In theo tứ tự tăng dần
        // (nhưng phải in ra trước và b sau)
        System.out.println("a: " + a + " | b: " + b);

        // Lẽ ra, a phải mang giá trị 5,
        //        b phải mang giá trị 9
        int t = a;
        a = b;
        b = t;
        System.out.println("Ascending a: " + a + " | b: " + b);
    }

    // Làm việc với mảng đối tượng
    public static void playWithObjectArray() {
        // Cần lưu 50 giá trị integer
//        int a1, a2, a3, a4, a5...;

        int a[] = new int[50];  // Cần 50 biến và 50 giá trị

        // Cần lưu 50 hồ sơ sinh viên
//        Student s1, s2, s3, s4, s5...;
        Student s[] = new Student[50];  // Cần 50 biến và 50 lần new()
        s[0] = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        s[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.7);
        s[2] = new Student("SE123458", "CƯỜNG VÕ", 1999, 5.8);

        // In ra thông tin của từng phần tử trong mảng đối tượng,
        // nhưng không giống như biến đơn giàn khi có thể sử dụng trực tiếp,
        // biến đối tượng phải sử dụng phương thức để hiển thị
        s[0].showProfile();
        s[1].showProfile();
        s[2].showProfile();

        System.out.println("The student list:");
        for (int i = 0; i < 3; i++) {
            // Vì s[i] đang lưu toạ độ vùng new(),
            // nên có thể sử dụng s[i] để tương tác tiếp
            // mà không cần sout như mảng đơn giản
            s[i].showProfile();
        }
    }

    // Làm việc đối tượng,
    // khảo sát con trỏ NULL
    public static void playWithAnObject() {
        // Để có được một sinh viên,
        // cần có con trỏ và vùng new()
        Student x;
        x = new Student("SE123456", "AN NGUYỄN", 2000, 5.6);
        x.showProfile();

        // Vì x chỉ cần mộ toạ độ vùng RAM,
        // nên có thể gán x = toạ độ Byte đầu tiên trong toàn RAM
        // (gán địa chỉ của con số 0 vào biến con trỏ)
        x = null;

        // Vì đang trỏ đến vùng NULL
        // nên không còn thông tin gì để hiển thị
        x.showProfile();
    }

    // Làm việc với mảng đơn giản - tên mảng
    public static void playWithPrimitiveArrayV3() {
        // Các cách khai báo mảng
        //int arr1[50]; // Bị lỗi

        // Có tổng cộng 6 biến: 5 biến int + 1 biến con trỏ arr2
        int[] arr2 = {5, 10, 15, 20, 25};

        int[] arr3 = new int[]{5, 10, 15, 20, 25};

        // Khai báo chuẩn
//        int arr[] = new int[5];
        int[] arr;
        arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        // In mảng
        System.out.println("The array has:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\n\nThe array has (using for each):");
        for (int x : arr) {
            System.out.print(x + "  ");
        }

        // Gọi thầm phương thức toString() bằng tên mảng,
        // nhưng sẽ nhận về mã băm vì chưa thiết kế phương thức toString()
        System.out.println("\n\nThe array has: " + arr);
    }

    // Làm việc với mảng đơn giản - mảng động
    public static void playWithPrimitiveArrayV2() {

        // Java sẽ mặc định gán toàn bộ phần tử vừa khai báo = 0
        // cũng giống như hàm calloc() trong C
        // Xin cấp phát 365 biến double
        // float* arr = calloc(365, sizeof(float));
        double arr[] = new double[100];

        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        arr[4] = 6789;

        System.out.println("The dynamic array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nArray length: " + arr.length);

        // Kết hợp với for each
        System.out.println("\nThe dynamic array has values of (for each)");
        for (double x : arr) {
            System.out.print(x + "  ");
        }
    }

    // Làm việc với mảng đơn giản,
    // nhưng chưa làm việc vội với hướng đối tượng
    public static void playWithPrimitiveArrayV1() {
        // Các kiểu khai báo mảng mà Java sẽ không cho phép
//        double vol[365];
//        float v[100] = {0, 5, 10, 15, 20, 25, 30};

        // Được phép khai báo, miễn là không ghi kích thước của mảng
        double v[] = {0, 5, 10, 15, 20, 25, 30};

        System.out.println("v[0]: " + v[0]);
        System.out.println("v[1]: " + v[1]);

        // Một biến có quyền thay đổi giá trị
        v[0] = 6868;
//        v[7] = 6868; // Gây ra lỗi bgoại lệ

        System.out.println("\nThe array has values of");

        // Java sẽ không cho duyệt vượt biên,
        // nếu không sẽ bị ngoại lệ
        for (int i = 0; i < 7; i++) {
            System.out.println("v[" + i + "]: " + v[i]);
        }

        // Sử dụng với mỗi (∀)
        System.out.println("\nThe array has values of (printed by using for each)");
        for (double x : v) // ∀ x ∈ v
        // x không phải (không bằng) tập hợp v,
        // x là từng phần tử chứa trong mảng v
        {
            System.out.print(x + "  ");
        }

    }
}
