/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void themTaiKhoan(TaiKhoan tk) {
        this.ds.add(tk);
    }
    
    public void sapXep() {
        this.ds.sort((TaiKhoan t1, TaiKhoan t2) 
                -> -t1.getNgayTao().compareTo(t2.getNgayTao()));
    }
    
    public void xuat() {
        this.ds.forEach(tk ->  System.out.println(tk));
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
    
    
}
