package studentmanagement;

import data.Student;
import java.util.*;

public class StudentManagement {

//    public static void main(String[] args) {
////        playWithArrayList();
////        sortArrayListManually();
////        playWithSet();
//        
//        // Tìm kiếm sinh viên
////        Student result = searchStudent("se123456");
////        
////        if (result != null)
////            result.showProfile();
////        else
////            System.out.println("NOT FOUND!!!");
//        
//        sortStudentList();
//    }
    
    public static void main(String[] args) {
        List<Student> arr = initData();
        
        System.out.println("The student list:");
        for (Student x : arr) {
            x.showProfile();
        }
        
        // Sử dụng thêm một biến để đón kết quả trả về
        System.out.println("\nSearch...");
        
        Student x = searchAStudent(arr, "SE888888");
        
        if (x == null)
            System.out.println("NOT FOUND!!!");
        else {
            // Đang trỏ đến một vùng RAM thực tế
            x.showProfile();
            
            // Thử cập nhật thông tin của vùng RAM
            System.out.println("\nThe student list after updating information:");
            
            // Thử thay đổi giá trị
            // của một phần tử trong mảng
            x.setGpa(8.0);
        }
        
        for (Student xxx : arr) {
            xxx.showProfile();
        }
    }
    
    // Hàm trả về toạ độ của ArrayList
    // mà bên trong chứa cả một danh sách sinh viên
    public static List<Student> initData() {
        List<Student> arr = new ArrayList();
        
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE888888", "TÁM NGUYỄN", 2003, 8.8));
        arr.add(new Student("SE222222", "HAI VÕ", 2003, 2.2));
        arr.add(new Student("SE444444", "BỐN LÝ", 2003, 4.4));
        
        return arr;
    }
    
    // Hàm tìm kiếm sinh viên,
    // nhưng danh sách sinh viên nhận vào
    // bằng cách truyền tham chiếu
    public static Student searchAStudent(List<Student> arr, String id) {
        
        // Nếu không hề có bất kì phần tử nào
        // thì việc tìm kiếm là vô nghĩa
        if (arr.isEmpty() == true)
            return null;
        
        // Chắc chắn trong mảng đã có phần tử,
        // thực hiện so sánh và trả về toạ độ
        for (int i = 0; i < arr.size(); i++) {
            
            String tmpId = arr.get(i).getId();
            
            if (tmpId.equalsIgnoreCase(id))
                return arr.get(i);
        }
        
        // Nếu không thấy sinh viên cần tìm
        return null;
    }
    
    public static void sortStudentList() {
        
        // Danh sách sinh viên
        List<Student> arr = new ArrayList();
        
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE888888", "TÁM NGUYỄN", 2003, 8.8));
        arr.add(new Student("SE222222", "HAI VÕ", 2003, 2.2));
        arr.add(new Student("SE444444", "BỐN LÝ", 2003, 4.4));
        
        System.out.println("The student list before sorting ascending by gpa:");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < (arr.size() - 1); i++) {
            for (int j = (i + 1); j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        
        System.out.println("\nThe student list after sorting ascending by gpa:");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }
    
    // Hàm tìm kiếm sinh viên theo id,
    // trả về toạ độ vùng new() của đối tượng
    // hoặc trả về con trỏ NULL
    public static Student searchStudent(String id) {
        List<Student> arr = new ArrayList();
        
        Student binhLe = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binhLe);
        
        // Quét qua mảng,
        // lôi từng con trỏ - get(i)
        // để lấy được toạ độ của từng vùng new(),
        // sau đó sử dụng thuộc tính id của từng con trỏ
        // để tiến hành so sánh với tham số đầu vào
        
        // Gán id lấy được của đối tượng
        // sang cho biến trung gian để gọn hơn sau này
        // (Tạm thời chỉ xét phần tử thứ 0)
        Student tmpStudent = arr.get(0);
        String tmpId = tmpStudent.getId();
        
        if (tmpId.equalsIgnoreCase(id))
//            return tmpStudent;
            return arr.get(0);
        
        return null;
    }
    
