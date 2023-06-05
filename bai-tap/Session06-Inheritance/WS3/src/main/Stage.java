package main;

import data.RightTriangle;
import data.Triangle;

public class Stage {

    public static void main(String[] args) {
        Triangle t1[] = new Triangle[6];

        t1[0] = new Triangle(4, 5, 7);
        t1[1] = new Triangle(5, 8, 11);
        t1[2] = new Triangle(10, 15, 21);

        t1[3] = new RightTriangle(3, 4);
        t1[4] = new RightTriangle(5, 12);
        t1[5] = new RightTriangle(6, 8);

        System.out.println("Before sorting ascending");
        for (int i = 0; i < 6; i++) {
            t1[i].showInfo();
        }
        System.out.println("");

        for (int i = 0; i < (6 - 1); i++) {
            for (int j = i + 1; j < 6; j++) {
                if (t1[i].getArea() > t1[j].getArea()) {
                    Triangle tmp = t1[i];
                    t1[i] = t1[j];
                    t1[j] = tmp;
                }
            }
        }

        System.out.println("After sorting ascending");
        for (int i = 0; i < 6; i++) {
            t1[i].showInfo();
        }
        System.out.println("");
    }

}
