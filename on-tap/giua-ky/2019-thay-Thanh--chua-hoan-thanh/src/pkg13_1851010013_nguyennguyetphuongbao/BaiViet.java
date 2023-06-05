/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_1851010013_nguyennguyetphuongbao;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BaiViet {
    private int maBV;
    private static int dem;
    private String tenBV;
    private String noiBV;
    private ArrayList<Action> ds = new ArrayList<>();
    {
        dem++;
        setMaBV(dem);
    }
    public BaiViet(String ten,String nd)
    {
        this.tenBV = ten;
        this.noiBV = nd;
    }
    public void themDS(Action ac){
        this.ds.add(ac);
    }
    public int diem(){
        int kq =0;
        for(Action ac : this.ds)
        {
            kq +=ac.diem;
        }
        return kq;
    }
    @Override
    public String toString() {
        return String.format("\nMa Bai Viet:%d - Ten Bai Viet:%s \nNoi Dung: %s \n Co %d luot action :%s",
                this.maBV,this.tenBV,this.noiBV,this.ds.size(),this.ds);
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @return the maBV
     */
    public int getMaBV() {
        return maBV;
    }

    /**
     * @param maBV the maBV to set
     */
    public void setMaBV(int maBV) {
        this.maBV = maBV;
    }

    /**
     * @return the tenBV
     */
    public String getTenBV() {
        return tenBV;
    }

    /**
     * @param tenBV the tenBV to set
     */
    public void setTenBV(String tenBV) {
        this.tenBV = tenBV;
    }

    /**
     * @return the noiBV
     */
    public String getNoiBV() {
        return noiBV;
    }

    /**
     * @param noiBV the noiBV to set
     */
    public void setNoiBV(String noiBV) {
        this.noiBV = noiBV;
    }

    /**
     * @return the ds
     */
    public ArrayList<Action> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<Action> ds) {
        this.ds = ds;
    }
}
