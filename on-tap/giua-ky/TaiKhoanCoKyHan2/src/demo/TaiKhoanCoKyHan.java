/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Admin
 */
public class TaiKhoanCoKyHan extends TaiKhoan {
    
    private GregorianCalendar ngayDaoHan;
    
    public TaiKhoanCoKyHan(String ten, BigDecimal st, KyHan kh) {
        super(ten, st);
        
        this.kyHan = kh;
        this.ngayDaoHan = new GregorianCalendar();
        this.ngayDaoHan.add(Calendar.DAY_OF_YEAR, 
                this.kyHan.laySoNgay(this.ngayDaoHan));
        
//        if (this.isDaoHan())
//            this.capNhatNgayDaoHan();
    }
    
    public void capNhatNgayDaoHan() {
        this.ngayDaoHan.add(Calendar.DAY_OF_YEAR, 
                this.kyHan.laySoNgay(this.ngayDaoHan));
    }
    
    @Override
    public boolean isDaoHan() {
        GregorianCalendar d = new GregorianCalendar();
        boolean b1= d.get(Calendar.YEAR) == this.ngayDaoHan.get(Calendar.YEAR);
        boolean b2= d.get(Calendar.MONTH) == this.ngayDaoHan.get(Calendar.MONTH);
        boolean b3= d.get(Calendar.DAY_OF_MONTH) == this.ngayDaoHan.get(Calendar.DAY_OF_MONTH);
        
        return b1 && b2 && b3;
    }

    @Override
    public String toString() {
        return String.format("%sKy han: %s\nNgay dao han: %s\n", 
                super.toString(), 
                this.kyHan.toString(),
                this.f.format(this.ngayDaoHan.getTime()));
    }

    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public GregorianCalendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(GregorianCalendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
