/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_1851010013_nguyennguyetphuongbao;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        BaiViet bv1 = new BaiViet("HDT","HHAHAHA");
        Action a1 = new Like();
        Action a2 = new Love();
        Action a3 = new Love();
        bv1.themDS(a2);
        bv1.themDS(a1);
        bv1.themDS(a3);
        BaiViet bv2 = new BaiViet("HDT","HHAHAHA");
        Action b1 = new Like();
        Action b2 = new Love();
        Action b3 = new Dislike();
        Action b4 = new Love();
        Action b5 = new Love();
        bv2.themDS(b2);
        bv2.themDS(b1);
        bv2.themDS(b1);
        bv2.themDS(b4);
        bv2.themDS(b5);
        System.out.println(bv1);
        QuanLyBaiViet ql = new QuanLyBaiViet();
        ql.themBV(bv2);
        ql.themBV(bv1);
        int kq = ql.soLuotLove(1);
        System.out.println("So luot tha tim bai viet"+ bv1.getMaBV()  +" la " +kq);
        System.out.println("========Sap Xem=========");
        ql.sxGiam();
        ql.xuatBV();
        
    }
    
}
