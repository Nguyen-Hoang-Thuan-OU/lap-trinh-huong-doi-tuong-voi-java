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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo(5, 6);
        PhanSo p3 = new PhanSo(2, 3);
        
        DanhSachPhanSo d = new DanhSachPhanSo();
        d.themPhanSo(p1);
        d.themPhanSo(p2);
        d.themPhanSo(p3);
        
        System.out.println("=== TỔNG ===");
        PhanSo k = d.tong();
        System.out.println("Tổng các phân số = " + k);
        System.out.println("=== TÌM KIẾM ===");
        int kq = d.timKiem(new PhanSo(-4, -6));
        System.out.println("Vị trí tìm thấy: " + kq);
        System.out.println("=== SẮP XẾP ===");
        d.hienThi();
        d.sapXep();
        System.out.println();
        d.hienThi();
        System.out.println();
        System.out.println("=== THỐNG KÊ");
        d.thongKe();
        System.out.println();
    }
}
