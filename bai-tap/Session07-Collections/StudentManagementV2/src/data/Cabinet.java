package data;

// Một tủ sẽ có nhiều ngăn để chứa đồ,

import java.util.*;

// mỗi lần new() sẽ là một lần bỏ đồ vô tủ
public class Cabinet {
    
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    // Hàm khởi tạo mặc định - Hàm khởi tạo rỗng
    public Cabinet() {
    }

    public void addAStudent() {
        
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile #" + (arr.size() + 1));
        
        // Cắt các khoảng trắng dư và in hoa toàn bộ
        while (true) {            
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toLowerCase();
            
            Student xxx = searchAStudent(id);
            
            if (xxx == null)
                break;
            else
                System.out.println("Duplicated ID. Try another one!!!");
        }
        
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toLowerCase();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));
        
        System.out.println("Add a new student successfully!");
    }
    
    public void printStudentList() {
        if (arr.isEmpty()) { // arr.size() == 0
            System.out.println("The student list is empty");
            System.out.println("There is nothing to print");
            
            return;
        }
        
        System.out.println("There is/are " + arr.size() + " student(s)");
        
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public Student searchAStudent(String id) {
        
        if (arr.isEmpty())
            return null;
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }
        
        return null;
    }
    
    public void searchAStudent() {
        String id;
        
        System.out.print("Input the student id that you want to search: ");
        id = sc.nextLine();
        
        Student xxx = searchAStudent(id);
        
        if (xxx == null)
            System.out.println("STUDENT NOT FOUND TO SEARCH!!!");
        else {
            System.out.println("STUDENT FOUND! Here he/she is:");
            xxx.showProfile();
        }
    }
    
    public void updateAStudent(Student x, double gpa) {
        x.setGpa(gpa);
    }
    
    public void updateAStudent(String id, double gpa) {
        Student xxx = searchAStudent(id);
        
        if (xxx == null)
            System.out.println("NOT FOUND!!! FAILED TO UPDATE");
        else
            updateAStudent(xxx, gpa);
    }
    
    public void updateAStudent() {
        String id;
        double newGPA;
        
        System.out.print("Input the student id that you want to update: ");
        id = sc.nextLine();
        
        Student xxx = searchAStudent(id);
        
        if (xxx == null)
            System.out.println("STUDENT NOT FOUND TO UPDATE!!!");
        else {
            System.out.println("STUDENT FOUND! Here he/she is before updating:");
            xxx.showProfile();
            
            System.out.print("Please input new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            xxx.setGpa(newGPA);
            
            System.out.println("Here he/she is before updating:");
            xxx.showProfile();
        }
    }
}
