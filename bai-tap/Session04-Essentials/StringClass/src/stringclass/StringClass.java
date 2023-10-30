package stringclass;

import java.util.Random;

public class StringClass {

    public static void main(String[] args) {
        playWithStrings();
    }
    
    public static void playWithStrings() {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        
        String s3 = "HELLO";
        String s4 = "HELLO";
        
        String s5 = "Hello";
        
        System.out.println("s1 vs. s2: " + (s1 == s2));
        System.out.println("s2 vs. s3: " + (s2 == s3));
        System.out.println("s3 vs. s4: " + (s3 == s4));
        System.out.println("s4 vs. s5: " + (s4 == s5));
    }
}
