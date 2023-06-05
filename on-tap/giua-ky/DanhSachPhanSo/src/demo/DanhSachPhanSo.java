/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

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
    
    // Tính tổng các phân số trong danh sách
    public PhanSo tong() {
        PhanSo t = new PhanSo();
        
        t = this.ds.stream().reduce(t, (p, q) -> q.cong(p));
        
//        for (PhanSo p: this.ds)
//            t = t.cong(p); // t += p
        
        return t;
    }
    
    public void thongKe() {
        PhanSo m = this.ds.stream().max((p, q) -> p.soSanh(p)).get();
        System.out.println("Phân số lớn nhất = " + m);
        
        System.out.println("\nDANH SACH PHAN SO > 1/2");
        this.ds.stream().filter(p -> p.soSanh(new PhanSo(1, 2)) > 0)
               .forEach(p -> System.out.printf("%s\t", p));
        
        System.out.println("\nDANH SACH PHAN SO > 1/2 va tang 1");
        this.ds.stream().filter(p -> p.soSanh(new PhanSo(1, 2)) > 0)
                .map(p -> p.cong(new PhanSo(1, 1)))
                .forEach(p -> System.out.printf("%s\t", p));
    }
    
    // Hiển thị danh sách 
    public void hienThi() {
        this.ds.forEach(p -> System.out.printf("%s\t", p));
    }
    
    // Tìm kiếm
    public int timKiem(PhanSo p) {
        return this.ds.indexOf(p);
    }
    
    // Sắp xếp giảm
    public void sapXep() {
        this.ds.sort((p1, p2) -> -p1.soSanh(p2));
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

