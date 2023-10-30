/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_1851010132_nguyenhoangthuan;

/**
 *
 * @author Admin
 */
public class HoiDongBaoVeKhoaLuan
{
    private String hoTen;
    private String hocHam;
    private String hocVi;
    private String nhiemVu;
    
    public HoiDongBaoVeKhoaLuan (String hoTen, String hocHam,
                                    String hocVi, String nhiemVu)
    {
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
    }
    
//    public void themHoiDong (HoiDongBaoVeKhoaLuan hoiDong)
//    {
//        
//    }

    
    //Getter & setter
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the nhiemVu
     */
    public String getNhiemVu() {
        return nhiemVu;
    }

    /**
     * @param nhiemVu the nhiemVu to set
     */
    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
}
