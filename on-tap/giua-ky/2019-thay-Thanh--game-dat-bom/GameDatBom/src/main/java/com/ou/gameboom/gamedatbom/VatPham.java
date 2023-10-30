package com.ou.gameboom.gamedatbom;

public abstract class VatPham {
    protected String maVatPham;
    
    public void hienThiThongTinVatPham() {
        System.out.printf(" %s ", maVatPham);
    }

    public String getMaVatPham() {
        return maVatPham;
    }

    public void setMaVatPham(String maVatPham) {
        this.maVatPham = maVatPham;
    }
}
