package thuan.main;

import thuan.util.MyToys;

public class Stage {
    
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0;
        System.out.println("PI (again): " + MyToys.PI);
        
//        int width = MyToys.getAnInteger();
//        int length = MyToys.getAnInteger();
        
        int width = MyToys.getAnInteger("Please input the width of a rectangle: ");
        int length = MyToys.getAnInteger("Please input the length of a rectangle: ");
        
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
