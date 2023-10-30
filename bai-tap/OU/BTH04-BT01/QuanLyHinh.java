
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class QuanLyHinh {
    private List<Hinh> ds = new ArrayList<>();
    
    public void themHinh(Hinh h) {
        this.ds.add(h);
    }
    
    public void sapXepGiamTheoDT() {
        this.ds.sort((Hinh h1, Hinh h2) -> {
            double d1 = h1.tinhDienTich();
            double d2 = h2.tinhDienTich();
            
            return -((d1 > d2) ? 1:(d2 < d2?-1:0));
        });
    }
    
    public void sapXepTangTheoCV() {
        
    }
    
    public Hinh timHinhDTLonNhat() {
        return this.ds.stream().max((Hinh h1, Hinh h2) -> {
            double d1 = h1.tinhDienTich();
            double d2 = h2.tinhDienTich();
            
            return ((d1 > d2) ? 1:(d2 < d2?-1:0));
        }).get();
    }
    
    public void xuat() {
        this.ds.forEach(h -> System.out.println(h));
    }
    
    public List<Hinh> layHinhTheoLoai(String classPath) {
        return  null;
    }

    /**
     * @return the ds
     */
    public List<Hinh> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }
}
