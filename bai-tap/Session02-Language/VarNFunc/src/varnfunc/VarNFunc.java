package varnfunc;

import java.util.Scanner; // ~ #include <stdio.h>

public class VarNFunc {
    
    public static void main(String[] args) {
        
//        // Nơi gọi hàm khai báo biến để "hứng" giá trị
//        // do hàm trả về
//        int x = getAnInteger();
//        System.out.println("x from keyboard: " + x);
//        
//        printIntegerList(x);
        
        //inputFromKeyboard();
        //printIntegerList(200);
        //printIntegerList();
        //playWithBooleans();
        //playWithCharacters();
        //playWithDoubles();
        //playWithIntegers();
        //playWithVariables();
        
        testMathFunction();
        
    }
    
    // Hàm tính căn bậc hai,
    // chuẩn bị cho hàm in ra các số nguyên tố
    public static void testMathFunction() {
        double result = Math.sqrt(25);
        
        System.out.println("result: " + result);
        System.out.println("result: " + Math.sqrt(100));
    }
    
    // * Sử dụng hàm loại 3
    // Nhập số từ bàn phím và in ra màn hình
    public static int getAnInteger() {
        int n;
        
        Scanner myKeyBoard = new Scanner(System.in);
        
        System.out.print("Please input a positive integer: ");
        
        // scanf("%d", n);
        n = myKeyBoard.nextInt();
        
        // Hàm đã có giá trị trả về thông qua câu lệnh return
        // nên không cần thêm câu lệnh in ra màn hình
        //System.out.println("n: " + n);
        
        return n;
    }
    
    // Viết hàm riêng để giải quyết việc
    // nhập số từ bàn phím và in ra màn hình
    public static void inputFromKeyboard() {
        int yob;
        
        // Đại diện cho bàn phím thật
        // (nơi cung cấp dữ liệu để đưa vào RAM)
        Scanner myKeyBoard = new Scanner(System.in);
        
        System.out.print("Please input your yob: ");
        
        // scanf("%d", yob);
        yob = myKeyBoard.nextInt();
        
        System.out.println("yob: " + yob);
    }
    
    // * Sử dụng hàm loại 2
    // In ra các số nguyên từ 1..n
    public static void printIntegerList(int n) {
        System.out.println("The list of " + n + " first integers:");
        for (int i = 1; i <= n; i++)
            System.out.print(i + "  ");
        System.out.println("");
    }
    
    // * Sử dụng hàm loại 1
    // In ra các số nguyên từ 1..100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers:");
        for (int i = 1; i <= 100; i++)
            System.out.print(i + "  ");
        System.out.println("");
    }
    
    // Một biểu thức so sánh, một mệnh đề (câu phát biểu)
    // sẽ rơi vào một trong hai trạng thái đúng hoặc sai
    // Quy ước:
    //          - Đúng: True (1)
    //          - Sai: False (0)
    // Sử dụng kiểu dữ liệu đơn boolean (1 bit/1 Byte)
    public static void playWithBooleans() {
        boolean marriedStatus = true;
        
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
        
        System.out.println("Luôn luôn có hy vọng");
    }
    
    // Mặc định, trong Java, kiểu dữ liệu char
    // chiếm đến tận 2 Byte
    public static void playWithCharacters() {
        // * Lưu một kí tự
        char unit = '$';
        System.out.println("unit: " + unit);
        
        // * Lưu chuỗi
        // Trong ngôn ngữ C, ta sử dụng mảng/chuỗi
        //      char name[] = "Ahihi dongok";
        // và khi xử lý chuỗi thì phải sử dụng hàm,
        // vì tên mảng là biến con trỏ
        // được sử dụng để quản lý nhiều biến khác
        // nên không phải là kiểu dữ liệu đơn (primitive)
        
        // Trong ngôn ngữ Java, có một kiểu dữ liệu mới hoàn toàn
        // đó là String - kiểu dữ liệu đối tượng (object)
        // (với chữ 'S' được viết hoa)
        // được sử dụng để lưu chuỗi
        // (một đống các kí tự ở với nhau)
        String name = "Nguyễn Hoàng Thuận";
        System.out.println("name: " + name);
        
        // Vì name bây giờ đã là kiểu đối tượng,
        // mà trong một đối tượng sẽ rất phức tạp,
        // vì vậy, sẽ sử dụng dấu '.' để đi sâu vào bên trong
        System.out.println("1st letter in my name: " + name.charAt(0));
        // Sử dụng hàm charAt() để lấy duy nhất một kí tự
        // tại vị trí thứ 0
        
        // Sử dụng hàm để đổi toàn bộ chuỗi thành chữ thường
        System.out.println("my name as in a lowercase: " + name.toLowerCase());
    }
    
    // Mặc định, trong Java, mọi số thực trong code
    // đều được xem là double (8 Byte) - literal value
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);
        // Trong Java, %f sử dụng chung cho cả float và double
        // và vẫn có thể định dạng phần thập phân muốn lấy
        
        // Vì mọi số thực kiểu double trong code
        // đều được gọi là literal value và chiếm tận 8 Byte,
        // nên nếu có sử dụng kiểu float
        // thì phải sử dụng thêm kí tự 'F' ở cuối giá trị
        // (chuyển từ kiểu double - lớn -> kiểu float - nhỏ)
        float vat = 0.1F;
        System.out.println("vat: " + vat);
        System.out.printf("vat: %.2f\n", vat);
    }
    
    // Mọi giá trị (số, chữ, chuỗi) xuất hiện trong code
    //      Ví dụ:
    //              - Số: 3.14
    //              - Số: 0.1
    //              - Chữ: age
    // đều được gọi là literal value
    
    // Mọi số nguyên trong code
    // đều được xem là int (4 Byte) - literal value
    public static void playWithIntegers() {
        // Sử dụng kí tự '_' để định dạng trong lúc viết code
        // nhưng sẽ không làm ảnh hưởng đến việc hiển thị
        int n = 2_100_000_000;
        System.out.println("n: " + n);
        
        // Vì mọi số nguyên kiểu int trong code
        // đều được gọi là literal value và chỉ có 4 Byte,
        // nên nếu có sử dụng kiểu long
        // thì phải sử dụng thêm kí tự 'L' ở cuối giá trị
        // (chuyển từ kiểu int - nhỏ -> kiểu long - lớn)
        long money = 15_000_000_000L;
        System.out.println("money: " + money);
        
        // Trong lập trình, tiền tố 0x được hiểu là số hệ 16,
        int status = 0xFA;
        
        // Trong lập trình, tiền tố 0 được hiểu là số hệ 8,
        // mà trong hệ 8 thì không xuất hiện số 8 và 9
        //int phoneNumber = 0986;
        int phoneNumber = 070;
        
        // In ra nhưng sẽ theo hệ 10
        System.out.println("status: " + status);
        System.out.println("phone number: " + phoneNumber);
    }
    
    // Static chỉ chơi với static
    public static void playWithVariables() {
        // Minh hoạ việc khai báo biến và gán giá trị
        int yob = 2000;
        int a = 79, b;
        b = 39;
        
        // In giá trị ra màn hình
        System.out.println("yob: " + yob);
        
        int age = 2022 - yob;
        System.out.println("age: " + age + " years old");
        System.out.println("age: " + (2022 - yob) + " years old");
        
        // Câu lệnh theo phong cách của C
        // nhưng lại rất Java
        System.out.printf("age: %d years old\n", age);
    }
}
