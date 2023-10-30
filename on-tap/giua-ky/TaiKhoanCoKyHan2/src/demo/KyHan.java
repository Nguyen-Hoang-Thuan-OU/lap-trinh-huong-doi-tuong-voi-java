/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public enum KyHan {
    KHONG_KY_HAN {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public BigDecimal tinhLaiSuat(BigDecimal soTien) {
            double laiSuat = (30 * 0.1)/365;
            return soTien.multiply(new BigDecimal(laiSuat));
        }
    },
    MOT_TUAN {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            return 7;
        }

        @Override
        public BigDecimal tinhLaiSuat(BigDecimal soTien) {
            double laiSuat = (7 * 0.5)/365;
            return soTien.multiply(new BigDecimal(laiSuat));
        }
    },
    MOT_THANG {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            return n.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
        
        @Override
        public BigDecimal tinhLaiSuat(BigDecimal soTien) {
            double laiSuat = (30 * 4.5)/365;
            return soTien.multiply(new BigDecimal(laiSuat));
        }
    }, 
    MOT_NAM {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            return n.getActualMaximum(Calendar.DAY_OF_YEAR);
        }
        
        @Override
        public BigDecimal tinhLaiSuat(BigDecimal soTien) {
            double laiSuat = 6.8;
            return soTien.multiply(new BigDecimal(laiSuat));
        }
    };
    
    public abstract int laySoNgay(GregorianCalendar n);
    public abstract BigDecimal tinhLaiSuat(BigDecimal soTien);
}
