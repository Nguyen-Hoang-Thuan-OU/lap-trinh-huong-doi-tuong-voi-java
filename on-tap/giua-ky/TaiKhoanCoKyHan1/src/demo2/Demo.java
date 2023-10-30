/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan("Nguyen Van A", new BigDecimal(10000000));
        try {
            tk1.nopTien(new BigDecimal(1000000));
            tk1.rutTien(new BigDecimal(500000));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        System.out.println(tk1);
        
        TaiKhoan tk2 = new TaiKhoanCoKyHan("Tran Thi B", 
                new BigDecimal(50000000), KyHan.MOT_TUAN);
        try {
            tk2.rutTien(new BigDecimal(500000));
            System.out.println(tk2);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
    }
}
