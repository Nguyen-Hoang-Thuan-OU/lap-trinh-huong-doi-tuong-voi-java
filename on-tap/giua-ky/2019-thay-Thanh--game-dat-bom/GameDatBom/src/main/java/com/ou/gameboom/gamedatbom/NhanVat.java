package com.ou.gameboom.gamedatbom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NhanVat {
    private static int demSoLuongNhanVat = 0;
    private int maNhanVat = ++demSoLuongNhanVat;
    private String tenNhanVat;
    private List<VatPham> danhSachVatPham;

    public NhanVat() {
    }

    public NhanVat(String tenNhanVat) {
        this.tenNhanVat = tenNhanVat;
        danhSachVatPham = new ArrayList<>();
    }
    
    public int demSoLuongLuotChoi() {
        return (int) danhSachVatPham.stream()
                .filter(x -> x instanceof VatPhamTangLuotChoi)
                .flatMapToInt(x -> IntStream.of(
                    ((VatPhamTangLuotChoi)x).getSoLuotChoiDuocTang()))
                .sum();
    }
    
    public int demSoLuongMau() {
        return (int) danhSachVatPham.stream()
                .filter(x -> x instanceof VatPhamTangMau)
                .flatMapToInt(x -> IntStream.of(
                    ((VatPhamTangMau)x).getSoLuongMauDuocTang()))
                .sum();
    }
    
    // 2. Thêm vật phẩm cho nhân vật
    public void themMotVatPhamChoNhanVat(VatPham vpMoi) {
        danhSachVatPham.add(vpMoi);
    }

    // 3. Hiển thị thông tin nhân vật và thông tin vật phẩm đang có
    public void hienThiThongTinNhanVat() {
        System.out.printf("| %5d | %-15s | %9d | %9d | %7d |",
                maNhanVat, tenNhanVat,
                demSoLuongLuotChoi(), demSoLuongMau(),
                danhSachVatPham.size());
        
        danhSachVatPham.forEach(x -> x.hienThiThongTinVatPham());
        System.out.println("");
    }

    public int getDemSoLuongNhanVat() {
        return demSoLuongNhanVat;
    }

//    public void setDemSoLuongNhanVat(int demSoLuongNhanVat) {
//        this.demSoLuongNhanVat = demSoLuongNhanVat;
//    }

    public int getMaNhanVat() {
        return maNhanVat;
    }

//    public void setMaNhanVat(int maNhanVat) {
//        this.maNhanVat = maNhanVat;
//    }

    public String getTenNhanVat() {
        return tenNhanVat;
    }

    public void setTenNhanVat(String tenNhanVat) {
        this.tenNhanVat = tenNhanVat;
    }

    public List<VatPham> getDanhSachVatPham() {
        return danhSachVatPham;
    }

    public void setDanhSachVatPham(List<VatPham> danhSachVatPham) {
        this.danhSachVatPham = danhSachVatPham;
    }
}
