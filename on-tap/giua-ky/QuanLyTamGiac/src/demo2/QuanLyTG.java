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
public class QuanLyTG {
    private List<TamGiac> ds = new ArrayList<>();
    
    public void themTG(TamGiac t) {
        this.ds.add(t);
    }
    
    public List<TamGiac> layTamGiacTheoLoai(String classPath) throws ClassNotFoundException {
        Class c = Class.forName(classPath);
        List<TamGiac> kq = new ArrayList<>();
        
        this.ds.stream().filter((t) -> (c.isInstance(t) == true)).forEachOrdered((t) -> {
            kq.add(t);
        });
        
        return kq;
    }
    
    public void sxGiamTheoDienTich() {
        this.ds.sort((TamGiac t1, TamGiac t2) -> {
            double dt1 = t1.tinhDienTich();
            double dt2 = t2.tinhDienTich();
            
            return dt1 > dt2 ? -1: (dt1 < dt2?1:0);
        });
    }
    
    public TamGiac timTGDienTichMax() {
        return this.ds.stream().max((TamGiac t1, TamGiac t2) -> {
            double dt1 = t1.tinhDienTich();
            double dt2 = t2.tinhDienTich();
            
            return dt1 > dt2 ? 1: (dt1 < dt2?-1:0);
        }).get();
    }
    
    public void xuat() {
        this.ds.forEach(t -> System.out.println(t));
    }

    /**
     * @return the ds
     */
    public List<TamGiac> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TamGiac> ds) {
        this.ds = ds;
    }
    
    
}
