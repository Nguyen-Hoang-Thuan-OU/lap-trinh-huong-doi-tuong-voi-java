/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Admin
 */
public class TamGiac {
    protected double a, b,c;
    
    public TamGiac(double a, double b, double c) throws Exception {
        if (a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else
            throw new Exception("Day khong phai la do dai 3 canh tam giac!!!");
    }
    
    public double tinhDienTich() {
        double p = this.tinhChuVi() / 2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
    public double tinhChuVi() {
        return this.a + this.b + this.c;
    }
    
    public String layThongTin() {
        return String.format("a = %.1f, b = %.1f, c = %.1f", 
                this.a, this.b, this.c);
    }

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f", 
                this.layThongTin(), this.tinhDienTich(), this.tinhChuVi());
    }
    

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
    
}
