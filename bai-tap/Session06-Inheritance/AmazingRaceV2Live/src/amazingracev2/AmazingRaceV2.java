package amazingracev2;

import data.*;
import java.util.*;

public class AmazingRaceV2 {

    public static void main(String[] args) {
        runToDead();
    }
    
    // Chứng minh về Anonymous
    public static void playAnonymous() {
        // List là một Interface
        // với hơn 20 hàm trừu tượng,
        // phải tự thiết kế lại toàn bộ hàm trừu tượng
        // nếu cố gắng tạo mới đối tượng từ Interface
        List list = new List() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Iterator iterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object[] toArray() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object[] toArray(Object[] a) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean add(Object e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean containsAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean addAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean addAll(int index, Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean removeAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean retainAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object get(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object set(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void add(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object remove(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int indexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ListIterator listIterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ListIterator listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    public static void runToDead() {
        
        // Đối tượng vãng lai, không cần tạo lớp
        DeathRacer mnnCTT = new DeathRacer() {
            
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }

            // Vì Interface không hề có bất kì đặc điểm gì,
            // nên bắt buộc phải tự thiết kế lại nếu cần
            @Override
            public void showHowToDead() {
                System.out.printf("| %-20s | %-15s | %9d | %11.1s | %5.1f |\n",
                        "MERMAIND-RACER", "MNN CTT", 2016, " ", runToDead());
            }
        };
        
        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50.0);
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        
        Motor m1 = new Motor("EXCITER", "150.0 cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0 cm3", "56F6-67889");
        
        // Toàn bộ đã thuộc về mảng DeathRacer,
        // việc đa hình lúc này sẽ dựa vào lớp DeathRacer
        DeathRacer racer[] = {mnnCTT, d1, (Dog)d2, d3, m1, m2};
        
        System.out.println("The racing records:");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}
