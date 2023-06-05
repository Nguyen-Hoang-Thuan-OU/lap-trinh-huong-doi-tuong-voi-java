package basicarray;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
//        sortPrimitiveArray();
//        sortPrimitiveArrayV2();
//        sortStudentList();
        inputStudentList();
    }

    // Nhập dữ liệu danh sách sinh viên từ bàn phím,
    // kết hợp OOP: Dữ liệu và hàm phải thuộc về đối tượng
    
    // Việc nhập và lưu trữ hồ sơ,
    // mặc dù có những điểm tương đồng giữa các trường,
    // nhưng đó lại là nhiệm vụ của riêng từng trường
    // (thuộc về một đối tượng cụ thể)
    
    //------------
    
    // Nhập dữ liệu danh sách sinh viên từ bàn phím,
    // không sử dụng OOP
    public static void inputStudentList() {

        // Các biến trung gian để chứa dữ liệu
        // được nhập từ bàn phím
        int count, yob; // count để lưu số lượng phần tử cần nhập
        String id, name;
        double gpa;
        Student arr[];

        // Hỏi số lượng phần tử
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to input?: ");
//        cout = sc.nextInt(); // Lỗi trôi lệnh
        count = Integer.parseInt(sc.nextLine());

        // Mảng để chứa một loạt các sinh viên
        arr = new Student[count];

        // Nhập các thông tin cho từng sinh viên
        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Input student #" + (i + 1) + " / " + count);
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        
        System.out.println("\nStudent list: ");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    // Sắp xếp danh sách / mảng sinh viên tăng dần
    // bằng những dữ liệu có sẵn
    public static void sortStudentList() {
        Student arr[];
        arr = new Student[]{
            new Student("SE9", "CHÍN", 1999, 9),
            new Student("SE6", "SÁU", 1996, 6),
            new Student("SE7", "BẢY", 1997, 7),
            new Student("SE3", "BA", 1993, 3),
            new Student("SE5", "NĂM", 1995, 5)
        };

        System.out.println("The student list before sorting ascending: ");
        for (Student x : arr) {
            x.showProfile();
        }
        System.out.println("");

        // Sắp xếp mảng tăng dần
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("The student list after sorting ascending: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        System.out.println("");
    }

    // Sắp xếp mảng đơn giản tăng dần,
    // sử dụng hai vòng lặp for
    public static void sortPrimitiveArrayV2() {

        // Cho mảng gồm 7 phần tử
        int arr[] = new int[]{1000, -1000, 50, 30, 10, -20, -3000};

        System.out.println("Before sorting ascending: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // Chốt vị trí [i], chạy từ [i + 1] -> cuối
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("After sorting ascending: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    // Sắp xếp mảng đơn giản tăng dần,
    // sử dụng chỉ một vòng lặp for
    public static void sortPrimitiveArray() {

        // Cho mảng gồm 7 phần tử
        int arr[] = new int[]{1000, -1000, 50, 30, 10, -20, -3000};

        System.out.println("Before sorting ascending: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // Chốt vị trí [0], chạy từ [1] - > cuối
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
        }

        // Chốt vị trí [1], chạy từ [2] - > cuối
        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]) {
                int t = arr[1];
                arr[1] = arr[i];
                arr[i] = t;
            }
        }

        System.out.println("After sorting ascending: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
