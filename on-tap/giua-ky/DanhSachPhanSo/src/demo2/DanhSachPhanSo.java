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
public class DanhSachPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    
    public void themPhanSo(PhanSo p) {
        this.ds.add(p);
    }
    
    public PhanSo tong() {
        PhanSo t = new PhanSo();
        t = this.ds.stream().reduce(t, (p, q) -> p.cong(q));
//        for (PhanSo p: this.ds)
//            t = t.cong(p); // t += p
        
        return t;
    }
    
    public void thongKe() {
        PhanSo m = this.ds.stream().max((p, q) -> p.soSanh(q)).get();
        System.out.println("max = " + m);
        
        // pipeline
        System.out.println("CAC PHAN SO > 1/2");
        this.ds.stream()
                .filter(p -> p.soSanh(new PhanSo(1, 2)) > 0)
                .forEach(p -> System.out.printf("%s\t", p));
        
        System.out.println("CAC PHAN SO > 1/2 va tang 1");
        this.ds.stream()
                .filter(p -> p.soSanh(new PhanSo(1, 2)) > 0)
                .map(p -> p.cong(new PhanSo(1, 1)))
                .forEach(p -> System.out.printf("%s\t", p));
    }
        
    
    public int timKiem(PhanSo p) {
        return this.ds.indexOf(p);
    }
    
    // Sắp giảm
    public void sapXep() {
        this.ds.sort((p, q) -> -p.soSanh(q));
    }
    
    public void xuat() {
        this.ds.forEach(p -> System.out.printf("%s\t", p));
        System.out.println();
    }

    /**
     * @return the ds
     */
    public List<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<PhanSo> ds) {
        this.ds = ds;
    }
}
