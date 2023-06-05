/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyTamGiac {
    private List<TamGiac> ds = new ArrayList<>();
    
    public void themTamGiac(TamGiac t) {
        this.ds.add(t);
    }
    
    public List<TamGiac> layTamGiacTheoLoai(String classPath) throws ClassNotFoundException {
        List<TamGiac> kq = new ArrayList<>();
        Class c = Class.forName(classPath);
        this.ds.stream().filter((t) -> (c.isInstance(t) == true)).forEachOrdered((t) -> {
            kq.add(t);
        });
        return kq;
    }
    
    public TamGiac timTGDienTichMax() {
        return this.ds.stream().max((TamGiac t1, TamGiac t2) -> {
            double dt1 = t1.tinhDienTich();
            double dt2 = t2.tinhDienTich();
            
            return dt1 > dt2 ? 1: (dt1 < dt2 ? -1:0);
        }).get();
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
