package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        inputAProfileLikeAPro();
    }
    
    public static void inputAProfileLikeAPro() {
        String name, address;
        int yob;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        // Vòng lặp vô tận để còn sai là còn bắt nhập lại
        while(true) {
            try {
                System.out.printf("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break; // Nếu đúng thì thoát lặp
            } catch (Exception e) {
                //yob = 69;
                System.out.println("Do you know how to input a positive integer?");
            }
        }
        
        System.out.printf("Input address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Here is your profile:");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
    
    public static void inputAProfile() {
        String name, address;
        int yob;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Input name: ");
        name = sc.nextLine().toUpperCase();
        
//        System.out.printf("Input yob: ");
//        yob = Integer.parseInt(sc.nextLine());
        
        // Tự xử thay bị để bị kết liễu
        try {
            System.out.printf("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            // Gán một giá trị mặc định
            yob = 69;
        }
        
        System.out.printf("Input address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Here is your profile:");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
    
}
