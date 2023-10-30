/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class demomain {
    public static void main(String[] args) {
        Hinh h1 = new HinhChuNhat("Hinh chu nhat 1", 40, 33);
        Hinh h2 = new HinhVuong("Hinh vuong 1", 35);
        Hinh h3 = new TamGiacCan("Tam giac can 1", 30, 25);
        Hinh h4 = new TamGiacDeu("Tam giac deu 1", 31);
        
        QuanLyHinh q1 = new QuanLyHinh();
        q1.themHinh(h1);
        q1.themHinh(h2);
        q1.themHinh(h3);
        q1.themHinh(h4);
        
        System.out.println("==GIAM THEO DIEN TICH");
        q1.sapXepGiamTheoDT();
        q1.xuat();
        System.out.println("==DIEN TICH MAX");
        System.out.println(q1.timHinhDTLonNhat());
    }
}
