package data;

import data.Student;
import java.util.Scanner;

public class Shelf {

    private String color;
    private String label;
    private double price;
    private int count = 0; // Số lượng sách mặc định là 0

    // Việc quan trọng nhất của một kệ đựng sách
    // đó là chứa danh sách các quyển sách
    // (Chừa sẵn không gian để chứa dữ liệu)
    private Student arr[] = new Student[300];
//    private Student arr[];

    private static Scanner sc = new Scanner(System.in);

    public Shelf(String color, String label, double price) { // int size
        this.color = color;
        this.label = label;
        this.price = price;
//        arr = new Student[size];
    }

    // Hàm để nhập một sinh viên,
    // sẽ được gọi nhiều lần
    public void addAStudent() {

        int yob;
        String id, name;
        double gpa;

        System.out.println("--- Input student #" + (count + 1) + " / " + arr.length);
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr[count] = new Student(id, name, yob, gpa);

        // Tăng biến đếm lên sau mỗi lần hàm được gọi
        count++;

        System.out.println("\nAdd a new student successfully!\n");
    }

    // In ra danh sách các sinh viên
    public void showStudentList() {
        System.out.println("There is/are " + count + " student(s) in the list!");
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }

    // Tìm kiếm sinh viên theo mã số
    public void searchAStudent() {
        String id;
        System.out.print("Input id that you want to search: ");
        id = sc.nextLine();

        // Duyệt từng phần tử từ trái sang phải
        for (int i = 0; i < count; i++) {
            
            // Vét cạn, lấy từng MSSV ra để so sánh
            if (arr[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student found! Here he/she is: ");
                arr[i].showProfile();
                return;
            }
        }
        
        // Duyệt hết for nhưng vẫn không tìm thấy
        System.out.println("Not found!");
    }
}
