/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class Hinh {
    private String ten;
    
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();
    
    public Hinh(String t) {
        this.ten = t;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.2f\nChu vi: %.2f\n", 
                this.ten, this.tinhDienTich(), this.tinhChuVi());
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
}
