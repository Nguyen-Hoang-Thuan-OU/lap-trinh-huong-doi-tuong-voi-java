package data;

public class Student {
    private static String id;
    public static String name;
    
    public int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    // Không nên thay đổi MSSV
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("| %10s | %-25s | %4d | %4.1f |",
                                id, name, yob, gpa);
    }
    
    public void showProfile() {
        System.out.printf("| %10s | %-25s | %4d | %4.1f |\n",
                            id, name, yob, gpa);
    }
    
    // Thử sử dụng phương thức static
    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
        
        // Báo lỗi vì có quá nhiều vùng yob (trong tương lai)
        //System.out.println("By the way, my yob is " + yob);
    }
}
