package main;

import data.Shelf;
import java.util.Scanner;

public class Stage {

    // Làm dạng menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        Shelf OU = new Shelf("BLUE", "CS", 100);

        // Menu sẽ liên tục được lặp lại
        // cho đến khi nào chọn lựa chọn số 6
        do {
            printMenu();
            System.out.print("\t-> Please choose (1..6):");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    OU.addAStudent();
                    System.out.println("");
                    break;
                    
                case 2:
                    OU.showStudentList();
                    System.out.println("");
                    break;
                    
                case 3:
                    OU.searchAStudent();
                    System.out.println("");
                    break;
                    
                case 6:
                    System.out.println("Bye bye, see you next time!");
                    break;
                    
                default:
                    System.out.println("Please choose 1..6");
            }
        } while (choice != 6);

    }

    public static void printMenu() {
        System.out.println("\n----- Welcome to Student Information System (SIS)");
        System.out.println("----- Please choose the following funtions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student");
        System.out.println("6. Quit");
    }

    // Hàm main() cũ được đổi thành hàm kiểm tra
    public static void checkShelf() {
        Shelf OU = new Shelf("BLUE", "CS", 100);
        Shelf FPT = new Shelf("ORANGE", "SE", 100);

        OU.addAStudent(); // #1 / 300
        OU.addAStudent(); // #2 / 300

        FPT.addAStudent(); // #1 / 300

        System.out.println("----- OU");
        OU.showStudentList();

        System.out.println("");

        System.out.println("----- FPT");
        FPT.showStudentList();
    }

}
