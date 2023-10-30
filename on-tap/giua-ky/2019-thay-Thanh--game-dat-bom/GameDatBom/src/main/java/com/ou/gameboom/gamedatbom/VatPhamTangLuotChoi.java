package com.ou.gameboom.gamedatbom;

public class VatPhamTangLuotChoi extends VatPham {
    
    private int soLuotChoiDuocTang = 0;
    protected static int soLuongVatPham = 0;
    
    public VatPhamTangLuotChoi(int soLuotChoiDuocTang){
        maVatPham = String.format("A%02d", ++soLuongVatPham);
        this.soLuotChoiDuocTang = soLuotChoiDuocTang;
    }
    
    @Override
    public void hienThiThongTinVatPham() {
        super.hienThiThongTinVatPham();
        System.out.printf("(%02d),", soLuotChoiDuocTang);
    }

    public int getSoLuotChoiDuocTang() {
        return soLuotChoiDuocTang;
    }

    public void setSoLuotChoiDuocTang(int soLuotChoi) {
        this.soLuotChoiDuocTang = soLuotChoiDuocTang;
    }
    
}
