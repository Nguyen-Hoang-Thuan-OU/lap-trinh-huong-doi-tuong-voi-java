package wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
//        playWithIntegers();
//        playWithPointers();
        playWithPool();
    }
    
    public static void playWithPool() {
        Integer n1 = 2003;
        Integer n2 = 2003;        
        Integer n3 = new Integer(2003);
        
        // So sánh con trỏ
        System.out.println("n1 vs. n2: " + (n1 == n2));
        
        // So sánh giá trị bên trong
        if (n1.equals(n2))
            System.out.println("n1 = n2");
        else
            System.out.println("n1 != n2");
        
        Integer n4 = 127;
        Integer n5 = 127;
        Integer n6 = new Integer(127);
        
        // So sánh con trỏ
        System.out.println("n5 vs. n6: " + (n5 == n6));
        
        // So sánh giá trị bên trong
        if (n6.equals(n5))
            System.out.println("n5 = n6");
        else
            System.out.println("n5 != n6");
    }
    
    public static void playWithPointers() {
        Integer n1 = 2003;
        Integer n2 = 2003;
        
        // So sánh bằng hàm intValue()
        if (n1.intValue() == n2.intValue())
            System.out.println("n1 = n2");
        else
            System.out.println("n1 != n2");
        
        // So sánh bằng hàm equals()
        System.out.println("n1 vs. n2 (core value): " + n1.equals(n2));
        
        // So sánh bằng hàm compareTo()
        System.out.println("n1 vs. n2 (core value): " + n1.compareTo(n2));
    }
    
    public static void playWithIntegers() {
        int num0 = 2003;
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        
        System.out.println("num0: " + num0);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2.toString());
        System.out.println("num3: " + num3.intValue());
        
        Integer num4 = num0;
        System.out.println("num4: " + num4);
        
        int num5 = num4;
        System.out.println("num5: " + num5);
        
        // Thay đổi giá trị của biến đơn giản
        num0 = 2001;
        
        // Thay đổi giá trị lõi của Wrapper Class
        num4 = 2001;
    }
}
