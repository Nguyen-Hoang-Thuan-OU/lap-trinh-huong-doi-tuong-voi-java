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
public class Tester {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo(7, 8);
        PhanSo p3 = new PhanSo(3, 4);
        
        DanhSachPhanSo d = new DanhSachPhanSo();
        d.themPhanSo(p1);
        d.themPhanSo(p2);
        d.themPhanSo(p3);
        
        PhanSo k = d.tong();
        System.out.println("Tổng các phân số = " + k);
        int kq = d.timKiem(new PhanSo(-6, -8));
        System.out.println("Vị trí tìm thấy: " + kq);
        d.xuat();
        d.sapXep();
        d.xuat();
        
        d.thongKe();
    }
}
