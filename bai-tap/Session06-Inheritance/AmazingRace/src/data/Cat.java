package data;

import java.util.Random;

public class Cat extends Pet {
    public static final double MAX_SPEED = 50;
    
    private String ribbon;

    public Cat(String name, int yob, double weith, String ribbon) {
        super(name, yob, weith);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }
    
    // Sử dụng hàm sinh giá trị ngẫu nhiên
    @Override
    public double run() {
        Random soNgauNhien = new Random();
        
        double speed = soNgauNhien.nextDouble() * MAX_SPEED;
        
        return speed;
    }
    
    @Override
    public void showRecord() {
        System.out.printf("| CAT      | %-10s | %4d | %4.1f | %4s | %4.1f |\n",
                name, yob, weight, ribbon, run());
    }
}
