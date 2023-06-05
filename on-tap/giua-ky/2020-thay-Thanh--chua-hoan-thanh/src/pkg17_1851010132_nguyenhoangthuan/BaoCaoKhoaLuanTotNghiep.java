/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_1851010132_nguyenhoangthuan;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Admin
 */
public class BaoCaoKhoaLuanTotNghiep extends BaoCao
{
    private double tyLeKiemTraDaoVan;
    private String linkTroDenTapTinDanhGia;
    private List<HoiDongBaoVeKhoaLuan> danhSachHoiDong = new ArrayList<>();
    
    public BaoCaoKhoaLuanTotNghiep(int maBaoCao, String chuoiLink, int ngayBaoCao,
            String tenSinhVien, String tenGiangVien, double diemBaoCao,
            double tyLeKiemTraDaoVan, String linkTroDenTapTinDanhGia)
    {
        super(maBaoCao, chuoiLink, ngayBaoCao,
                tenSinhVien, tenGiangVien, diemBaoCao);
        this.tyLeKiemTraDaoVan = tyLeKiemTraDaoVan;
        this.linkTroDenTapTinDanhGia = linkTroDenTapTinDanhGia;
    }

    
    //Getter & setter
    /**
     * @return the tyLeKiemTraDaoVan
     */
    public double getTyLeKiemTraDaoVan() {
        return tyLeKiemTraDaoVan;
    }

    /**
     * @param tyLeKiemTraDaoVan the tyLeKiemTraDaoVan to set
     */
    public void setTyLeKiemTraDaoVan(double tyLeKiemTraDaoVan) {
        this.tyLeKiemTraDaoVan = tyLeKiemTraDaoVan;
    }

    /**
     * @return the linkTroDenTapTinDanhGia
     */
    public String getLinkTroDenTapTinDanhGia() {
        return linkTroDenTapTinDanhGia;
    }

    /**
     * @param linkTroDenTapTinDanhGia the linkTroDenTapTinDanhGia to set
     */
    public void setLinkTroDenTapTinDanhGia(String linkTroDenTapTinDanhGia) {
        this.linkTroDenTapTinDanhGia = linkTroDenTapTinDanhGia;
    }

    /**
     * @return the danhSach
     */
    public List<HoiDongBaoVeKhoaLuan> getDanhSachHoiDong() {
        return danhSachHoiDong;
    }

    /**
     * @param danhSach the danhSach to set
     */
    public void setDanhSachHoiDong(List<HoiDongBaoVeKhoaLuan> danhSach) {
        this.danhSachHoiDong = danhSach;
    }
    
}
