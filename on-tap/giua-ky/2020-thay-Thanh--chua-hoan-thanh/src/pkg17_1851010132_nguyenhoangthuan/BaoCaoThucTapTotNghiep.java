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
public class BaoCaoThucTapTotNghiep extends BaoCao
{
    private String chuoiLinkTroDenTapTinDanhGia;
    public BaoCaoThucTapTotNghiep(int maBaoCao, String chuoiLink,
            int ngayBaoCao, String tenSinhVien, String tenGiangVien,
            double diemBaoCao, String chuoiLinkTroDenTapTinDanhGia)
    {
        super(maBaoCao, chuoiLink, ngayBaoCao, tenSinhVien, tenGiangVien, diemBaoCao);
        this.chuoiLinkTroDenTapTinDanhGia = chuoiLinkTroDenTapTinDanhGia;
    }

    
    //Getter & setter
    /**
     * @return the chuoiLinkTroDenTapTinDanhGia
     */
    public String getChuoiLinkTroDenTapTinDanhGia() {
        return chuoiLinkTroDenTapTinDanhGia;
    }

    /**
     * @param chuoiLinkTroDenTapTinDanhGia the chuoiLinkTroDenTapTinDanhGia to set
     */
    public void setChuoiLinkTroDenTapTinDanhGia(String chuoiLinkTroDenTapTinDanhGia) {
        this.chuoiLinkTroDenTapTinDanhGia = chuoiLinkTroDenTapTinDanhGia;
    }
    
}
