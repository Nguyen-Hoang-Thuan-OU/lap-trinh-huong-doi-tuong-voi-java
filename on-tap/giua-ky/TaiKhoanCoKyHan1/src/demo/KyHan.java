/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public enum KyHan {
    MOT_TUAN {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            return 7;
        }
    },
    MOT_THANG {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            return n.getActualMaximum(Calendar.DAY_OF_MONTH);
        }
    }, 
    MOT_NAM {
        @Override
        public int laySoNgay(GregorianCalendar n) {
            return n.getActualMaximum(Calendar.DAY_OF_YEAR);
        }
    };
    
    public abstract int laySoNgay(GregorianCalendar n);
}
