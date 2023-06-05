/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_1851010013_nguyennguyetphuongbao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyBaiViet {
    private ArrayList<BaiViet> bv = new ArrayList<>();
    public void themBV(BaiViet vs){
        this.bv.add(vs);
    }
    public void xuatBV(){
        this.bv.forEach(a -> System.out.println(a));
    }
    public void sxGiam(){
        this.bv.sort((BaiViet bv1, BaiViet bv2) -> {
            return -(bv1.diem() - bv2.diem());
        });
    }
//    public int soLuotlove() throws ClassNotFoundException{
//        Class c = Class.forName("pkg13_1851010013_nguyennguyetphuongbao.Like");
//        List ds = new ArrayList<>();
//        int kq = 0;
//        for(BaiViet a : this.bv){
//            for(Action k :a.getDs())
//                if(c.isInstance(k))
//                    kq++;
//           ds.add(kq);
//        }
//        return kq;
//    
//    }
    public int soLuotLove(int maBV) throws ClassNotFoundException{
        Class c = Class.forName("pkg13_1851010013_nguyennguyetphuongbao.Love");
        //List<Action> kq = new ArrayList<>();
        int kq = 0;
        for(BaiViet a : this.bv){
            if(a.getMaBV() == maBV)
            {
                for(Action k :a.getDs())
                    if(c.isInstance(k))
                        kq++;
            }
                    
        }
        return kq;
    }
    /**
     * @return the bv
     */
    public ArrayList<BaiViet> getBv() {
        return bv;
    }

    /**
     * @param bv the bv to set
     */
    public void setBv(ArrayList<BaiViet> bv) {
        this.bv = bv;
    }
    
}
