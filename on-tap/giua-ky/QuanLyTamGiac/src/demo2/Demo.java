/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) {
        try {
            TamGiac t = new TamGiac(1, 1, 10);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            TamGiac t1 = new TamGiac(4, 5, 6);
            TamGiac t2 = new TamGiacCan(5, 6);
            TamGiac t3 = new TamGiacDeu(5);
            
            QuanLyTG ql = new QuanLyTG();
            ql.themTG(t1);
            ql.themTG(t2);
            ql.themTG(t3);
            
            ql.layTamGiacTheoLoai("demo2.TamGiacCan")
              .forEach(t -> System.out.println(t));
            
            System.out.println("=== GIAM THEO DIEN TICH");
            ql.sxGiamTheoDienTich();
            ql.xuat();
            
            System.out.println("=== DIEN TICH LON NHAT");
            System.out.println(ql.timTGDienTichMax());
        } catch (Exception ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
