package com.ou.gameboom.gamedatbom;

public class GameLobby {
    public static void main(String[] args) {
        NhanVat nv1 = new NhanVat("Doraemon");
        nv1.themMotVatPhamChoNhanVat(new VatPhamTangMau(10));
        nv1.themMotVatPhamChoNhanVat(new VatPhamTangLuotChoi(1));
        
        NhanVat nv2 = new NhanVat("Pikachu");
        nv2.themMotVatPhamChoNhanVat(new VatPhamTangMau(8));
        nv2.themMotVatPhamChoNhanVat(new VatPhamTangLuotChoi(3));
        nv2.themMotVatPhamChoNhanVat(new VatPhamTangLuotChoi(2));
        nv2.themMotVatPhamChoNhanVat(new VatPhamTangLuotChoi(1));
        
        NhanVat nv3 = new NhanVat("Pepe the Frog");
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(4));
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(6));
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(1));
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(1));
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(1));
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(1));
        nv3.themMotVatPhamChoNhanVat(new VatPhamTangMau(1));
        
        QuanLyNhanVat qlnv = new QuanLyNhanVat();
        qlnv.themMotNhanVatVaoDanhSach(nv1);
        qlnv.themMotNhanVatVaoDanhSach(nv2);
        qlnv.themMotNhanVatVaoDanhSach(nv3);
        
        qlnv.hienThiMauThongTinChungCuaNhanVan();
        qlnv.hienThiDanhSachNhanVat();
        
        System.out.println("\n=== Tim so luot choi theo ma nhan vat ===");
        System.out.printf("Nhan vat %d: %d\n", 1, qlnv.timTongSoLuotChoiTheoMaNV(1));
        System.out.printf("Nhan vat %d: %d\n", 2, qlnv.timTongSoLuotChoiTheoMaNV(2));
        System.out.printf("Nhan vat %d: %d\n", 999, qlnv.timTongSoLuotChoiTheoMaNV(999));
        
        System.out.println("\n=== Tim cac nhan vat co mau nhieu nhat ===");
        qlnv.hienThiMauThongTinChungCuaNhanVan();
        qlnv.timDanhSachNVCoSoMauNhieuNhat().forEach(x -> x.hienThiThongTinNhanVat());
        
        System.out.println("\n=== Sap xep nhan vat giam dan theo so vat pham ===");
        qlnv.sapXepNVGiamDanTheoSoLuongVatPham();
        qlnv.hienThiMauThongTinChungCuaNhanVan();
        qlnv.hienThiDanhSachNhanVat();
        
        System.out.println("\n=== Sap xep nhan vat giam dan theo so mau ===");
        qlnv.sapXepNVGiamDanTheoSoLuongMau();
        qlnv.hienThiMauThongTinChungCuaNhanVan();
        qlnv.hienThiDanhSachNhanVat();
        
        System.out.println("\n=== Sap xep nhan vat giam dan theo so luot choi ===");
        qlnv.sapXepNVGiamDanTheoSoLuongLuotChoi();
        qlnv.hienThiMauThongTinChungCuaNhanVan();
        qlnv.hienThiDanhSachNhanVat();
    }
}
