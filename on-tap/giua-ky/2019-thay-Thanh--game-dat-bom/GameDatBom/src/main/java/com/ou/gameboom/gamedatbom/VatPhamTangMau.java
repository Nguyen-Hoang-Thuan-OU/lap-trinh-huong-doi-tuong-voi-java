package com.ou.gameboom.gamedatbom;

public class VatPhamTangMau extends VatPham {
    
    private int soLuongMauDuocTang = 0;
    protected static int soLuongVatPham = 0;
    
    public VatPhamTangMau(int soLuongMauDuocTang) {
        maVatPham = String.format("B%02d", ++soLuongVatPham);
        this.soLuongMauDuocTang = soLuongMauDuocTang;
    }
    
    @Override
    public void hienThiThongTinVatPham() {
        super.hienThiThongTinVatPham();
        System.out.printf("(%02d),", soLuongMauDuocTang);
    }

    public int getSoLuongMauDuocTang() {
        return soLuongMauDuocTang;
    }

    public void setSoLuongMauDuocTang(int soLuongMau) {
        this.soLuongMauDuocTang = soLuongMauDuocTang;
    }
    
}