    // Thử nghiệm với tập hợp (Set)
    public static void playWithSet() {
        Set<Student> arr = new HashSet();
        
        Student binhLe = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binhLe);
        arr.add(binhLe); // Cố tình trỏ trùng vùng new()
                         // khi sử dụng Set
        
        // Cố tình thêm một đối tượng trùng thông tin,
        // nhưng nếu khác vùng new()
        // thì việc cấm trùng là vô nghĩa
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.9));
                         
        // Kiểm tra việc cấm trùng của Set
        System.out.println("The student list:");
        
        // Phải sử dụng forearch,
        // vì lớp Set không có hàm get()
        // để lấy được vị trí [i] của con trỏ
        // khi sử dụng vòng lặp for truyền thống
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    // Sắp xếp danh sách sinh viên thủ công
    // bằng Array List
    public static void sortArrayListManually() {
        
        // Mảng chứa danh sách các con trỏ sinh viên
        List<Student> arr = new ArrayList();
        
        Student binhLe = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        // Thêm toạ độ vùng new() vào trong mảng
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binhLe);
        arr.add(binhLe); // Thêm trùng vùng new(),
                         // sẽ có 2 con trỏ
                         // cùng trỏ đến 1 vùng new()
                         
        System.out.println("The student list (using for earch):");
        for (Student x : arr) {
            x.showProfile();
        }
        
        System.out.println("\nThe student list (using for i):");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
        // Xoá một con trỏ khỏi Array List
        arr.remove(2);
        
        System.out.println("\nThe (LASTEST) student list (using for i):");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
        // Sắp xếp tăng dần theo điểm
        
        // Đưa toạ độ của phần tử thứ 0 cho tmp giữ
        Student tmp = arr.get(0);   // tmp = a[i]
        
        // Đưa toạ độ của phần tử thứ 1 vào vị trí 0
        arr.set(0, arr.get(1));     // a[i] = a[j]
        
        // Đưa toạ độ của tmp vào vị trí 1
        arr.set(1, tmp);            // a[j] = tmp
        
        System.out.println("\nThe student list after sorting ascending by gpa:");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }
    
    // Trải nghiệm để phân biệt giữa
    // mảng truyền thống và Array List
    public static void playWithArrayList() {
        
        // Túi truyền thống - Chứa tối đa 500 phần tử
//        Student[] arr = new Student[500];
        
        // Túi thần kỳ - Chứa vô hạn phần tử
        List<Student> arr = new ArrayList();
//        List<Student> arr = new ArrayList<>();
//        List<Student> arr = new ArrayList<Student>();
        
        // Túi truyền thống - Đưa phần tử vào mảng
//        arr[i] = new Student(id, name, 0, 0);
        
        // Túi thần kỳ - Đưa phần tử vào mảng
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        
        // Túi thần kỳ sẽ tự động sinh ra một con trỏ
        // để quản lý những phần tử mới được thêm vào này
        arr.add(s1);
        arr.add(s2);
        
        // Thử thêm trùng một phần tử vào ArrayList
        arr.add(s1);
        
        // Thử thêm trực tiếp
        // mà không cần thông qua biến đối tượng
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.0));
        
        // Túi truyền thống - Hỏi số lượng phần tử
//        arr.length;
        
        // Túi thần kỳ - Hỏi số lượng phần tử
        System.out.println("The bag has: " + arr.size() + " elements");
        // Chỉ quan tâm lượt sinh viên đã thêm,
        // không quan tâm việc bị trùng
        
        // Túi truyền thống - In thông tin
        //                    của tất cả các sinh viên
//        arr[i].showProfile();
        
        // Túi thần kỳ - In thông tin
        //               của tất cả các sinh viên
        Student xxx = arr.get(0);
        System.out.println("The student infomation:");
        xxx.showProfile();
        arr.get(1).showProfile();
        
        // Không sợ NullPointer
        // vì con trỏ chỉ được thêm khi hàm add() được gọi
        System.out.println("\nThe student list (using foreach):");
        for (Student x : arr) {
            //x = arr.get(i) = arr[i]
            x.showProfile();
        }
        
        System.out.println("\nThe student list (using for):");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }
}
