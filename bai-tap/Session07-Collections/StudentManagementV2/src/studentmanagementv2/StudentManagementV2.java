package studentmanagementv2;

import data.Cabinet;

public class StudentManagementV2 {
    
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();
        
        se.printStudentList();
        
        se.updateAStudent();
        
        se.printStudentList();
        
        // Trường hợp tìm thấy
//        se.searchAStudent();
        
        // Trường hợp không tìm thấy
//        se.searchAStudent();
    }

//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//        
//        System.out.println("INPUT SE");
//        se.addAStudent();
//        
//        System.out.println("INPUT IA");
//        ia.addAStudent();
//        ia.addAStudent();
//        
//        System.out.println("SE STUDENTS");
//        se.printStudentList();
//        
//        System.out.println("IA STUDENTS");
//        ia.printStudentList();
//    }
    
}
