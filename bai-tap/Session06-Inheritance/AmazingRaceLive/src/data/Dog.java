package data;

import java.util.Random;

public class Dog extends Pet {
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        Random mayNgauNhien = new Random();
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED;
        return speed;
    }

    @Override
    public void showRecord() {
        System.out.printf("| %-8s | %-10s | %4d | %4.1f | %4.1f |\n",
                "DOG", name, yob, weight, run());
    }
}
