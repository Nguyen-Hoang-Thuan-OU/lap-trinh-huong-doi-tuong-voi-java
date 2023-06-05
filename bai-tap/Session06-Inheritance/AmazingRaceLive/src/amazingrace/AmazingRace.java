package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

public class AmazingRace {

    public static void main(String[] args) {
//        showRecord();
        showRecordWithTakeAway();
    }
    
    public static void showRecordWithTakeAway() {
        
        // Unidentified Running Object
        Pet uro = new Pet("URO", 2021, 0.3) {
            public static final double MAX_SPEED = 30;
            
            @Override
            public double run() {
                return new Random().nextDouble() * MAX_SPEED;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("| %-8s | %-10s | %4d | %4.1f | %4.1f |\n",
                        "NONAME", name, yob, weight, run());
            }
        };
        
        Hamster ht = new Hamster("NHẮT", 2021, 0.3);
        Pet racer[] = new Pet[]{
            new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 50),
            new Cat("TOM", 1960, 15.0),
            new Cat("KITTY", 1990, 5.0),
            new Hamster("JERRY", 1960, 0.5),
            ht, uro
        };

        System.out.println("The records table before sorting ascending by speed:");
        for (Pet x : racer) {
            x.showRecord();
        }

        for (int i = 0; i < (racer.length - 1); i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    Pet temp = racer[i];
                    racer[i] = racer[j];
                    racer[j] = temp;
                }
            }
        }
        
        System.out.println("The records table after sorting ascending by speed:");
        for (Pet x : racer) {
            x.showRecord();
        }
    }
    
    public static void showRecord() {
        Hamster ht = new Hamster("NHẮT", 2021, 0.3);
        Pet racer[] = new Pet[]{
            new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 50),
            new Cat("TOM", 1960, 15.0),
            new Cat("KITTY", 1990, 5.0),
            new Hamster("JERRY", 1960, 0.5),
            ht
        };
        
        // Đa hình xuất hiện
        System.out.println("The records table before sorting ascending by speed:");
        for (Pet x : racer) {
            x.showRecord();
        }
        
        // Nhưng hiện tại chưa thể sắp xếp mảng được,
        // vì mỗi lần gọi hàm run() để so sánh và sắp xếp
        // thì sẽ nhận được một con số hoàn toàn mới,
        // không giống như việc tương tác với giá trị cố định
        for (int i = 0; i < (racer.length - 1); i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    Pet temp = racer[i];
                    racer[i] = racer[j];
                    racer[j] = temp;
                }
            }
        }
        
        System.out.println("The records table after sorting ascending by speed:");
        for (Pet x : racer) {
            x.showRecord();
        }
    }
}
