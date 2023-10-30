/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class TaiKhoan {
    protected final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    private String soTk;
    private String tenTk;
    private BigDecimal soTien;
    private GregorianCalendar ngayTao;
    
    {
        soTk = String.format("%06d", ++dem);
        ngayTao = new GregorianCalendar();
    }
    
    public TaiKhoan(String ten, BigDecimal st) {
        this.tenTk = ten;
        this.soTien = st;
    }
    
    public void nopTien(BigDecimal st) throws Exception {
        if (this.isDaoHan()) 
            this.soTien = this.soTien.add(st);
        else 
            throw new Exception("Chua den ngay dao han!!!");
    }
    
    public void rutTien(BigDecimal st) throws Exception {
        if (this.isDaoHan()) {
            if (this.soTien.compareTo(st) >= 0)
                this.soTien = this.soTien.subtract(st);
        } else 
            throw new Exception("Chua den ngay dao han!!!");
    }
    
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("So tai khoan: %s\nTen tai khoan: %s\nSo tien: %,.2f\n",
                this.soTk, this.tenTk, this.soTien);
    }
    

    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    /**
     * @return the soTien
     */
    public BigDecimal getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTao
     */
    public GregorianCalendar getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(GregorianCalendar ngayTao) {
        this.ngayTao = ngayTao;
    }
}
