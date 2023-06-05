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
public class PhanSo {
    private int tuSo;
    private int mauSo;
    
    // Hai phương thức khởi tạo
    public PhanSo(int t, int m) {
        this.tuSo = t;
        this.mauSo = m;
    }
    
    public PhanSo() {
        this(0, 1);
    }
    
    // Cộng
    public PhanSo cong(PhanSo p) {
        // this + p
        int t = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        int m = this.mauSo * p.mauSo;
        
        return new PhanSo(t, m);
    }
    
    // So sánh
    public int soSanh(PhanSo p) {
        // so sanh this va p
        // > 0 --> this > p
        // < 0 --> this < p
        // = 0 --> this == p
        int t1 = this.tuSo * p.mauSo;
        int t2 = this.mauSo * p.tuSo;
        
        return t1 - t2;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.tuSo, this.mauSo);
    }

    @Override
    public boolean equals(Object o) {
        PhanSo p = (PhanSo) o;
        int t1 = this.tuSo * p.mauSo;
        int t2 = this.mauSo * p.tuSo;
        return t1 == t2;
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}

