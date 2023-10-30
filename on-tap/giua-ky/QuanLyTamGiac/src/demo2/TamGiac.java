/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author Admin
 */
public class TamGiac {
    protected double a, b, c;
    
    public TamGiac(double a1, double b1, double c1) throws Exception {
        if (a1 + b1 > c1 && a1 + c1 > b1 && b1 + c1 > a1) {
            this.a = a1;
            this.b = b1;
            this.c = c1;
        } else 
            throw new Exception("a, b, c khong phai 3 canh tam giac");
    }
    
    public double tinhDienTich() {
        double p = this.tinhChuVi() / 2;
        
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
    
    public double tinhChuVi() {
        return this.a + this.b + this.c;
    }
    
    public String layThongTin() {
        return String.format("a = %.1f,b = %.1f,c = %.1f", 
                this.a, this.b, this.c);
    }

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %.2f\nChu vi:%.2f", 
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
